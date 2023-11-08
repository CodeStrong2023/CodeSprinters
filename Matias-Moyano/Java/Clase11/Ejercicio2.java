package Clase11;
/* Leer 5 numeros, guardarlos en un arreglo
 * y mostrarlos en el orden inverso al introducido
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];
        System.out.println("Ingrese 5 numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Los numeros ingresados al revés son: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}
