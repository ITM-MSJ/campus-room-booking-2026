# Issue 3 — Find available rooms

## User need

As a campus user, I want to find rooms that are large enough and not already booked during my requested time.

## File to implement

`AvailabilityService.java`

## Provided API

```java
List<Room> AvailabilityService.findAvailableRooms(
    List<Room> rooms,
    List<Booking> bookings,
    LocalDateTime start,
    LocalDateTime end,
    int minCapacity)
```

## Required behavior

A room is returned only when:

- `room.capacity >= minCapacity`; and
- the room has no overlapping **ACTIVE** booking during the requested interval.

## Validation / edge behavior

- `start` and `end` must be non-null.
- `start` must be before `end`.
- `minCapacity` must be greater than zero.
- `CANCELLED` bookings do not block a room.
- Exact touching boundaries do not overlap.
- If no rooms qualify, return an empty list.
- Preserve the order of the input room list.

## Independence rule

Do not call `ConflictService.hasConflict()`.

Each primary Issue must work independently from the starter repository.

## Testing requirement

Include tests that combine capacity and time availability, not only one condition at a time.

## Shared scope

Read `docs/ASSUMPTIONS.md` in the course repository.

Invalid start/end or minCapacity must throw IllegalArgumentException.
