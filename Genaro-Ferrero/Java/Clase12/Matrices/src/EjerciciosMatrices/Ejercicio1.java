/*
Ejercicio : Crear y cargar una matriz de tamaño 3x3
transponerla y mostrarla 
 */
package EjerciciosMatrices;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner matrices = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Rellenar la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = matrices.nextInt();
            }
        }
        System.out.println();

        System.out.println("Matriz Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        System.out.println();
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
