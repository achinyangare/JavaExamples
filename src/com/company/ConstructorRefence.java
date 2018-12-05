package com.company;

public class ConstructorRefence {
    public static void main(String[] args) {
        MyInterface myInterface = () -> new ClassStudent();
        myInterface.get();

        MyInterface myInterface1 = ClassStudent::new;
        myInterface1.get();
    }
}

interface MyInterface {
    ClassStudent get();
}

class ClassStudent {
    String name;
    int age;

    public ClassStudent() {
        System.out.println("Student class Constructor");
    }

    public ClassStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

