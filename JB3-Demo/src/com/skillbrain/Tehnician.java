package com.skillbrain;

public class Tehnician extends Employee{

    Tehnician(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;
    }

    @Override
    double calculateSalary() {
        return 3 * reference;
    }

    @Override
    String getName() {
        return "Tehnicianul se numeste "  + firstName + " " + lastName;
    }
}
