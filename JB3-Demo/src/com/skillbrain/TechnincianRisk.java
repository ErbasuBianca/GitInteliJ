package com.skillbrain;

public class TechnincianRisk extends Tehnician implements EmployeeRisk {

    TechnincianRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
    }

    @Override
    public void handleRisk() {
        System.out.println("Lucrez intr-un mediu cu risc inalt si beneficiez de un spor extra");
    }

    @Override
    public double calculateSalary(){
        return 3 * reference + monthlyPremium;
    }

    @Override
    String getName(){
        return "Tehnicianul cu risc se numeste " + firstName + " " + lastName;
    }

}
