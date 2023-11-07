package Clase3;
/* Pedir numeros hasta que se teclee uno negativo
 * y mostrar cuantos numeros se han introducido
 * lo hacemos con JOptionPane y con Scanner
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        /* con JoptionPane */
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        var contador = 0;
        while (numero >= 0) {
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        System.out.println("Se ingresaron " + contador + " numeros.");
        
        /* con Scanner */
        var scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();
        contador = 0;
        while (numero >= 0) {
            contador++;
            System.out.println("Ingrese otro numero: ");
            numero = scanner.nextInt();
        }
        System.out.println("Se ingresaron " + contador + " numeros.");
    }    
}
