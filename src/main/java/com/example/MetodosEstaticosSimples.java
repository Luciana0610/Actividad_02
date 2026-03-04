package com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {
        saludar();
    }

    public static void saludar() {
        System.out.println("Hola desde método estático");
    }

    public static void ejemploPasoParametros() {
        mostrarNombre("Carlos");
    }

    public static void mostrarNombre(String nombre) {
        System.out.println("Nombre: " + nombre);
    }

    public static void ejemploRetornoValores() {
        int suma = sumar(5, 3);
        System.out.println("Suma: " + suma);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void ejemploSobrecarga() {
        System.out.println(sumar(2, 3));
        System.out.println(sumar(2.5, 3.5));
    }

    public static double sumar(double a, double b) {
        return a + b;
    }
}
