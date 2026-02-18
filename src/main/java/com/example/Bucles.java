package com.example;

public class Bucles {

    public static void ejemploFor() {
        System.out.println("Bucle FOR del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void ejemploWhile() {
        System.out.println("Bucle WHILE del 1 al 5:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void ejemploDoWhile() {
        System.out.println("Bucle DO-WHILE del 1 al 5:");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
