package Clase6;
/* Pedir 10 numeros y escribir la suma total
 * hacerlo con la clase Scanne y JOptionPane
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();
            suma += numero;
        }
        System.out.println("La suma total es: " + suma);

        suma = 0;
        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
}
