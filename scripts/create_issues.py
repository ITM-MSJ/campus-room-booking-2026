"""Run using the manual GitHub workflow, or locally with authenticated gh.
Existing issues (open or closed) are preserved. Exact-title matching prevents
normal repeat runs from creating duplicates; renamed issues require inspection.
"""
import json
import os
from pathlib import Path
import subprocess

def gh(*args):
    return subprocess.check_output(["gh", *args], text=True).strip()

def main():
    repo = os.environ["GH_REPO"]
    root = Path(__file__).resolve().parents[1]
    for name, color, description in [("assignment-2", "0052CC", "ITM428 Assignment 2")] + [
        (f"team-{i:02}", "0E8A16", f"Assigned to Team {i}") for i in range(1, 10)
    ]:
        gh("label", "create", name, "--repo", repo, "--color", color,
           "--description", description, "--force")
    pages = json.loads(gh("api", "--paginate", "--slurp",
                          f"repos/{repo}/issues?state=all&per_page=100"))
    existing = {item["title"]: item["html_url"] for page in pages
                for item in page if "pull_request" not in item}
    for path in sorted((root / "docs/issues").glob("issue-*.md")):
        title = path.read_text(encoding="utf-8").splitlines()[0].removeprefix("# ")
        if title in existing:
            print("Exists:", existing[title])
            continue
        url = gh("issue", "create", "--repo", repo, "--title", title,
                 "--body-file", str(path), "--label", "assignment-2")
        existing[title] = url
        print("Created:", url)
    print("Apply team labels after choosing assignments. Use actual GitHub issue numbers in PRs.")

if __name__ == "__main__":
    main()
