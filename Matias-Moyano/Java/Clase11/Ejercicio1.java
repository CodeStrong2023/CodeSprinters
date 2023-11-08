package Clase11;
/* Leer 5 numeros, guardarlos en un arreglo
 * y mostrarlos en el mismo orden introducido
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];
        System.out.println("Ingrese 5 numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Los numeros ingresados son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}
