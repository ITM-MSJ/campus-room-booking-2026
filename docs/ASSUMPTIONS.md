# Common assignment assumptions

These scope clarifications apply to every Issue unless its own validation rules say otherwise.

- Lists are non-null and contain non-null records. Records have valid nonblank IDs, times and status, except for inputs an Issue explicitly requires you to reject.
- Times use whole minutes (seconds and nanoseconds are zero). No timezone conversion is required.
- Room IDs use exact matching except I5, which explicitly uses case-insensitive filtering. I6 counts distinct canonical room IDs exactly.
- Supplied existing bookings are valid same-day bookings, except I7, where clipping also supports a booking spanning the operating window's date boundary.
- I4 starts with unique booking IDs; update copies every replacement field including status except ID. No full booking validation is required.
- I8 is a new-booking calculation: the proposed booking is not already in the existing list. Compare existing start dates to its start date; the proposed booking always counts.
- Unless explicitly required, malformed list elements, duplicate IDs, exotic I/O failures and sub-minute times are outside the assessed scope.
- Preserve supplied public method signatures. No CLI integration is required.
