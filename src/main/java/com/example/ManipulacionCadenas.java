package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        String nombre = "Juan";
        String saludo = "Hola " + nombre;

        System.out.println(saludo);
        System.out.println(nombre.concat(" Perez"));
    }

    public static void demostrarMetodosUtiles() {
        String texto = "  Hola Mundo  ";

        System.out.println("Length: " + texto.length());
        System.out.println("CharAt: " + texto.charAt(2));
        System.out.println("Substring: " + texto.substring(2, 6));
        System.out.println("Upper: " + texto.toUpperCase());
        System.out.println("Lower: " + texto.toLowerCase());
        System.out.println("Trim: " + texto.trim());
        System.out.println("Equals: " + texto.equals("Hola"));
        System.out.println("Contains: " + texto.contains("Mundo"));
        System.out.println("StartsWith: " + texto.startsWith(" "));
        System.out.println("EndsWith: " + texto.endsWith(" "));
    }

    public static void demostrarInmutabilidad() {
        String texto = "Hola";
        texto.concat(" Mundo");

        System.out.println("Original: " + texto);
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hola");
        sb.append(" ");
        sb.append("Mundo");

        System.out.println(sb.toString());
    }
}
