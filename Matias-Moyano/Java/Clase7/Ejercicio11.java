package Clase7;
/* Diseñar un programa que muestre el  producto
 * de los 10 primeros numeros impares
 * hacerlo con JoptionsPane
 * 
*/
import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        int producto = 1;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                producto *= i;
            }
        }
        JOptionPane.showMessageDialog(null, "El producto de los 10 primeros numeros impares es: " + producto);
    }    
}
