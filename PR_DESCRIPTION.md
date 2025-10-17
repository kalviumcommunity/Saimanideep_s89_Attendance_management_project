Title: feat: Demonstrate polymorphism with Person hierarchy and update AttendanceRecord (Part 7)

Description:
- Implemented `AttendanceRecord` which derives attendance status polymorphically from `Person` (Students → Present/Absent; Teachers/Staff → N/A).
- Updated `Main` to build a polymorphic `List<Person>` (School Directory), display entries via runtime polymorphism, produce an Attendance Log, and persist records using `FileStorageService`.
- Persisted files: `students.txt`, `courses.txt`, `Attendance_log.txt`.

How to test locally:
1. javac src/com/school/*.java
2. java -cp src com.school.Main

Files to check in the repo root after running:
- students.txt
- courses.txt
- Attendance_log.txt
- console_output.txt (this file contains a captured run of the program)

Notes for reviewers:
- The change is confined to `src/com/school/*` and README updates.
- No external libraries were added.

Screenshots requested:
1. Console output after running the program (showing the "School Directory" and "Attendance Log").
2. `students.txt`, `courses.txt`, `Attendance_log.txt` open in the editor or printed.
3. Git push confirmation or the branch view on GitHub showing `part-07`.

If you prefer, I can open a PR body on GitHub text you can paste directly into the new PR page.
