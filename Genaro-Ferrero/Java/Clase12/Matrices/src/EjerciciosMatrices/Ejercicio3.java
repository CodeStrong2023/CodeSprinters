/*
 Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila
y la suma de cada columna 
 */
package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (n): ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el número de columnas (m): ");
        int m = scanner.nextInt();

        // Crear la matriz de tamaño n x m
        int[][] matriz = new int[n][m];

        // Pedir al usuario que ingrese los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        // Mostrar la matriz
         System.out.println();

        System.out.println("Matriz Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        // Calcular y mostrar la suma de cada fila
        System.out.println("Suma de cada fila:");
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // Calcular y mostrar la suma de cada columna
        System.out.println("Suma de cada columna:");
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }
    }
}