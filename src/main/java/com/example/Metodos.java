package com.example;

public class Metodos {

    // Método que suma dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método que calcula el cuadrado de un número
    public static int cuadrado(int numero) {
        return numero * numero;
    }

    // Método que verifica si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método que saluda a una persona
    public static String saludar(String nombre) {
        return "Hola, " + nombre + " 👋";
    }
}
