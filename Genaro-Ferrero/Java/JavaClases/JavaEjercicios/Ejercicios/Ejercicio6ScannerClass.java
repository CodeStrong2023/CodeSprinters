// Pedir números hasta que se teclee un 0
import java.util.Scanner;
public class Ejercicio6ScannerClass {   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
          System.out.println("Ejercicios N°6 - ScannerClass");
        int numero,suma = 0;
        do {
            System.out.println("Digite un Número: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        } while (numero != 0);
        System.out.println("\n La suma de todos los numeros ingresados es: "+ suma);
    }
}