package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List strings = new ArrayList();
        strings.add(10);
        strings.add(new Long("15"));

        //strings.forEach(string -> System.out.println(((String)string).length()));

//        List<Student> list = new ArrayList<>();
//        list.add(new Student(14,"Sophia",78 ));
//        list.add(new Student(16,"Gould",89 ));
//        list.add(new Student(45,"Musa",58 ));
//        list.add(new Student(24,"Ben",38 ));
//
//        list.forEach(System.out::println);
//        System.out.println("===========================");
//        list.sort(Comparator.comparingInt(student -> student.age));
//        list.forEach(System.out::println);
//
//        Comparator studentMarksComparator = (o1, o2) -> (int)(((Student)o1).marks - ((Student)o2).marks);
//
//        Predicate<Student> studentPredicate = student -> student.marks > 20;
//        DisplayStudents(studentPredicate, list);
        ArrayList<Integer> stringArrayList = new ArrayList<>();
        stringArrayList.add(14);

        m1(stringArrayList);
    }

    static void m1(ArrayList<?> arrayList) {
        System.out.println("Been called");
    }

    private static void DisplayStudents(Predicate<Student> studentPredicate, List<Student> list) {
        list.forEach(student -> {
            if(studentPredicate.test(student)){
                System.out.println(student);
            }
        });
    }
}

class Student implements Comparator<Student> {
    
    Integer age;
    String name;
    double marks;

    public Student() {
    }

    public Student(int age, String name, double marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(Student o, Student student) {
        return o.age - student.age;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + marks;
    }
}

//class Student implements Comparable<Student> {
//    Integer age;
//    String name;
//    double marks;
//
//    public Student(int age, String name, double marks) {
//        this.age = age;
//        this.name = name;
//        this.marks = marks;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.age.compareTo(o.age);
//    }
//
//    @Override
//    public String toString() {
//        return name + " " + age + " " + marks;
//    }
//}

