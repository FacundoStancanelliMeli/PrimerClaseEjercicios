package com.company;

import java.util.Scanner;

public class Ejercicio1 {

    private static final int inicio = 0;

    private static boolean esPar(int n){
        return n%2 == 0;
    }

    private static void mostrarPorPantallaEsPar(int i){
        System.out.println("El numero " + i + " es par");
    }


    private static void verificarNumerosParesEnN(int n){
        for (int i = inicio; i <= n; i++){
            if (esPar(i)){
                mostrarPorPantallaEsPar(i);
            }
        }
    }

    private static int ingresarNumero(){
        int n;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingresar numero");
        n = scanner.nextInt();
        scanner.close();
        return  n;
    }

    public static void main(String[] args) {
	// write your code here

        int n;

        n = ingresarNumero();

        verificarNumerosParesEnN(n);


    }
}