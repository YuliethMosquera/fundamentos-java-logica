package com.example;

public class VariablesYConstantes {

    public static void demostrarVariables() {
        int edad = 20;
        double altura = 1.65;
        char inicial = 'S';
        boolean estudiante = true;

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("¿Es estudiante?: " + estudiante);
    }

    public static void demostrarConstantes() {
        final double PI = 3.1416;
        System.out.println("Valor de PI: " + PI);
    }
}
