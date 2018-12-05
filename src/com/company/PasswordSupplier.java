package com.company;

import java.util.function.Supplier;

public class PasswordSupplier {

    public static void main(String[] args) {

        Supplier<String> passwordSupplier = () -> {
            String password = "";
            Supplier<Integer> digitSupplier = () -> (int)(Math.random() * 10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Character> characterSupplier = () -> symbols.charAt((int)(Math.random() * 29));
            for(int i = 1; i <= 8; i++) {
                if(i % 2 == 0) {
                    password = password + digitSupplier.get();
                } else {
                    password = password + characterSupplier.get();
                }
            }
            return password;
        };

        System.out.println(passwordSupplier.get());
    }
}
