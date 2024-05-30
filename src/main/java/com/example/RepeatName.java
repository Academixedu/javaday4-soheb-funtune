package com.example;

import java.util.Scanner;

public class RepeatName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = scanner.nextLine();
        System.out.println("How many times want to repeat : ");
        int count = scanner.nextInt();

        RepeatWithFor(name, count);
        RepeatWithWhile(name, count);
        RepeatWithDoWhile(name, count);

    }

    static void RepeatWithFor(String name, int count) {
        System.out.println("Printed with FOR LOOP");
        for (int i = 1; i <= count; i++) {
            System.err.println(name + i + "Time");

        }
    }

    static void RepeatWithWhile(String name, int count) {
        System.out.println("Printed with WHILE LOOP");

        int i = 1;
        while (i <= count) {
            System.err.println(name + i + "Time");
            i++;
        }
    }

    static void RepeatWithDoWhile(String name, int count) {
        System.out.println("Printed with DO WHILE LOOP");

        int i = 1;
        do {
            System.err.println(name + i + "Time");
            i++;
        } while (i <= count);
    }
}