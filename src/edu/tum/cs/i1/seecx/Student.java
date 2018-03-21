package edu.tum.cs.i1.seecx;

import java.util.List;

public class Student extends Person {
    public String majorSubject;
    public String minorSubject;
    public List<Course> courseList;
    public int studentID;

    public Student(String firstName, String lastName, String birthDate, String majorSubject, String minorSubject) {
        super(firstName, lastName, birthDate);
        this.majorSubject = majorSubject;
        this.minorSubject = minorSubject;
    }

    @Override
    public void printPersonalInformation() {
        System.out.println("Student: " + firstName + " " + lastName + " " + birthDate + " " + studentID);
    }
}