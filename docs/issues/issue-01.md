# Issue 1 — Validate booking rules

## User need

As a campus user, I want invalid room bookings rejected before they enter the system.

## File to implement

`BookingValidator.java`

## Provided API

```java
BookingValidator.validate(
    Booking booking,
    Room room,
    LocalTime openTime,
    LocalTime closeTime,
    long maxDurationMinutes)
```

A valid booking returns normally. An invalid booking must throw `IllegalArgumentException` with a clear message.

## Required behavior

Reject the booking when any of the following is true:

- `booking` is `null`;
- `room` is `null`;
- `userId` is null or blank;
- `roomId` is null or blank;
- the booking's `roomId` does not equal the supplied room's ID;
- `start` or `end` is `null`;
- `start` is not before `end`;
- start and end are on different calendar dates;
- `attendees <= 0`;
- attendees exceed the room capacity;
- `openTime` / `closeTime` are invalid;
- the booking begins before `openTime`;
- the booking ends after `closeTime`;
- `maxDurationMinutes <= 0`;
- the booking duration exceeds `maxDurationMinutes`;
- booking status is `null`.

## Boundary rules

- A booking may start **exactly** at `openTime`.
- A booking may end **exactly** at `closeTime`.
- A booking whose duration is **exactly** `maxDurationMinutes` is valid.

## Testing requirement

Include a meaningful happy-path test and multiple edge/invalid cases. Do not put all scenarios into one very large test method.

## Shared scope

Read `docs/ASSUMPTIONS.md` in the course repository.

Invalid operating hours means null open/close or openTime >= closeTime. Room IDs match exactly.
