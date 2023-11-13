/* Ejercicio: Crear y cargar una matriz
 * de tamaño 3x3, trasponerla y mostrarla.
 */
package Clase12;

public class Ejercicio3 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int matrizTraspuesta[][] = new int[3][3];
        int contador = 1;
        //Cargar la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                matriz[fila][col] = contador++;
            }
        }
        //Trasponer la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                matrizTraspuesta[fila][col] = matriz[col][fila];
            }
        }
        //Mostrar la matriz
        System.out.println("Matriz original");
        imprimir(matriz);
        System.out.println("Matriz traspuesta");
        imprimir(matrizTraspuesta);
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