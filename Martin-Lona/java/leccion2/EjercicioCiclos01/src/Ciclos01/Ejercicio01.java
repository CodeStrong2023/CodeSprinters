/* Ejercicio1: Leer un numero y mostrar su cuadrado, repetir
el procesohasta que se introdusca un numero negativo
*/
package Ciclos01;

import javax.swing.JOptionPane;


public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero >= 0){// Mientras el numero sea igula a cero o positivo
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numeor:"+numero+" elevado al cuadrado: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
                    }
        System.out.println("El programa a finalizado por numero negativo");
    }
    
}
