package com.company;

public class ConstructorAndMethodReference {

    String name;
    int rollno;
    int marks;
    int age;

    public ConstructorAndMethodReference(String name, int rollno, int marks, int age) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ConstructorAndMethodReference{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
interface Interface {
    ConstructorAndMethodReference get(String name, int rollno, int marks, int age);
}

class Test {

    public static void main(String[] args) {
        Interface i = ConstructorAndMethodReference::new;
        ConstructorAndMethodReference x = i.get("Ben", 1, 14, 150);

        Interface i1 = new Zoom();
        ConstructorAndMethodReference y = i1.get("Sam", 14, 85, 14);

        System.out.println(x);
        System.out.println(y);
    }
}

class Zoom implements Interface {

    @Override
    public ConstructorAndMethodReference get(String name, int rollno, int marks, int age) {
        return null;
    }
}
