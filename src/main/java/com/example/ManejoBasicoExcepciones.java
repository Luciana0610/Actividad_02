package com.example;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero detectada.");
        }
    }

    public static void ejemploTryCatchInput() {
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Conversión inválida de texto a número.");
        }
    }

    public static void ejemploBloqueFinally() {
        try {
            System.out.println("Ejecutando bloque try...");
        } finally {
            System.out.println("Bloque finally ejecutado siempre.");
        }
    }

    public static void evitarCierrePrograma() {
        try {
            ejemploTryCatchDivision();
            ejemploTryCatchInput();
        } catch (Exception e) {
            System.out.println("El programa continúa ejecutándose.");
        }
        System.out.println("El programa sigue funcionando correctamente.");
    }
}
