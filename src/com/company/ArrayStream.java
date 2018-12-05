package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ArrayStream {

    public static void main(String[] args) {
        String[] strings = {"Ben", "Tom", "Tonde", "Emma", "Mafi"};
        Stream<String> stringStream = Stream.of(strings);
        Predicate<String> stringLength = string -> string.length() > 3;
        Stream<String> filteredStrings = stringStream.filter(stringLength);
        filteredStrings.forEach(System.out::println);
        stringStream.count();
    }
}
