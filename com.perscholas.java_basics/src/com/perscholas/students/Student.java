package com.perscholas.students;

public class Student {           // publis Class Student to hold Student information
    private String name;         // Instantiate variable name
    private String dateOfBirth;  // Instantiates variable dateOfBirth
    private boolean hasStudentHousing;  // Instantiates boolean variable hasStudentHousing

    public void setName(String name){  // Setter for name
        this.name = name;
    }

    public String getName() {  // getter for name
        return name;
    }

    public String getDateOfBirth() {  // getter for dateOfBirth
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) { // setter for dateOfBirth
        this.dateOfBirth = dateOfBirth;
    }

    public boolean hasStudentHousing() {  // getter for boolean hasStudentHousing
        return hasStudentHousing;
    }

    public void hasStudentHousing(boolean hasStudentHousing) {  // setter for hasStudentHousing
        this.hasStudentHousing = hasStudentHousing;
    }
}
