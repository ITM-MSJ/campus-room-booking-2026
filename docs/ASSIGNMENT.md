# ITM428 Open Source Software
## Assignment 2 — Campus Room Booking Contribution & Review Sprint

**Type:** Team implementation process + individual review/evidence  
**Course points:** 8 points  
**Release:** Week 7, Friday after class  
**Implementation PR ready for review:** Week 8, Wednesday 18:00  
**Peer-review deadline:** Week 9, Monday 23:59  
**Final submission deadline:** Week 9, Thursday 23:59  

**Technical environment:** Java 17 + Maven + JUnit 5 + GitHub  
**Team structure:** 9 teams × 3 students

---

# 1. Purpose

Assignment 2 practices one complete open-source contribution cycle:

**Issue → implementation → tests → Pull Request → CI → peer review → revision → approval**

The size of the feature is not the main objective. The main objective is to implement, verify, review, and revise software through a traceable OSS workflow.

---

# 2. Application

The shared application is a **Campus Room Booking System**.

The starter repository already provides:

- `Room` and `Booking` models;
- sample rooms/bookings;
- Maven/JUnit configuration;
- a minimal runnable application;
- GitHub Actions CI;
- one incomplete feature file for each of the nine assigned Issues.

Each team implements one Issue.

---

# 3. Team implementation

Your team must:

1. read the assigned Issue;
2. work from the provided starter repository;
3. implement only the assigned feature;
4. add meaningful JUnit tests;
5. open a Pull Request linked to the Issue;
6. complete the PR template;
7. make GitHub Actions CI pass.

The nine Issues are designed to be independently solvable.

Do not implement another team's Issue unless the TA explicitly instructs you to do so.

---

# 4. Peer review

Each team is assigned another team's Pull Request to review.

Every student must make at least **one identifiable substantive review contribution**.

A substantive review may address:

- correctness;
- a missing requirement;
- an edge case;
- test quality;
- error handling;
- maintainability;
- design/readability.

A review may also provide **positive verification** of an important behavior when you explain what you checked and why you believe the code is correct.

You do not need to invent a criticism when the code is correct.

The reviewing team should collectively consider:

1. implementation behavior/correctness;
2. tests/edge cases;
3. maintainability/readability.

---

# 5. Revision

After peer review, the implementing team must:

1. read the feedback;
2. make appropriate changes;
3. reply to review comments;
4. rerun tests/CI;
5. request re-review when ready.

A review suggestion does not have to be accepted automatically.

If the team rejects a suggestion, explain the technical reason in the review thread.

The TA performs the final merge.

---

# 6. Individual submission

Each student uploads one Markdown file to e-class:

`A2_StudentID.md`

Use the provided template.

The file contains direct GitHub links to:

- the assigned Issue;
- implementation PR;
- your implementation contribution;
- tests/CI;
- the PR you reviewed;
- your main review contribution;
- response/revision evidence;
- AI-use declaration.

Use stable GitHub links instead of screenshots whenever possible.

---

# 7. AI use

AI tools may be used according to the course AI policy.

AI use itself is not a grading penalty.

You remain responsible for:

- understanding your contribution;
- checking generated code;
- checking generated tests;
- verifying behavior;
- reviewing other students' contributions critically;
- explaining important technical decisions.

Complete the AI-use section in your individual Markdown submission.

---

# 8. Evaluation

The assignment is worth **10 course points**.

The internal rubric is scored out of **40 raw points**:

| Criterion | Scope | Raw points |
|---|---|---:|
| OSS/Git workflow | Team | 8 |
| Implementation and testing | Team | 8 |
| Code-review quality | Individual | 14 |
| Response to feedback and technical communication | Individual | 10 |
| **Total** |  | **40** |

Course points:

```text
course points = raw score / 4
```
