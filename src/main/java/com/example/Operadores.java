package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        int a = 10;
        int b = 3;

        System.out.println("=== OPERADORES ARITMÉTICOS ===");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }
    public static void demostrarIncrementoDecremento() {
        int x = 5;

        System.out.println("\n=== INCREMENTO / DECREMENTO ===");
        System.out.println("Valor inicial: " + x);
        System.out.println("Post-incremento: " + (x++));
        System.out.println("Después del post: " + x);
        System.out.println("Pre-incremento: " + (++x));
        System.out.println("Post-decremento: " + (x--));
         int y = 5;
        System.out.println("Pre-decremento --y: " + (--y));

    }
    public static void demostrarRelacionales() {

        int a = 10, b = 10;
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));


        
        System.out.println("\n=== OPERADORES RELACIONALES ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }
    public static void demostrarLogicos() {
        boolean esMayor = true;
        boolean tieneLicencia = false;

        System.out.println("\n=== OPERADORES LÓGICOS ===");
        System.out.println("Puede conducir: " + (esMayor && tieneLicencia));
        System.out.println("Tiene permiso especial: " + (esMayor || tieneLicencia));
        System.out.println("No tiene licencia: " + (!tieneLicencia));
    }
    public static void demostrarAsignacionCompuesta() {
        int numero = 10;

        System.out.println("\n=== ASIGNACIÓN COMPUESTA ===");
        numero += 5;
        System.out.println("+= 5 → " + numero);

        numero *= 2;
        System.out.println("*= 2 → " + numero);

        numero -= 4;
        System.out.println("-= 4 → " + numero);

        int n = 20;
        n /= 4;  // n = n / 4
        System.out.println("n /= 4: " + n);

        n = 20;
        n %= 3;  // n = n % 3
        System.out.println("n %= 3: " + n);
  
    
    }
    public static void demostrarOperadorTernario() {
        int edad = 18;

        String mensaje = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";

        System.out.println("\n=== OPERADOR TERNARIO ===");
        System.out.println(mensaje);
    
    }
}
