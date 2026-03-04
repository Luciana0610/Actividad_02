package com.example;

public class EstructurasDeRepeticion {

    public static void ejemploWhile() {
        int i = 1;
        while (i <= 3) {
            System.out.println("While: " + i);
            i++;
        }
    }

    public static void ejemploDoWhile() {
        int i = 1;
        do {
            System.out.println("Do-While: " + i);
            i++;
        } while (i <= 3);
    }

    public static void ejemploForClasico() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("For: " + i);
        }
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            if (i == 5) break;
            System.out.println(i);
        }
    }
}
