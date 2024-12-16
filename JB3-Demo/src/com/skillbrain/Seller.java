package com.skillbrain;

public class Seller extends Employee{


    Seller(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;
    }

    @Override
    double calculateSalary() {
        return 2 * reference;
    }

    @Override
    String getName() {
        return "Vanzatorul se numeste " + firstName + " " + lastName;
    }
}
