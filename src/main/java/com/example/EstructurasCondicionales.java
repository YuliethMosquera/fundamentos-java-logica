package com.example;

public class EstructurasCondicionales {

    public static void ejemploIf() {
        int edad = 20;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
    }

    public static void ejemploIfElse() {
        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public static void ejemploIfElseIf() {
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
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }
    }
}
