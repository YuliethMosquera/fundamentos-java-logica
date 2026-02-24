package com.example;

public class CondicionalSwitch {
    public static void main(String[] args) {

        int opcion = 2;

        System.out.println("=== SWITCH ===");

        switch (opcion) {
            case 1:
                System.out.println("Elegiste la opción 1");
                break;

            case 2:
                System.out.println("Elegiste la opción 2");
                break;

            case 3:
                System.out.println("Elegiste la opción 3");
                break;

            default:
                System.out.println("Opción no válida");
        }
    }
}
