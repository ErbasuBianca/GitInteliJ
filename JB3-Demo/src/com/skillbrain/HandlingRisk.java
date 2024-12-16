package com.skillbrain;

public class HandlingRisk extends Warehouseman implements EmployeeRisk{


    HandlingRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
    }

    @Override
    public void handleRisk() {
        System.out.println("Gestionez marfuri care implica risc inalt si beneficiez de un spor extra");
    }

    @Override
    public double calculateSalary(){
        return 2.7 *160* reference + monthlyPremium;
    }

    @Override
    String getName(){
        return "Anagajatul care gestioneaza marfuri cu risc se numeste " + firstName + " " + lastName;
    }


}
