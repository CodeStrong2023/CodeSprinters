import java.util.Scanner;

public class Ejercicio3ScannerClass {
  public static void main(String[] args) { 
        System.out.println("Ejercicio N° 3 -Scanner Class");
        System.out.println("Leer un número e indicar si es par o impar , terminar el proceso si el número es cero");
        int numero;
        Scanner entrada = new Scanner(System.in); // Inicio clase scanner
        System.out.println("Digite un número");  // Pido el numero al usuario
        numero = Integer.parseInt(entrada.nextLine());
        while (numero !=0) { 
            if (numero % 2 == 0) {
                System.out.println("El número es Par");
            }
            else {
                System.out.println("El número es Impar");
            }
              System.out.println("Digite un número");  // Pido el numero al usuario
        numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número es 0, este programa se finalizara");
    }
}

