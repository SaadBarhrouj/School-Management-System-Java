# SchoolManagementSystem

A simple Java project to manage information for a school, including students, teachers, and grades. This project allows adding, removing, and searching for students and teachers, as well as listing all students and teachers.

## Features

- Add and remove students
- Add and remove teachers
- Add and remove grades
- Search for students by name
- Search for teachers by name
- Search for grades by code
- List all students
- List all teachers

## Structure

The project contains the following packages and classes:

### models

- `School`: Represents a school with lists of students, teachers, and grades.
- `Student`: Represents a student with attributes like name, age, and parent phone number.
- `Teacher`: Represents a teacher with attributes like name and subject.
- `Grade`: Represents a grade with attributes like code and description.

### services

- `SchoolServices`: Provides methods to manage the school's data, including adding, removing, and searching for students, teachers, and grades.

### main

- `Hmi`: The main class to interact with the user, providing a command-line interface to manage the school data.



