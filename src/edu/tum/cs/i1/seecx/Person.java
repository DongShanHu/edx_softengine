package edu.tum.cs.i1.seecx;

public abstract class Person {
    public String firstName;
    public String lastName;
    public String birthDate;

    public Person() {
    }

    public Person(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public abstract void printPersonalInformation();
}