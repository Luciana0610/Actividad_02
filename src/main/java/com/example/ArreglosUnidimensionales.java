package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {

        int[] numeros1 = new int[3];
        numeros1[0] = 10;
        numeros1[1] = 20;
        numeros1[2] = 30;

        int[] numeros2 = {1, 2, 3, 4, 5};

        System.out.println("Array 1:");
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }

        System.out.println("Array 2:");
        for (int num : numeros2) {
            System.out.println(num);
        }
    }

    public static void mostrarLongitud() {
        int[] numeros = {5, 10, 15};
        System.out.println("Longitud: " + numeros.length);
    }

    public static void recorrerConForClasico() {
        int[] numeros = {100, 200, 300};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    public static void recorrerConForEach() {
        int[] numeros = {7, 8, 9};

        for (int numero : numeros) {
            System.out.println("Valor: " + numero);
        }
    }

    public static void arrayComoParametroYRetorno() {
        int[] datos = {1, 2, 3};
        imprimirArray(datos);

        int[] nuevo = crearArray();
        imprimirArray(nuevo);
    }

    public static void imprimirArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] crearArray() {
        return new int[]{9, 8, 7};
    }
}
