package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicito() {
        int numeroEntero = 100;
        double numeroDecimal = numeroEntero; // automático

        System.out.println("=== CASTING IMPLÍCITO ===");
        System.out.println("Entero: " + numeroEntero);
        System.out.println("Convertido a double: " + numeroDecimal);
    }

    public static void demostrarCastingExplicito() {
        double numeroDecimal = 9.78;
        int numeroEntero = (int) numeroDecimal; // manual

        System.out.println("\n=== CASTING EXPLÍCITO ===");
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Convertido a int: " + numeroEntero);
    }


    public static void demostrarProblemasDePrecision() {
        double numeroGrande = 123456789.987654321;
        float numeroReducido = (float) numeroGrande;

        System.out.println("\n=== PÉRDIDA DE PRECISIÓN ===");
        System.out.println("Número original: " + numeroGrande);
        System.out.println("Convertido a float: " + numeroReducido);
    }
}
