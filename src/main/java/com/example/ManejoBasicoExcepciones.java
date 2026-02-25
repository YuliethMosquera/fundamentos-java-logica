package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un número: ");
            int numero = sc.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        ejemploTryCatchDivision();
        ejemploTryCatchInput();
        ejemploBloqueFinally();
        evitarCierrePrograma();
    }

    public static void ejemploTryCatchDivision() {
        System.out.println("\n=== TRY-CATCH DIVISIÓN ===");
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

    public static void ejemploTryCatchInput() {
        System.out.println("\n=== TRY-CATCH INPUT ===");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un número entero: ");
            int numero = sc.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        }
    }

    public static void ejemploBloqueFinally() {
        System.out.println("\n=== BLOQUE FINALLY ===");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un número: ");
            int num = sc.nextInt();
            System.out.println("Número: " + num);
        } catch (Exception e) {
            System.out.println("Ocurrió un error.");
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }
    }

    public static void evitarCierrePrograma() {
        System.out.println("\n=== EVITAR CIERRE DEL PROGRAMA ===");
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (Exception e) {
            System.out.println("Se capturó un error y el programa continúa.");
        }
    }
}