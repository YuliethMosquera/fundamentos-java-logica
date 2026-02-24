package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
    }

    public static void ejemploIfElse() {
        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }
    }

    public static void ejemploIfElseIfElse() {
        int nota = 85;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    public static void ejemploSwitch() {
        int opcion = 2;

        switch (opcion) {
            case 1:
                System.out.println("Elegiste opción 1");
                break;
            case 2:
                System.out.println("Elegiste opción 2");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
