/*
Ejercicio12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package EjercicioCiclos12Scanner;
import java.util.Scanner;
 
public class EjercicioCiclos12Scanner {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un número:");
        int numero = entrada.nextInt(); // Lee el número ingresado por el usuario
        
        long factorial = 1; // Inicializa el factorial a 1
        
        for (int i = 1; i <= numero; i++) {
         
        
    }
     System.out.println("\nEl factorial del número ingresado es: "+factorial) ;
     
    }
}