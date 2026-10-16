# Issue 5 — Filter bookings using multiple criteria

## User need

As a user, I want to filter booking records using one or more criteria.

## File to implement

`BookingFilter.java`

## Provided API

```java
List<Booking> BookingFilter.filter(
    List<Booking> bookings,
    String userId,
    String roomId,
    BookingStatus status,
    Integer minAttendees)
```

## Required behavior

Supported criteria:

- user ID;
- room ID;
- booking status;
- minimum attendee count.

## Optional criteria

A criterion is not applied when:

- `userId` is null or blank;
- `roomId` is null or blank;
- `status` is null;
- `minAttendees` is null.

All supplied criteria combine using **AND**.

## Matching policy

- user ID matching is case-insensitive;
- room ID matching is case-insensitive.

## Additional behavior

- Preserve the original booking order.
- No matches → empty list.
- Do not modify the supplied list.
- If `minAttendees <= 0`, throw `IllegalArgumentException`.

## Testing requirement

At least one test must combine two or more filters.

## Shared scope

Read `docs/ASSUMPTIONS.md` in the course repository.

Only String criteria can be blank; null omits status and minAttendees. Trim supplied userId/roomId criteria before matching.
