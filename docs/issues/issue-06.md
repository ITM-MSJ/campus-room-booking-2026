# Issue 6 — Produce a user booking summary

## User need

As a campus user, I want a summary of my active room-booking activity.

## File to implement

`UserSummaryService.java`

## Provided API

```java
UserBookingSummary UserSummaryService.summarize(
    List<Booking> bookings,
    String userId)
```

`UserBookingSummary` is already provided.

## Required output

For the requested user, calculate from **ACTIVE** bookings only:

- `bookingCount`;
- `totalMinutes`;
- `distinctRooms`;
- `averageMinutes`.

## Matching and calculation rules

- user ID matching is case-insensitive;
- cancelled bookings are ignored;
- booking duration is `Duration.between(start, end).toMinutes()`;
- `averageMinutes = totalMinutes / bookingCount`.

If the user has no active bookings:

```text
bookingCount = 0
totalMinutes = 0
distinctRooms = 0
averageMinutes = 0.0
```

Blank/null `userId` must throw `IllegalArgumentException`.

## Testing requirement

Include a case where the same user has bookings in more than one room and at least one cancelled booking.

## Shared scope

Read `docs/ASSUMPTIONS.md` in the course repository.

Use floating-point division for averageMinutes. Trim the requested userId before matching.
