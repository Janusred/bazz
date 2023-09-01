package com.carmona.baz;

import java.util.Scanner;

public class C1 {

    public static void main(String[] args) {
        // Crear una matriz de 4x4 de números
        int[][] matrizDeNumeros = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese 4 números
        int[] numerosIngresados = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");
            numerosIngresados[i] = scanner.nextInt();
        }

        // Verificar si los números ingresados están en la matriz
        boolean encontrados = true;
        for (int numero : numerosIngresados) {
            boolean encontrado = false;
            for (int i = 0; i < matrizDeNumeros.length; i++) {
                for (int j = 0; j < matrizDeNumeros[i].length; j++) {
                    if (matrizDeNumeros[i][j] == numero) {
                        encontrado = true;
                        break; // Salir del bucle interno cuando se encuentra el número
                    }
                }
                if (encontrado) {
                    break; // Salir del bucle externo cuando se encuentra el número
                }
            }
            if (!encontrado) {
                encontrados = false;
                break; // Salir del bucle principal si algún número no se encuentra
            }
        }

        // Mostrar el resultado
        if (encontrados) {
            System.out.println("Los números ingresados están en la matriz.");
        } else {
            System.out.println("Al menos uno de los números ingresados no está en la matriz.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

