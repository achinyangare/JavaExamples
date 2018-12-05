package com.company;

public class CollegeStudent implements Comparable {
    String name;
    int marks;

    public CollegeStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        CollegeStudent collegeStudent = (CollegeStudent) o;
        return ((Integer)(this.marks)).compareTo(((CollegeStudent) o).marks);
    }

    public static void main(String[] args) {

    }
}
