package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        System.out.println("=== MATRIZ ===");

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Matriz creada correctamente.");
    }

    public static void recorrerMatriz() {
        int[][] matriz = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        System.out.println("Recorriendo matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejemploUsosTipicos() {
        int[][] tabla = {
            {1, 2},
            {3, 4}
        };

        int suma = 0;

        for (int[] fila : tabla) {
            for (int valor : fila) {
                suma += valor;
            }
        }

        System.out.println("Suma de matriz: " + suma);
    }
}