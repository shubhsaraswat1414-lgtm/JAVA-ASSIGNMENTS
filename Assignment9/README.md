# Assignment 9: Student Record File Manager

## Overview
The Student Record File Manager is a Java console application developed for **Unit 5: File Handling in Java**. It demonstrates core file operations using Java's `File`, `FileInputStream`, and `FileOutputStream` classes wrapped in defensive exception handling.

The program creates a dedicated directory and text file to store student records, providing a menu-driven interface to write, display file metadata, read byte-by-byte, append records without overwriting, and delete record files.

---

## Concepts Covered

1. **`File` Directory & File Operations (`mkdir()`, `exists()`, `createNewFile()`)**:
   - Creates the `StudentRecords` directory using `mkdir()`.
   - Checks file existence using `exists()` before creating `student.txt` using `createNewFile()`.

2. **File Metadata Retrieval**:
   - Queries and displays file properties using:
     - `getName()`: Returns file name.
     - `getPath()`: Returns relative path.
     - `getAbsolutePath()`: Returns complete filesystem path.
     - `length()`: Returns file size in bytes.
     - `isFile()`: Verifies if the path denotes a normal file.
     - `isDirectory()`: Verifies if the path denotes a directory.

3. **Writing Records (`FileOutputStream`)**:
   - Converts `String` data into raw byte arrays using `getBytes()`.
   - Writes records to file using `write()` and closes streams safely.

4. **Reading Records (`FileInputStream`)**:
   - Reads file data byte-by-byte using `read()` until end-of-file (`-1`).
   - Converts each byte back to character representation for console display.

5. **Append Mode (`FileOutputStream(file, true)`)**:
   - Uses the two-argument constructor with `append = true` to write new records to the end of the file without overwriting existing data.

6. **Deleting Records (`delete()`)**:
   - Deletes the record file from disk using `delete()` and reports operation status.

7. **Exception Handling & Menu Routing**:
   - Wraps all file operations in `try-catch` blocks handling `IOException`.
   - Repeated interactive menu loop using `do-while` and `switch`.

---

## Code Structure

```
Assignment9/
├── StudentRecordFileManager.java  # Core implementation with menu and file operations
├── Main.java                      # Driver class
└── README.md                      # Documentation and execution guide
```

---

## Sample Console Interaction

```text
===== Student Record File Manager =====
1. Create Records Directory
2. Create Record File
3. Write Student Record
4. Display File Information
5. Read File Content
6. Append New Record
7. Delete Record File
8. Exit
Enter your choice: 1
Directory created: StudentRecords

===== Student Record File Manager =====
...
Enter your choice: 2
File created: StudentRecords/student.txt

===== Student Record File Manager =====
...
Enter your choice: 3
Enter Student Record (e.g., Roll No 101, Rahul Sharma, B.Tech CE): Roll No 101, Rahul Sharma, B.Tech CE
Record written successfully.

===== Student Record File Manager =====
...
Enter your choice: 4
===== File Information =====
Name          : student.txt
Path          : StudentRecords/student.txt
Absolute Path : /Users/ankitrajjha/java-Assign/StudentRecords/student.txt
Size          : 37 bytes
Is File       : true
Is Directory  : false

===== Student Record File Manager =====
...
Enter your choice: 5
===== File Content =====
Roll No 101, Rahul Sharma, B.Tech CE

===== Student Record File Manager =====
...
Enter your choice: 6
Enter Student Record to Append (e.g., Roll No 102, Priya Verma, B.Tech IT): Roll No 102, Priya Verma, B.Tech IT
Record appended successfully.

===== Student Record File Manager =====
...
Enter your choice: 5
===== File Content =====
Roll No 101, Rahul Sharma, B.Tech CE
Roll No 102, Priya Verma, B.Tech IT

===== Student Record File Manager =====
...
Enter your choice: 7
File deleted successfully.

===== Student Record File Manager =====
...
Enter your choice: 8
Exiting Student Record File Manager. Goodbye!
```

---

## How to Compile & Run

### From Repository Root:

```bash
# Compile
javac -d . Assignment9/*.java

# Run via Main
java Assignment9.Main

# Or Run via StudentRecordFileManager
java Assignment9.StudentRecordFileManager
```
