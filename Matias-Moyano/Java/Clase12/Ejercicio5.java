package Clase12;
/* Crear y cargar una matriz de tamaño nxm
 * mostrar la suma de cada fila y de cada columna
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
        int filas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        int columnas = scanner.nextInt();

        int matriz[][] = new int[filas][columnas];
        int sumaFila[] = new int[matriz.length];
        int sumaCol[] = new int[matriz[0].length];
        int contador = 1;
        //Cargar la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println("Ingrese el valor para la fila " + fila + " y la columna " + col);
                matriz[fila][col] = scanner.nextInt();
            }
        }
        //Sumar filas
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                sumaFila[fila] += matriz[fila][col];
            }
        }
        //Sumar columnas
        for (int col = 0; col < matriz[0].length; col++) {
            for (int fila = 0; fila < matriz.length; fila++) {
                sumaCol[col] += matriz[fila][col];
            }
        }
        //Mostrar la matriz
        System.out.println("Matriz");
        imprimir(matriz);
        //Mostrar suma de filas
        System.out.println("Suma de filas");
        for (int i = 0; i < sumaFila.length; i++) {
            System.out.println("Fila " + i + ": " + sumaFila[i]);
        }
        //Mostrar suma de columnas
        System.out.println("Suma de columnas");
        for (int i = 0; i < sumaCol.length; i++) {
            System.out.println("Columna " + i + ": " + sumaCol[i]);
        }
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
