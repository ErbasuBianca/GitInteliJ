package com.skillbrain;

public abstract class Employee {

    //atribute
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String employmentDate;
    protected int reference;

    abstract double calculateSalary();

    abstract String getName();

    //Constructorul
    Employee(String firstName, String lastName, int age, String employmentDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employmentDate = employmentDate;
    }

    //metode
    //Getteri
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public int getReference() {
        return reference;
    }
    //Setteri


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", employmentDate='" + employmentDate + '\'' +
                ", reference=" + reference +
                '}';
    }
}
