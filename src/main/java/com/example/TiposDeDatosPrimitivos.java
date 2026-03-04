package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros() {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000000L;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
    }

    public static void demostrarFlotantes() {
        float f = 5.5f;
        double d = 10.99;

        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }

    public static void demostrarCaracteres() {
        char letra = 'A';
        System.out.println("char: " + letra);
    }

    public static void demostrarBooleanos() {
        boolean esMayor = true;
        System.out.println("boolean: " + esMayor);
    }

    public static void demostrarValoresPorDefecto() {
        System.out.println("Los valores por defecto se asignan en variables de instancia.");
    }
}
