package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        System.out.println("Matriz creada");
    }

    public static void recorrerMatriz() {
        int[][] matriz = {
            {1, 2},
            {3, 4}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejemploUsosTipicos() {
        int[][] tabla = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabla[i][j] = i + j;
            }
        }

        recorrerMatriz();
    }
}