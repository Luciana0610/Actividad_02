package com.example;

public class VariablesYConstantes {

    public static void demostrarDeclaracionAsignacion() {
        int edad = 25;
        double salario = 1500.50;
        char genero = 'M';
        boolean activo = true;

        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Género: " + genero);
        System.out.println("Activo: " + activo);
    }

    public static void demostrarConvencionesNombres() {
        String nombreCompleto = "Juan Perez";
        int numeroDocumento = 12345;

        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Número documento: " + numeroDocumento);
    }

    public static void demostrarConstantes() {
        final double PI = 3.1416;
        final int DIAS_SEMANA = 7;

        System.out.println("PI: " + PI);
        System.out.println("Días semana: " + DIAS_SEMANA);
    }
}
