package Clase3;
/* Leer numeros hasta que se introduzca un 0
 * para cada uno indicar si es par o impar
 * hacer con clase Scanner y con JOptionPane
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String[] args) {
        /* con JoptionPane */
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero ingresado es par.");
            } else {
                System.out.println("El numero ingresado es impar.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        System.out.println("El numero ingresado es 0, el programa finalizo.");

        /* con Scanner */
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero ingresado es par.");
            } else {
                System.out.println("El numero ingresado es impar.");
            }
            System.out.println("Ingrese otro numero: ");
            numero = scanner.nextInt();
        }
        System.out.println("El numero ingresado es 0, el programa finalizo.");
    }
}
