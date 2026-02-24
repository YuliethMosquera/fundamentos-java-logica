package com.example;

import java.util.Scanner;

public class ProyectoFinal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROYECTO FINAL ===");
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // IF
        if (numero % 2 == 0) {
            System.out.println("El número es PAR");
        } else {
            System.out.println("El número es IMPAR");
        }

        // SWITCH
        System.out.println("\nTabla de multiplicar:");
        switch (numero) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
                break;

            default:
                System.out.println("Número fuera del rango (1-5)");
        }

        scanner.close();
    }
}
