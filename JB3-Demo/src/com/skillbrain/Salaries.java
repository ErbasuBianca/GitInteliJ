package com.skillbrain;

import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {

        Staff staff = new Staff();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti salariu minim pe economie din tara dumneavoastra in lei");
        while (!scanner.hasNextInt()){
            System.out.println("Valoarea introdusa nu este un integer valid! Mai incercati o data!");
            scanner.next();
        }
        int salariuMinim = scanner.nextInt();

        System.out.println("Introduceti salariu mediu pe economie din tara dumneavoastra in lei");
        while (!scanner.hasNextInt()){
            System.out.println("Valoarea introdusa nu este un integer valid! Mai incercati o data!");
            scanner.next();
        }
        int salariuMediu = scanner.nextInt();

        int salariuMinimPeOra = salariuMinim/160;
        int salariuMediuPeOra = salariuMediu/160;

        staff.addEmployee(new Seller("Alexandra", "Bostan", 45, "1995", salariuMinim));
        staff.addEmployee(new Tehnician("Leonrad", "Veres", 28, "2010", salariuMediu));
        staff.addEmployee(new Warehouseman("Cosmin", "Ureche", 35, "2015", salariuMinimPeOra));
        staff.addEmployee(new TechnincianRisk("Matilda", "Anastasia", 30, "2009", salariuMediuPeOra));
        staff.addEmployee(new HandlingRisk("Marius", "Costin", 42, "2004", salariuMediuPeOra));



        staff.showSalaries();
        System.out.println("Salariu mediu in companie este : " + staff.averageSalary());
        staff.showEmployees();

    }
}