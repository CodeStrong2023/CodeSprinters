package Clase4;
/* Pedir numeros hasta que se introduzca uno negativo
 * y calcular la media
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        int contador = 0;
        while (numero >= 0) {
            System.out.println("Ingrese un numero: ");
            numero = lector.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        }
        System.out.println("La media de los numeros ingresados es: " + (suma / contador));
    }
}
