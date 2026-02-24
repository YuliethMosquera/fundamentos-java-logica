package com.example;

public class App {
    public static void main(String[] args) {

        System.out.println("=== PROYECTO FINAL JAVA ===");

        // 🔹 Excepciones
        ManejoBasicoExcepciones.ejemploTryCatchDivision();
        ManejoBasicoExcepciones.ejemploTryCatchInput();
        ManejoBasicoExcepciones.ejemploBloqueFinally();
        ManejoBasicoExcepciones.evitarCierrePrograma();

        System.out.println("\n=== FIN DEL PROYECTO ===");

EntradaDeDatos.leerVariosTipos();
EntradaDeDatos.manejarSaltoDeLineaPendiente();
    }
}