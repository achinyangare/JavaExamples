package com.company;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeBiFunction {

    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        BiFunction<String, Double, Worker> workerBiFunction = (name, salary) -> new Worker(name, salary);

        workers.add(workerBiFunction.apply("Allen", 2000.00));
        workers.add(workerBiFunction.apply("Tom", 1770.00));
        workers.add(workerBiFunction.apply("Sam", 450.00));
        workers.add(workerBiFunction.apply("Emma", 1400.00));

        BiConsumer<Worker, Double> workerBiConsumer = (worker, salaryIncrement) -> worker.salary = worker.salary + salaryIncrement;
        workers.forEach(worker -> workerBiConsumer.accept(worker, 350.00));

        workers.forEach(System.out::println);
    }
}

class Worker {

    String name;
    double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
