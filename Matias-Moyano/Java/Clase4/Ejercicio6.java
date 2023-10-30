package Clase4;
/* Pedir numeros hasta que se teclee 0, mostrar la suma de todos los numeros introducidos */

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;
        while (numero != 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            suma += numero;
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
