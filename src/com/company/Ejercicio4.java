package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    private static final int inicio = 0;

    private static int ingresarNumero(){
        int n;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingresar numero");
        n = scanner.nextInt();
        scanner.close();
        return  n;
    }

    private static boolean esPrimo(int numero) {
        boolean condicion = true;
        if (numero == 0 || numero == 1 || numero == 4) {
            condicion = false;
        }
        else{
            for (int x = 2; x < numero / 2; x++) {
                if (numero % x == 0) {
                    condicion = false;
                }
            }
        }

        return condicion;
    }

    private static void verificarNumeroPrimoEnRangoN(int n){
        for (int i = inicio; i <= n; i++){
            if (esPrimo(i)){
                System.out.println("El numero " + i + " es primo");
            }
        }
    }

    public static void main(String[] args) {
        // write your code here

        int n;

        n = ingresarNumero();

        verificarNumeroPrimoEnRangoN(n);
    }
}
