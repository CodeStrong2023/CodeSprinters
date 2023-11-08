package Clase11;
/* Leer 5 numeros por teclado, almacenarlos en un array
 * y a continuacion realizar la media de los numeros positivos,
 *  la media de los numeros negativos y contar el numero de ceros
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];
        System.out.println("Ingrese 5 numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
        }
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int conteo_positivos = 0;
        int conteo_negativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos += numeros[i];
                conteo_positivos ++;
            } else if (numeros[i] < 0) {
                negativos += numeros[i];
                conteo_negativos ++;
            } else {
                ceros++;
            }
        }
        System.out.println("La media de los numeros positivos es: " + (positivos / conteo_positivos));
        System.out.println("La media de los numeros negativos es: " + (negativos / conteo_negativos));
        System.out.println("La cantidad de ceros es: " + ceros);

    }
}
