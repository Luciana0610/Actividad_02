package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    // Utiliza Scanner para leer int, double, String (palabra) y String (línea completa)
    public static void leerVariosTipos(Scanner scanner) {

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        System.out.print("Ingrese un número decimal: ");
        double decimal = scanner.nextDouble();

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();

        scanner.nextLine(); // limpiar salto pendiente

        System.out.print("Ingrese una línea completa: ");
        String lineaCompleta = scanner.nextLine();

        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Entero: " + numero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Palabra: " + palabra);
        System.out.println("Línea completa: " + lineaCompleta);
    }

    // Demuestra el problema del salto de línea al usar nextInt() con nextLine()
    public static void manejarSaltoDeLineaPendiente(Scanner scanner) {

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        scanner.nextLine(); // limpiar el salto pendiente

        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Edad: " + edad);
        System.out.println("Nombre completo: " + nombreCompleto);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Lectura de varios tipos ===");
        leerVariosTipos(scanner);

        System.out.println("\n=== Manejo de salto de línea ===");
        manejarSaltoDeLineaPendiente(scanner);

        scanner.close();
    }
}