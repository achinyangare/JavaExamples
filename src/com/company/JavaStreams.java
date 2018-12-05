package com.company;

import java.util.ArrayList;
import java.util.List;

public class JavaStreams {

    public static void main(String[] args) {

        List<Person> roster = new ArrayList<>();
        //roster.stream().forEach(person -> System.out.print(person.getName()));
        roster.forEach(person -> System.out.println(person));

    }
}

//class Person {
//
//    public enum Sex {
//        MALE, FEMALE
//    }
//
//    String name;
//    Sex gender;
//    LocalDate birthday;
//    String emailAddress;
//
//    public Person(String name, Sex gender, LocalDate birthday, String emailAddress) {
//        this.name = name;
//        this.gender = gender;
//        this.birthday = birthday;
//        this.emailAddress = emailAddress;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Sex getGender() {
//        return gender;
//    }
//
//    public void setGender(Sex gender) {
//        this.gender = gender;
//    }
//
//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(LocalDate birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//}
