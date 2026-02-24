package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        String nombre = "Yulieth";
        String apellido = "Mosquera";

        String completo = nombre + " " + apellido;
        String concat = nombre.concat(" ").concat(apellido);

        System.out.println("Concatenación con + : " + completo);
        System.out.println("Concatenación con concat(): " + concat);
    }

    public static void demostrarMetodosUtiles() {
        String texto = "  Java es Genial  ";

        System.out.println("Longitud: " + texto.length());
        System.out.println("charAt(2): " + texto.charAt(2));
        System.out.println("substring(2,6): " + texto.substring(2, 6));
        System.out.println("toUpperCase(): " + texto.toUpperCase());
        System.out.println("toLowerCase(): " + texto.toLowerCase());
        System.out.println("trim(): '" + texto.trim() + "'");
        System.out.println("equals(): " + texto.equals("Java"));
        System.out.println("equalsIgnoreCase(): " + texto.equalsIgnoreCase("  java es genial  "));
        System.out.println("contains('Java'): " + texto.contains("Java"));
        System.out.println("startsWith('  Ja'): " + texto.startsWith("  Ja"));
        System.out.println("endsWith('al  '): " + texto.endsWith("al  "));
    }

    public static void demostrarInmutabilidad() {
        String texto = "Hola";
        texto.concat(" Mundo");

        System.out.println("Texto original: " + texto);
        System.out.println("No cambió porque String es inmutable.");
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder();

        sb.append("Hola");
        sb.append(" ");
        sb.append("Mundo");

        System.out.println("StringBuilder: " + sb.toString());
    }
}