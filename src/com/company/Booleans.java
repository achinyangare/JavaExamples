package com.company;

public class Booleans {

    public static void main(String[] args) {
        Boolean b = Boolean.valueOf("True");
        Boolean a = Boolean.valueOf(true);

        Boolean c = new Boolean("true");

        System.out.println(b.equals(c));
        System.out.println(b == c);

        Boolean d = Boolean.parseBoolean("True");
        Boolean e = Boolean.parseBoolean("true");

        System.out.println(d == e);
        System.out.println(d.equals(e));
    }
}
