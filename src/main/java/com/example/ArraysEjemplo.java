package com.example;

public class ArraysEjemplo {

    public static void ejemploArray() {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Elementos del array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    public static void sumaYPromedio() {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
