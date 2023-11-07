package Clase2;
/* Ejercicio 1: Leer un numero y mostrar su cuadrado,
 repetir el proceso hasta que se introduzca un numero negativo */
import java.util.Scanner;
import javax.swing.JOptionPane;

 public class Ejercicio2 {
    public static void main(String args[]) {
        var scanner = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        var numero = 0;
        while (numero >= 0) {
            
            System.out.println("El cuadrado de " + numero + " es: " + Math.pow(numero, 2));
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        System.out.println("El numero ingresado es negativo, el programa finalizo.");
    }

}
