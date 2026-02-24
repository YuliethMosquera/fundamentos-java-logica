package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void leerVariosTipos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LEER VARIOS TIPOS ===");

        System.out.print("Ingresa un número entero: ");
        int numeroEntero = scanner.nextInt();

        System.out.print("Ingresa un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.next(); 

        scanner.nextLine(); 

        System.out.print("Ingresa una línea completa: ");
        String linea = scanner.nextLine(); 

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Entero: " + numeroEntero);
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Palabra: " + palabra);
        System.out.println("Línea: " + linea);
    }

    public static void manejarSaltoDeLineaPendiente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== SALTO DE LÍNEA PENDIENTE ===");

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
    }
}