import java.util.Scanner;
public class Ejercicio2ScannerClass {
    public static void main(String[] args) { 
        System.out.println("Ejercicio N° 2 -Scanner Class");
        System.out.println("Leer un número e indicar si es positivo o negativo, terminar el proceso si el número es cero");
        int numero;
        Scanner entrada = new Scanner(System.in); // Inicio clase scanner
        System.out.println("Digite un número");  // Pido el numero al usuario
        numero = Integer.parseInt(entrada.nextLine());
        while (numero !=0) { 
            if (numero < 0) {
                System.out.println("El número es negativo");
            }
            else {
                System.out.println("El número es positivo");
            }
              System.out.println("Digite un número");  // Pido el numero al usuario
        numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número es neutro, este programa se finalizo");
    }
}
