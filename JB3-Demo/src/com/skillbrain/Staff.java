package com.skillbrain;

import java.util.ArrayList;

public class Staff {

    ArrayList<Employee> employeesList;

    Staff(){
        employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }

    public void showSalaries(){
        for (Employee employee : employeesList){
            System.out.println(employee.getName() + ", care castiga " + employee.calculateSalary() +  " lei.");
        }
    }

    public double averageSalary(){
        int employeeNumber = 0;
        double allSalary = 0;
        while (employeeNumber < employeesList.size()) {
            allSalary += employeesList.get(employeeNumber).calculateSalary();
            employeeNumber++;
        }
        return allSalary/employeesList.size();
    }
    public void showEmployees(){
        System.out.println("Lista angajatilor este:");
        for (Employee employee : employeesList){
            System.out.println(employee);
        }
    }
}
