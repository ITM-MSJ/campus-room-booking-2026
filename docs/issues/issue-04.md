# Issue 4 — Update and cancel bookings

## User need

As a campus user, I want to correct an existing booking or cancel it without losing the booking identity.

## File to implement

`BookingBook.java`

Implement both methods:

```java
Booking update(int id, Booking replacement)
Booking cancel(int id)
```

## Update behavior

- Find the booking whose ID equals `id`.
- Replace its editable values with those in `replacement`.
- Preserve the original target ID even if `replacement` contains another ID.
- Return the updated booking.

## Cancel behavior

- Find the booking whose ID equals `id`.
- Change its status to `CANCELLED`.
- Preserve all other booking information.
- Return the cancelled booking.
- Cancelling an already-cancelled booking is allowed and leaves it cancelled.

## Invalid behavior

Throw `IllegalArgumentException` when:

- `replacement` is `null`;
- an update ID does not exist;
- a cancel ID does not exist.

A failed operation must not partially modify the booking collection.

## Independence rule

Do not call `BookingValidator.validate()`.

## Testing requirement

Include at least one test verifying that a failed update leaves the collection unchanged.

## Shared scope

Read `docs/ASSUMPTIONS.md` in the course repository.
