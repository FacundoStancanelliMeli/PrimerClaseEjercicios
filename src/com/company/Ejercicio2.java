package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner scanner = new Scanner (System.in);

    private static final int inicio = 1;

    private static void mostrarPorPantallaEsMultiplo(int i){
        System.out.println("El numero " + i + " es mupltiplo");
    }

    private static void verificarMultiplosDeMEnN (int n, int m){
        for (int i = inicio; i <= n; i++){
                mostrarPorPantallaEsMultiplo(m*i);
        }
    }

    private static int ingresarNumeros(String mensaje){
        int numero;
        System.out.println(mensaje);
        numero = scanner.nextInt();
        return numero;
    }

    public static void main(String[] args) {
        // write your code here

        int n;
        int m;


        n = ingresarNumeros("Ingresar cantidad de multiplos");
        m = ingresarNumeros("Ingresar numero");

        scanner.close();

        verificarMultiplosDeMEnN(n, m);


    }

}