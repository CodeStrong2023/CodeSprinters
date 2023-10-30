package Clase5;
/* Pedir un numero n, y mostrar todos los numeros del 1 al N */
import javax.swing.JOptionPane;
public class Ejercicio8 {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 1;
        while (numero <= 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
        while (contador <= numero) {
            System.out.println(contador);
            contador++;
        }
    }
}
