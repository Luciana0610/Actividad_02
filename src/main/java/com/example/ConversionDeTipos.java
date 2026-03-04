package com.example;

public class ConversionDeTipos {

    public static void demostrarCastingImplicito() {
        int entero = 10;
        double decimal = entero;

        System.out.println("Casting implícito: " + decimal);
    }

    public static void demostrarCastingExplicito() {
        double decimal = 9.78;
        int entero = (int) decimal;

        System.out.println("Casting explícito: " + entero);
    }

    public static void demostrarProblemasDePrecision() {
        double numero = 9.99;
        int convertido = (int) numero;

        System.out.println("Pérdida de precisión: " + convertido);
    }
}
