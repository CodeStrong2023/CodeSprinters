package Clase7;
/* Ejercicio 12 : PEdir un numero y calcular su factorial
 * hacerlo con Scanner y con JoptionPane
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        // Con Scanner
        Scanner scanner = new Scanner(System.in);
        int numero;
        int factorial = 1;
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);

        // Con JOptionPane
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);

    }    
}
