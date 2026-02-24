package com.example;

public class CondicionalIf {
    public static void main(String[] args) {

        int numero = -3;

        System.out.println("=== CONDICIONALES IF ===");

        if (numero > 0) {
            System.out.println("El número es POSITIVO");
        } else if (numero < 0) {
            System.out.println("El número es NEGATIVO");
        } else {
            System.out.println("El número es CERO");
        }
    }
}
