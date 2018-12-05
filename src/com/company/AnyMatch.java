package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AnyMatch {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Sam");
        strings.add("Tom");
        strings.add("Sib");
        strings.add("Emma");
        strings.add("Musa");

        System.out.println(strings.stream().anyMatch(e -> e.contains("a")));

        List<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(12);
        integers.add(12);

        SoftwareDeveloper leaderSoftwareDeveloper = new SoftwareDeveloper("Allen", "Chinyangare", 37);
        Predicate<SoftwareDeveloper> softwareDeveloperPredicate = Predicate.isEqual(leaderSoftwareDeveloper);

        Predicate<Integer> p1 = p -> p > 17;
        Predicate<Integer> p2 = p -> p % 2 == 0;
        Predicate<Integer> p3 = integer -> integer > 1000;

        Consumer<Integer> consumer = integer -> {
            if(p1.or(p2).and(p3).test(integer)) {
                System.out.println(integer);
            }
        };

        List<Integer> ints = Arrays.asList(45, 14, 78, 85, 89);
        ints.forEach(consumer);

        List<SoftwareDeveloper> softwareDevelopers = Arrays.asList(
                new SoftwareDeveloper("Ben", "Moyo", 17),
                new SoftwareDeveloper("Tom","Lost", 45 ),
                new SoftwareDeveloper("Emma", "Dell", 45),
                new SoftwareDeveloper("Allen", "Chinyangare", 37)
        );

        softwareDevelopers.forEach(softwareDeveloper -> {
            if(softwareDeveloperPredicate.negate().test(softwareDeveloper)) {
                System.out.println("Found Him");
            }
        });
    }
}

class SoftwareDeveloper {
    String name;
    String surname;
    int age;

    public SoftwareDeveloper(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        SoftwareDeveloper softwareDeveloper = (SoftwareDeveloper)object;
        if(name.equals(softwareDeveloper.name) && surname.equals(softwareDeveloper.surname) && age == softwareDeveloper.age) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
