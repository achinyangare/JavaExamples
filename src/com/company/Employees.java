package com.company;

public class Employees {
    String name;
    String designation;
    double salary;
    String city;

    public Employees(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f, %s",name, designation, salary, city);
    }
}
