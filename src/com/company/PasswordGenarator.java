package com.company;

import java.util.function.Supplier;

public class PasswordGenarator {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> {
            String password = "";
            Supplier<Integer> integerSupplier = () -> (int)(Math.random() * 10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$";
            Supplier<Character> characterSupplier = () -> symbols.charAt((int)(Math.random() * 55));

            for(int i = 1; i <= 8; i++) {
                if(i % 2 == 0) {
                    password += integerSupplier.get();
                } else {
                    password += characterSupplier.get();
                }
            }
            return password;
         };

        System.out.println(stringSupplier.get());
    }
}
