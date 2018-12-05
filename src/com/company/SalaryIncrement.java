package com.company;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncrement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        populate(employees);

        System.out.println("Before Increment: ");
        System.out.println(employees);

        Predicate<Employee> salaryPredicate = employee -> employee.salary < 3500;
        Function<Employee, Employee> salaryFunction = employee -> {
            employee.salary = employee.salary + 477;
            return employee;
        };

        System.out.println("After Increment:");
        ArrayList<Employee> updatedEmployees = new ArrayList<>();
        employees.forEach(employee -> {
            if(salaryPredicate.test(employee)) {
                updatedEmployees.add(salaryFunction.apply(employee));
            }
        });
        System.out.println(employees);
        System.out.println("Employees with incremented salary:");
        System.out.println(updatedEmployees);
    }

    private static void populate(ArrayList<Employee> employees) {
        employees.add(new Employee("Tom", 1200.00));
        employees.add(new Employee("Sam", 2000.00));
        employees.add(new Employee("Tsumo", 500.00));
        employees.add(new Employee("Rudo", 3000.00));
        employees.add(new Employee("Ben", 4000.00));
    }
}

class Employee {
    String name;
    Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " : " + salary;
    }
}
