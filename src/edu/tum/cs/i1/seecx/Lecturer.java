package edu.tum.cs.i1.seecx;

import java.util.List;

public class Lecturer extends Person {
    public List<Course> courseList;
    public int employeeID;

    public Lecturer(String firstName, String lastName, String birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    public void printPersonalInformation() {
        System.out.println("Lecturer: " + firstName + " " + lastName + " " + birthDate + " " + employeeID);
    }
}