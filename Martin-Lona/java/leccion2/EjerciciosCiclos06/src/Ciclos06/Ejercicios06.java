/* Ejercicio 6: Pedir numeros hasta que se teclee 0, mostrar
la suma de los numeros introducidos*/

package Ciclos06;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicios06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,suma = 0;
        do{
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero = "));
          
            suma += numero;
        }while(numero != 0);
    JOptionPane.showMessageDialog(null, "\nLa suma de todos los numeros ingresados es: " + suma);
    }
}
