# Issue 2 — Detect booking time conflicts

## User need

As a campus user, I want the system to detect when a proposed booking overlaps an existing active booking for the same room.

## File to implement

`ConflictService.java`

## Provided API

```java
boolean ConflictService.hasConflict(
    List<Booking> existing,
    Booking proposed)
```

## Assumptions

The supplied bookings have valid start/end times. This Issue is about **conflict detection**, not general booking validation.

## Required behavior

Return `true` when an **ACTIVE** existing booking:

1. uses the same room as the proposed booking; and
2. overlaps the proposed booking in time.

Return `false` otherwise.

## Boundary rule

Bookings that only touch at a boundary do **not** conflict.

Example:

```text
Existing: 10:00–11:00
Proposed: 11:00–12:00
Result: no conflict
```

## Other rules

- Bookings in different rooms do not conflict.
- `CANCELLED` bookings do not conflict.
- Assume room IDs use exact ID matching.

## Testing requirement

Tests should include:

- partial overlap;
- one interval contained inside another;
- exact boundary;
- different room;
- cancelled booking.

## Shared scope

Read `docs/ASSUMPTIONS.md` in the course repository.
