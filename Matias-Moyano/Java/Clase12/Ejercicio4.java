package Clase12;
/* Crear una matriz de tamaño 7x7 y rellenarla de forma
 * que los elementos de la diagonal principal sean de 1 y el resto 0
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        //Cargar la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                if (fila == col) {
                    matriz[fila][col] = 1;
                } else {
                    matriz[fila][col] = 0;
                }
            }
        }
        //Mostrar la matriz
        imprimir(matriz);
    }
    public static void imprimir(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
