# Issue 8 — Enforce a daily booking-time quota

## User need

As a campus administrator, I want to limit how many minutes one user can book rooms per day.

## File to implement

`BookingQuotaService.java`

## Provided API

```java
QuotaResult BookingQuotaService.checkDailyQuota(
    List<Booking> existing,
    Booking proposed,
    long maxMinutesPerDay)
```

`QuotaResult` is already provided.

## Required behavior

Calculate:

```text
minutesAfterBooking =
    active existing minutes for same user on same date
    + proposed booking minutes
```

Return:

- whether the proposed booking is allowed;
- `minutesAfterBooking`.

## Rules

- same-user matching is case-insensitive;
- only bookings on the proposed booking's start date count;
- cancelled bookings do not count;
- bookings from other users do not count;
- bookings on other dates do not count;
- the proposed booking itself always counts;
- an exact quota match is allowed.

Example:

```text
Daily maximum:       240 minutes
Existing today:      150 minutes
Proposed:             90 minutes
minutesAfterBooking: 240
allowed:              true
```

Throw `IllegalArgumentException` if:

- `proposed` is null;
- `maxMinutesPerDay <= 0`.

Assume the proposed booking has a valid start/end time.

## Testing requirement

Include exact-limit, over-limit, different-user, and different-date cases.

## Shared scope

Read `docs/ASSUMPTIONS.md` in the course repository.
