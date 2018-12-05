package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsConcept {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(0);
        marks.add(5);
        marks.add(10);
        marks.add(15);
        marks.add(20);
        marks.add(25);
        List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(updatedMarks);

//        ArrayList<Integer> marks = new ArrayList<>();
//        marks.add(0);
//        marks.add(5);
//        marks.add(10);
//        marks.add(15);
//        marks.add(20);
//        marks.add(25);
//        System.out.println(marks);
//        List<Integer> integerList = marks.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(integerList);
    }
}
