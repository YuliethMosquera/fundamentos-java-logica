package com.example;

public class VariablesYConstantes {

    public static void demostrarDeclaracionAsignacion() {
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
    public static void demostrarConvencionesNombres() {
        String nombreCompleto = "Yulieth Mosquera";
        int edadUsuario = 20;
        boolean esEstudiante = true;
        double precioProducto = 15.99;

        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad Usuario: " + edadUsuario);
        System.out.println("¿Es estudiante?: " + esEstudiante);
        System.out.println("Precio Producto: " + precioProducto);
    }
}
