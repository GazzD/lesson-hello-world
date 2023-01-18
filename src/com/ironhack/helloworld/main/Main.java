package com.ironhack.helloworld.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola World :D");

        dataTypesAndOperators();

        conditionals();

        stringMethods();

        String formattedProduct = productFormatter("    THIS IS AN AWESOME PRODUCT    ",
                " 2 de Mayo del 2023");

        System.out.println(formattedProduct);

        loops();

        System.out.println("Adios Mundo 2");

    }

    private static void dataTypesAndOperators() {
        // String int double boolean long char float byte short
        int age = 22;
        Integer age2 = 22;

        float xx = 4.33333f;
        long yy = 28;
        String name = "x";
        String name2 = "xxxxxxxx";

        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);
        System.out.println(Math.pow(2, 8));
        System.out.println(Math.sqrt(9));
    }

    private static void stringMethods() {
        String word = "Hello World";

        System.out.println(word.length());
        System.out.println(word.toUpperCase().concat(" jejeje").toLowerCase() + "asdsadsad");
    }

    private static void loops() {
        String[] studentNames = { "Jesús", "Xavi", "Alex", "Nico", "Dmitri" };
        System.out.println("==== FOR ====");
        for(int i=0; i<studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }

        System.out.println("==== WHILE ====");
        int i=0;
        while(i < studentNames.length) {
            System.out.println(studentNames[i]);
            i++;
        }

        System.out.println("==== DO WHILE ====");
        i = 0;
        do {
            System.out.println(studentNames[i]);
            i++;
        }while(i < studentNames.length);

        System.out.println("==== FOREACH ====");
        for(String studentName : studentNames) {
            System.out.println(studentName);
        }

        System.out.println("==== STREAM ====");
//        Arrays.stream(studentNames).forEach(System.out::println);
        Arrays.stream(studentNames).forEach(x -> System.out.println(x));
    }

    private static void conditionals() {
        int i=90;
        long yy = 20;
        // i = i + 1;
        System.out.println(++i);
        System.out.println(i);
//        System.out.println(i++);

        // IF STATEMENT
        if(i < 10) {
            System.out.println("Menor a 10");
        } else if(i > 10 && yy == 20){
            System.out.println("Mayor a 10 y yy igual a 20");
        } else {
            System.out.println("Igual a 10");
        }

        int day = 1;

        // SWITCH STATEMENT
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> {
                System.out.println("Tuesday");
                System.out.println("xxxx");
            }
        }

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Finde");
                break;
        }

        // TERNARY OPERATOR
//        if(day > 5) {
//            result = "Findeeeee";
//        } else {
//            result = "Día de semana";
//        }

        // <condition> ? <expre1> : <expre2>;
        String result = day > 5 ? "Findeeeee" : day <= 0 ? "Error" : "Día de semana";
        System.out.println(result);
    }

    public static String productFormatter(String productName, String date) {
        // productFormatter productName (String) date(String) : trimmed change " " x "_" UPPERCASE
        String result = productName
                .trim()
                .concat(date)
                .replace(" ", "_")
                .toUpperCase();

        return result;
    }



}
