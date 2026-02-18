package com.example;

public class TiposDatosPrimitivos {

    public static void mostrarEnteros() {
        byte numeroByte = 100;
        short numeroShort = 30000;
        int numeroInt = 100000;
        long numeroLong = 1000000000L;

        System.out.println("BYTE: " + numeroByte);
        System.out.println("SHORT: " + numeroShort);
        System.out.println("INT: " + numeroInt);
        System.out.println("LONG: " + numeroLong);
    }

    public static void mostrarDecimales() {
        float numeroFloat = 5.75f;
        double numeroDouble = 19.99;

        System.out.println("FLOAT: " + numeroFloat);
        System.out.println("DOUBLE: " + numeroDouble);
    }

    public static void mostrarOtros() {
        char letra = 'A';
        boolean esJavaDivertido = true;

        System.out.println("CHAR: " + letra);
        System.out.println("BOOLEAN: " + esJavaDivertido);
    }
}
