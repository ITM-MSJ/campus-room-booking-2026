# Issue 9 — Robustly import bookings from CSV

## User need

As a user, I want the application to load valid booking records even when some CSV rows contain bad data.

## File to implement

`BookingStore.java`

## Provided API

```java
List<Booking> BookingStore.load(Path path)
```

## CSV format

```text
id,userId,roomId,start,end,attendees,purpose,status
```

Example row:

```text
1,s2026001,R101,2026-10-02T10:00,2026-10-02T11:00,2,Project meeting,ACTIVE
```

## Simplified CSV rule

For this assignment, fields do not contain commas.

You do **not** need to implement a general RFC-compliant CSV parser.

## Required behavior

- skip the header when present;
- parse valid rows into `Booking` objects;
- trim surrounding whitespace;
- skip blank rows;
- skip malformed rows;
- continue processing after a malformed row.

A malformed row includes, for example:

- wrong number of columns;
- invalid booking ID;
- invalid attendee number;
- invalid date/time;
- invalid status;
- blank user ID;
- blank room ID;
- `start >= end`;
- `attendees <= 0`.

## Missing/empty input

- null path → empty list;
- missing file → empty list;
- empty file → empty list.

## Critical requirement

One bad row must **not** prevent valid rows appearing later in the file from loading.

## Independence rule

Do not call `BookingValidator.validate()`.

## Testing requirement

Include a file containing:

```text
valid row
malformed row
valid row
```

and verify that both valid rows are returned.

## Shared scope

Read `docs/ASSUMPTIONS.md` in the course repository.

Use UTF-8. Surrounding whitespace is trimmed for each field. ACTIVE and CANCELLED are required status tokens; accepting lowercase is optional. A valid ID is a parseable Java int; positive-only IDs and duplicate detection are not required. Empty purpose is allowed. Preserve valid-row order. Other I/O errors are outside grading scope.
