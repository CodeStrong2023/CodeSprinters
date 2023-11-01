// Pedir 10 números y escribir la suma total 
import javax.swing.JOptionPane;

public class Ejercicio10OptionPane {
     public static void main(String[] args) {
         
        int numero, suma = 0;
        for ( int i = 1 ; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Número : "));
            suma += numero;
        }
        System.out.println("\n La suma de todos los números es : " +suma);
    }
}
