package Clase2;
/* Leer un numero e indicar si es positivo o negativo
 * el proceso se repite hasta que se introduzca un 0
 */
import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String[] args) {
        /* con JoptionPane */
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El numero ingresado es positivo.");
            } else {
                System.out.println("El numero ingresado es negativo.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        System.out.println("El numero ingresado es 0, el programa finalizo.");
    }
}
