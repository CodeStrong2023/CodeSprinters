/*
 Ejericio 2 Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos
de la diagonal principal sean 1 y el resto 0.
 */
package EjerciciosMatrices;

public class Ejercicio2 {
    public static void main(String[] args) {
        int matriz[][] = new int[7][7];

        // Llenar la matriz con 1 en la diagonal principal y 0 en el resto
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz diagonal rellenada con 1");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }
    }
}