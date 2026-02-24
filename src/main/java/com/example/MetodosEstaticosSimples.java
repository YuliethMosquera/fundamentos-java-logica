package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("Hola, este es un método estático simple.");
    }
    public static void ejemploPasoParametros(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    public static int ejemploRetornoValores(int a, int b) {
        return a + b;
    }
    public static int ejemploSobrecarga(int a, int b) {
        return a + b;
    }

    public static double ejemploSobrecarga(double a, double b) {
        return a + b;
    }
}
