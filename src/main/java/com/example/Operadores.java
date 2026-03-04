package com.example;

public class Operadores {

    public static void demostrarAritmeticos() {
        int a = 10, b = 3;
        System.out.println("--- Aritméticos ---");
        System.out.println("Suma (+): " + (a + b));
        System.out.println("Resta (-): " + (a - b));
        System.out.println("Multiplicación (*): " + (a * b));
        System.out.println("División (/): " + (a / b));
        System.out.println("Módulo (%): " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {
        int x = 5;
        System.out.println("\n--- Incremento/Decremento ---");
        // Prefijo: incrementa antes de usar el valor
        System.out.println("Prefijo (++x): " + (++x)); // Imprime 6
        // Sufijo: usa el valor y luego incrementa/decrementa
        System.out.println("Sufijo (x--): " + (x--));   // Imprime 6 (luego baja a 5)
        System.out.println("Valor final tras sufijo: " + x); // Imprime 5
    }

    public static void demostrarRelacionales() {
        int a = 5, b = 10;
        System.out.println("\n--- Relacionales ---");
        System.out.println("Mayor que (>): " + (a > b));
        System.out.println("Mayor o igual (>=): " + (a >= b));
        System.out.println("Menor que (<): " + (a < b));
        System.out.println("Menor o igual (<=): " + (a <= b));
        System.out.println("Igual a (==): " + (a == b));
        System.out.println("Diferente de (!=): " + (a != b));
    }

    public static void demostrarLogicos() {
        boolean a = true, b = false;
        System.out.println("\n--- Lógicos ---");
        System.out.println("AND (&&): " + (a && b));
        System.out.println("OR (||): " + (a || b));
        System.out.println("NOT (!): " + (!a));
    }

    public static void demostrarAsignacionCompuesta() {
        int x = 10;
        System.out.println("\n--- Asignación Compuesta ---");
        x += 3; // x = x + 3
        System.out.println("Suma (+=): " + x);
        x -= 2; // x = x - 2
        System.out.println("Resta (-=): " + x);
        x *= 2; // x = x * 2
        System.out.println("Multiplicación (*=): " + x);
        x /= 4; // x = x / 4
        System.out.println("División (/=): " + x);
        x %= 2; // x = x % 2
        System.out.println("Módulo (%=): " + x);
    }

    public static void demostrarOperadorTernario() {
        int edad = 18;
        System.out.println("\n--- Operador Ternario ---");
        // Estructura: condicion ? valor1 : valor2
        String mensaje = (edad >= 18) ? "Es Mayor de edad" : "Es Menor de edad";
        System.out.println("Resultado: " + mensaje);
    }
}