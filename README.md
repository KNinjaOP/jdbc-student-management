# JDBC Student Management System

A console-based student management system built with Java JDBC and
MySQL.

This project was created to learn how Java applications communicate with
a relational database using JDBC.

## Features

-   Add a student
-   View all students
-   Search for a student by ID
-   Update a student's course
-   Delete a student
-   MySQL database connectivity

## Tech Stack

-   Java
-   JDBC
-   MySQL

## Project Structure

-   `DBConnection.java` --- handles the connection between the Java
    application and MySQL
-   `Main.java` --- contains the console menu and handles user input
-   `Student.java` --- represents a student object
-   `StudentDAO.java` --- contains database operations for students
-   `lib/` --- contains the MySQL Connector/J library

## Database

The project expects a MySQL database named `studentdb`.

Create the database and table with:

``` sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    course VARCHAR(100)
);
```

## Running the Project

1.  Install Java and MySQL.
2.  Create the `studentdb` database and `students` table.
3.  Update the database username and password in `DBConnection.java`.
4.  Make sure the MySQL Connector/J library is available.
5.  Compile and run `Main.java`.

## Note

This is a learning project created to understand JDBC, SQL queries,
prepared statements, database connections, and basic DAO-based database
operations.
