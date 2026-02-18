package com.example;

public class App {
    public static void main(String[] args) {

        System.out.println("=== FUNDAMENTOS DE JAVA ===");

        VariablesYConstantes.demostrarVariables();
        VariablesYConstantes.demostrarConstantes();

        System.out.println("\n=== TIPOS DE DATOS PRIMITIVOS ===");

        TiposDatosPrimitivos.mostrarEnteros();
        TiposDatosPrimitivos.mostrarDecimales();
        TiposDatosPrimitivos.mostrarOtros();

        System.out.println("\n=== OPERADORES ===");

        Operadores.operadoresAritmeticos();
        Operadores.operadoresRelacionales();
        Operadores.operadoresLogicos();
        Operadores.incrementoDecremento();
        Operadores.operadorTernario();

        System.out.println("\n=== ESTRUCTURAS CONDICIONALES ===");

        EstructurasCondicionales.ejemploIf();
        EstructurasCondicionales.ejemploIfElse();
        EstructurasCondicionales.ejemploIfElseIf();
        EstructurasCondicionales.ejemploSwitch();

       System.out.println("\n=== BUCLES ===");

Bucles.ejemploFor();
Bucles.ejemploWhile();
Bucles.ejemploDoWhile();


System.out.println("\n=== ARRAYS ===");

ArraysEjemplo.ejemploArray();
ArraysEjemplo.sumaYPromedio();


System.out.println("\n=== MÉTODOS CON PARÁMETROS Y RETORNO ===");

int resultadoSuma = Metodos.sumar(5, 3);
System.out.println("Suma: " + resultadoSuma);

System.out.println("Cuadrado de 4: " + Metodos.cuadrado(4));
System.out.println("¿10 es par?: " + Metodos.esPar(10));
System.out.println(Metodos.saludar("Stefany"));


    }
}

