package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        System.out.println("=== DECLARAR / CREAR / INICIALIZAR ===");

        int[] numeros1 = new int[3]; 
        numeros1[0] = 10;
        numeros1[1] = 20;
        numeros1[2] = 30;

        int[] numeros2 = {5, 15, 25}; 

        System.out.println("Array 1:");
        for (int n : numeros1) {
            System.out.println(n);
        }

        System.out.println("Array 2:");
        for (int n : numeros2) {
            System.out.println(n);
        }
    }

    public static void mostrarLongitud() {
        int[] datos = {1, 2, 3, 4, 5};
        System.out.println("Longitud del array: " + datos.length);
    }

    public static void recorrerConForClasico() {
        int[] numeros = {10, 20, 30, 40};

        System.out.println("Recorrido con for clásico:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void recorrerConForEach() {
        int[] numeros = {100, 200, 300};

        System.out.println("Recorrido con for-each:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] entrada) {
        int[] salida = new int[entrada.length];

        for (int i = 0; i < entrada.length; i++) {
            salida[i] = entrada[i] * 2;
        }

        return salida;
    }
}