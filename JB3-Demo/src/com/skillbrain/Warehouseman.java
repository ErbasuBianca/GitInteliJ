package com.skillbrain;

public class Warehouseman extends Employee{

    Warehouseman(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;
    }

    @Override
    double calculateSalary() {
        return 2.7 * 160 * reference;
    }

    @Override
    String getName() {
        return "Angajatul care gestioneaza marfuri se numeste "  + firstName + " " + lastName;
    }
}
