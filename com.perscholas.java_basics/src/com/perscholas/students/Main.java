package com.perscholas.students;

public class Main {                              // Main Class
    public static void main(String[] args) {     // main method
        Student student = new Student();         // instantiates a new instance of Student
        student.setName("Joe Bloggs");           // student uses setter for Student Class setName
        student.setDateOfBirth("12/01/1901");    // student uses setter for Student Class setDateOfBirth
        student.hasStudentHousing(true);         // student used setter for Student Class hasStudentHousing
        System.out.println("Name: "+ student.getName());   // Prints out student name
        System.out.println("DOB: "+ student.getDateOfBirth());  // Prints students date of birth
        System.out.println("Has student housing: " +student.hasStudentHousing()); // prints students student housing status
    }
}
