Java Student Record System
This is a simple command-line application built in Java for managing student records. It allows users to perform basic CRUD (Create, Read, Update, Delete) operations on student data.

Table of Contents
Features

Technologies Used

Getting Started

Prerequisites

Project Structure

Compilation and Execution

Usage

How it Works

Data Persistence

License

Features
The application provides the following functionalities through a text-based menu:

Add Student: Allows the user to input a student's roll number, name, and course, and add them to the system.

View All Students: Displays a list of all students currently in the database.

Search Student by Roll No: Finds and displays the details of a student using their unique roll number.

Delete Student: Removes a student record from the system based on their roll number.

Exit: Terminates the application.

Technologies Used
Java: The core programming language.

Standard Java Libraries: java.util.Scanner for user input.

Getting Started
To get this project up and running on your local machine, follow the instructions below.

Prerequisites
Java Development Kit (JDK): You need to have a JDK installed on your system (version 8 or higher is recommended). You can download it from the Oracle website or use an open-source distribution like OpenJDK.

Project Structure
This project is expected to consist of three Java files:

.
├── Main.java
├── Student.java
└── StudentDatabase.java

Main.java: Contains the main method, which serves as the entry point for the application. It handles the user interface and interacts with the StudentDatabase.

Student.java: (Assumed) Defines the Student class, representing a single student record with properties like roll number, name, and course.

StudentDatabase.java: (Assumed) Manages the collection of Student objects, providing methods for adding, viewing, searching, and deleting students.

Compilation and Execution
Save the files: Save Main.java, Student.java, and StudentDatabase.java in the same directory (e.g., StudentRecordSystem).

Open a terminal or command prompt: Navigate to the directory where you saved your Java files.

cd path/to/StudentRecordSystem

Compile the Java files: Use the Java compiler (javac) to compile all .java files.

javac Main.java Student.java StudentDatabase.java

If there are no errors, this will generate .class files (e.g., Main.class, Student.class, StudentDatabase.class) in the same directory.

Run the application: Execute the Main class using the Java Virtual Machine (java).

java Main

Usage
Once the application is running, you will see a menu of options. Enter the number corresponding to the action you wish to perform and follow the prompts.

--- Student Record System ---
1. Add Student
2. View All Students
3. Search Student by Roll No
4. Delete Student
5. Exit
Choose an option:

How it Works
The Main class provides the command-line interface.

It uses a Scanner object to read user input.

A StudentDatabase object (an instance of the StudentDatabase class) is used to manage the student data.

The program runs in a while(true) loop, continuously displaying the menu until the user chooses option 5 to exit.

A switch statement handles the user's choice, calling the appropriate methods on the StudentDatabase object.

Data Persistence
Please note that this application stores student data in memory during its runtime. This means that all data added, modified, or deleted will be lost once the application is closed. For permanent storage, the application would need to be extended to use a database (e.g., SQLite, MySQL) or file-based storage.
