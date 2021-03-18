package com.company;

import java.util.Scanner;

public class Ejercicio5 {

    private static Scanner scanner = new Scanner (System.in);

    private static int sumarSiNumeroIgualDigito(int cont, char digitoEnNumero, char cDigito){
        if (digitoEnNumero == cDigito){
            cont++;
        }
        return cont;
    }

    private static boolean devolverCondicion(int cont, int cantidadDigitos){
        return cont == cantidadDigitos;
    }

    private static boolean cantidadDigitosCorrecto(int cantidadDigitos, int digito, String numero){
        int i = -1;
        int cont = 0;
        char cDigito = Character.forDigit(digito, 10);

        do{

            i++;
            cont = sumarSiNumeroIgualDigito(cont, numero.charAt(i), cDigito);

        }while (i < numero.length()-1);

        return devolverCondicion(cont, cantidadDigitos);
    }

    private static void mostrarMensaje(String numeroIngresado){
        System.out.println(numeroIngresado);
    }

    private static void funcion(int n, int m, int d){
        String numeroIngresado;
        int i = 0;
        int contadorNumerosHallados = 0;
        while (contadorNumerosHallados != n){
            numeroIngresado = String.valueOf(i);
            if (cantidadDigitosCorrecto(m, d, numeroIngresado)){
                mostrarMensaje(numeroIngresado);
                contadorNumerosHallados++;
            }
            i++;
        }
    }

    private static int ingresarNumeros(String mensaje){
        int numero;
        System.out.println(mensaje);
        numero = scanner.nextInt();
        return numero;
    }

    public static void main(String[] args) {
        int n;
        int m;
        int d;

        m = ingresarNumeros("Ingresar m");
        d = ingresarNumeros("Ingresar d");
        n = ingresarNumeros("Ingresar n");
        scanner.close();

        funcion(n,m,d);

    }
}