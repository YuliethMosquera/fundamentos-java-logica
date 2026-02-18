package com.example;

public class Operadores {

    public static void operadoresAritmeticos() {
        int a = 10;
        int b = 5;

        System.out.println("SUMA: " + (a + b));
        System.out.println("RESTA: " + (a - b));
        System.out.println("MULTIPLICACIÓN: " + (a * b));
        System.out.println("DIVISIÓN: " + (a / b));
        System.out.println("MÓDULO: " + (a % b));
    }

    public static void operadoresRelacionales() {
        int x = 10;
        int y = 20;

        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
    }

    public static void operadoresLogicos() {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
    }

    public static void incrementoDecremento() {
        int numero = 5;

        numero++;
        System.out.println("Incremento: " + numero);

        numero--;
        System.out.println("Decremento: " + numero);
    }

    public static void operadorTernario() {
        int edad = 18;

        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(resultado);
    }
}
