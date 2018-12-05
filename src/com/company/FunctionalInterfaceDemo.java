package com.company;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface Expandable {
    int expand(int e, long b);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        Expandable expandable = (e, b) -> (int)(e + b);
        System.out.println(expandable.expand(3, 5));

        Runnable runnable = () -> {
            System.out.println("Starting Child thread...");
            for(int i = 0; i < 10; i++) {
                System.out.println("Child thread " + i);
            }
        };

        new Thread(runnable).start();

        System.out.println("Starting Parent thread...");
        for(int i = 0; i < 10; i++) {
            System.out.println("Parent thread " + i);
        }

        Runnable runnableOne = new Runnable() {
            @Override
            public void run() {

            }
        };

        Thread thread = new Thread(() -> {

        });
    }
}
