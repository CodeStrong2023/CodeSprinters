package Clase3;
/* Realizar un juego para adivinar un numero, para ello generar un numero
 * aleatorio entre 0 1 100, y luego ir pidiendo numeros indicando
 * "es mayor" o "es menor" segun sea mayor o menor con respecto a N.
 * El proceso termina cuando el usuario acierta y mostrar el numero de
 * intentos.
 */
import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main(String[] args) {
        var numero = (int) (Math.random() * 100);
        var numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        var contador = 0;
        while (numeroIngresado != numero) {
            if (numeroIngresado > numero) {
                System.out.println("El numero ingresado es mayor.");
            } else {
                System.out.println("El numero ingresado es menor.");
            }
            numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
            contador++;
        }
        System.out.println("El numero ingresado es correcto, el programa finalizo.");
        System.out.println("Se ingresaron " + contador + " numeros.");
    }
}
