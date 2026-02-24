package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros() {
        byte edad = 25;
        short anio = 2026;
        int poblacion = 1000000;
        long distancia = 15000000000L;

        System.out.println("=== ENTEROS ===");
        System.out.println("Byte (edad): " + edad);
        System.out.println("Short (año): " + anio);
        System.out.println("Int (población): " + poblacion);
        System.out.println("Long (distancia): " + distancia);
    }

    public static void demostrarFlotantes() {
        float precio = 19.99f;
        double pi = 3.1415926535;

        System.out.println("\n=== DECIMALES ===");
        System.out.println("Float (precio): " + precio);
        System.out.println("Double (pi): " + pi);
    }

    public static void demostrarCaracteres() {
        char inicial = 'Y';

        System.out.println("\n=== CARACTER ===");
        System.out.println("Char (inicial): " + inicial);
    }

    public static void demostrarBooleanos() {
        boolean esMayorDeEdad = true;

        System.out.println("\n=== BOOLEANOS ===");
        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);
    }
}
