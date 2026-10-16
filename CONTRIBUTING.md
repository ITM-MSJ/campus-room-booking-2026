# Contributing to Campus Room Booking

This repository is used in ITM428 Assignment 2.

## Educational purpose

This repository is used for a teaching assignment in the Open Source Software module at SeoulTech. Contributions are reserved for students currently enrolled in the module and the teaching team.

If you are not participating in the module, you are welcome to explore the repository, but please refrain from opening issues or submitting pull requests. This helps preserve the planned learning activities and assessment process for our students.

Thank you for your understanding.


## Team contribution workflow

1. Read your assigned GitHub Issue completely.
2. Create the required feature branch in your team's working repository/fork.
3. Implement only the assigned feature.
4. Add meaningful JUnit tests.
5. Run:

   ```bash
   mvn -B verify
   ```

6. Push the branch and open a Pull Request to the course repository.
7. Complete the Pull Request template.
8. Confirm that GitHub Actions CI passes.
9. Wait for the assigned peer-review team.
10. Respond to review comments.
11. Revise the code when appropriate.
12. If you reject a review suggestion, explain the technical reason in the review thread.
13. Request re-review when the PR is ready.
14. The TA performs the final squash merge.

## Review expectations

Each reviewer must make at least one identifiable substantive review contribution.

Useful review topics include:

- correctness;
- missing requirements;
- edge cases;
- test quality;
- error handling;
- maintainability;
- design/readability.

A reviewer may also provide positive verification of an important behavior when they explain what they checked and why they believe it is correct.

Do not create comments only to satisfy a quota.

## Scope

Do not implement another team's Issue unless the TA explicitly asks you to do so.

All primary Issues are designed to be independently solvable from the starter repository.
