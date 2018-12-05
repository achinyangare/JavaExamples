package com.company;

import java.util.stream.Stream;

public class IntPredicateDemo {

    public static void main(String[] args) {

        TheOne theOne = (a, b) -> System.out.println(a + b);
        theOne.add(23, 7);

        TheOne theOne1 = IntPredicateDemo::m2;
        theOne1.add(12, 28);

        Runnable runnable = IntPredicateDemo::m1;
        new Thread(runnable).start();

        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(integer -> System.out.println("Parent Thread " + integer));
    }

    public static void m1() {
        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(integer -> System.out.println("Child Thread " + integer));
    }

    private static void m2(int s, int r) {
        System.out.println("In the method " + s + r);
    }
}

interface TheOne {
    void add(int a, int b);
}
