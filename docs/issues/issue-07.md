# Issue 7 — Calculate room utilization

## User need

As a campus administrator, I want to measure how much a room is used during its operating hours on a given date.

## File to implement

`RoomUtilizationService.java`

## Provided API

```java
RoomUsage RoomUtilizationService.summarize(
    List<Booking> bookings,
    String roomId,
    LocalDate date,
    LocalTime openTime,
    LocalTime closeTime)
```

`RoomUsage` is already provided.

## Required output

Calculate:

- number of active bookings that overlap the operating window;
- total booked minutes **inside** the operating window;
- utilization percentage.

```text
utilizationPercent =
    bookedMinutes / availableOperatingMinutes × 100
```

Round utilization percentage to **2 decimal places using HALF_UP**.

## Required behavior

- ignore cancelled bookings;
- ignore bookings for other rooms;
- clip a booking to the operating window before counting its minutes;
- a booking with no overlap contributes nothing.

Example:

```text
Operating window: 09:00–17:00
Booking:          08:30–10:00
Counted time:     09:00–10:00 = 60 minutes
```

## Validation

Throw `IllegalArgumentException` for:

- blank/null room ID;
- null date/open/close values;
- `openTime >= closeTime`.

## Assumption

For this Issue, input data may assume that active bookings for the same room do not overlap each other.

You do not need to implement interval-union logic.

## Testing requirement

Include at least one booking partially outside the operating window.

## Shared scope

Read `docs/ASSUMPTIONS.md` in the course repository.
