package com.ironhack.helloworld.main;

import com.ironhack.helloworld.classes.Calculator;
import com.ironhack.helloworld.classes.Movie;
import com.ironhack.helloworld.classes.Serie;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hola Mundo :D");
//        System.out.println("Goodbye World :D");
//
//        dataTypesAndOperators();
//
//        conditionals();
//
//        stringMethods();
//
//        String formattedProduct = productFormatter("    THIS IS AN AWESOME PRODUCT    ",
//                " 2 de Mayo del 2023");
//
//        System.out.println(formattedProduct);
//
//        loops();

//        scannerExample();

//        fileWriterExample();
        Movie oldBoy = new Movie("Old boy", 2003);
        Movie movie = new Movie();
        Movie killBill = new Movie("Kill Bill", 2004);
        Movie harryP = new Movie("Harry Potter", 2008);
        System.out.println(harryP.getName());
        killBill.setDuration(500);
        killBill.setName("Quill Vill");

        System.out.println(Math.pow(2, 2));
        Serie lost = new Serie("Lost", 2002, 99);

        oldBoy.play();
        lost.play();

//        Calculator suma  = new Calculator();

        System.out.println(Math.E);




    }

    private static void fileWriterExample() throws IOException {

        FileWriter writer = new FileWriter("demo.txt", false);
        for(int i=0; i< 10; i++) {
            writer.write(i + "This a very important message!!!\n");
            writer.write("This is another message\n");
        }

        writer.close();
        File file = new File("demo.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }

    private static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce your name");
        String name = scanner.nextLine();

        System.out.println("Please introduce your age");
        int age = scanner.nextInt();
        while(age < 0) {
            System.err.println("Age cannot be negative");
            age = scanner.nextInt();
        }

        System.out.println("Welcome " + name + " your age is...." + age);

        System.out.println("Adios Mundo");
        scanner.close();
    }

    public static void scannerEx() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int count = 0;
        String[] words = line.split(" ");

        System.out.println("Please introduce a phrase to be counted");

        for(String word : words) {
            if(word.startsWith("a")
                    || word.startsWith("e")
                    || word.startsWith("i")
                    || word.startsWith("o")
                    || word.startsWith("u")) {
                count++;
            } else {
                System.err.println("Word skipped " + word);
            }
        }

        System.out.println("Words: " + count);

        scanner.close();
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
