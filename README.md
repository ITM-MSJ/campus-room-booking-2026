# Campus Room Booking — ITM428 Assignment 2

This repository is the shared codebase for **ITM428 Open Source Software — Assignment 2**.

The application models simple campus study-room reservations. The assignment focuses on the open-source contribution process:

**Issue → implementation → unit tests → Pull Request → CI → peer review → revision → approval**

## Technology

- Java 17
- Maven
- JUnit 5
- GitHub Issues and Pull Requests
- GitHub Actions

## Starter application

The starter version can:

- list sample rooms;
- list sample bookings;
- demonstrate the core `Room` and `Booking` domain objects.

The assignment features are intentionally incomplete. Each team implements one Issue.

## Run the baseline tests

```bash
mvn -B verify
```

## Run the application

Compile with Maven and run `itm.oss.booking.App` from your IDE, or use your normal Java run configuration.

## Important rules

- Work only on your assigned Issue.
- Add tests for your implementation.
- Do not merge your own Pull Request.
- The assigned peer team reviews your PR.
- Respond to review comments and revise when appropriate.
- GitHub Actions CI must pass before final approval.
- The TA performs the final squash merge.

See:

- `CONTRIBUTING.md`
- `TEAMS.md`
- your assigned GitHub Issue

## Assignment phases and evidence

Read [the assignment](docs/ASSIGNMENT.md), [common assumptions](docs/ASSUMPTIONS.md),
and [the individual evidence template](docs/A2_StudentID_TEMPLATE.md).
Phase deadlines are announced on e-class by the instructor.

1. Implement and test your assigned feature; open one team PR.
2. Each member reviews the assigned other team's PR.
3. Respond, revise, request re-review, and submit individual evidence to e-class.

Run the starter demonstration after `mvn -B verify`:

```bash
java -cp target/classes itm.oss.booking.App
```

Green baseline CI verifies the supplied model/example tests only. It does not
mean any of the nine intentionally unfinished features is implemented.
