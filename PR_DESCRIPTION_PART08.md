Title: feat: Implement AttendanceService with overloaded methods (Part 8)

Description:
- Implemented `AttendanceService` which provides overloaded methods to mark students present by id, name, Student object, and bulk id list.
- Added query overloads to get attendance by id, name, or Student object.
- Updated `Main` to demonstrate overloaded calls and to print query results and the attendance log.

How to test locally
1. javac src/com/school/*.java
2. java -cp src com.school.Main

What to check after running
- Console output shows "Attendance queries (overloaded)" and the updated Attendance Log.
- `Attendance_log.txt` contains the persisted attendance lines.

Attached files to review
- `console_output.txt` — captured run output
- `students.txt`, `courses.txt`, `Attendance_log.txt` — produced files

Suggested PR title: feat: Implement AttendanceService with overloaded methods (Part 8)

Screenshots requested:
1. Console output (showing Attendance queries and Attendance Log)
2. `Attendance_log.txt` open/printed
3. Commit/push confirmation or the PR page on GitHub

Notes:
- No external libraries added.
- Base branch assumed: `main`.
