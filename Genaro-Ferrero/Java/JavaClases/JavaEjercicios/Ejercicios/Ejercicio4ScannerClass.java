import java.util.Scanner;
public class Ejercicio4ScannerClass {
     public static void main(String[] args) { 
        System.out.println("Ejercicio N° 4 -Scanner Class");
        System.out.println("Pedir números hasta que se teclee un número negativo, y mostrar cuantos números se han intruducido");
        int numero, conteo = 0;
        Scanner entrada = new Scanner(System.in); // Inicio clase scanner
        System.out.println("Digite un número");  // Pido el numero al usuario
        numero = Integer.parseInt(entrada.nextLine());
        while (numero > 0) { 
                conteo++;
              System.out.println("Digite otro número");  // Pido otro numero al usuario
        numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Han sido ingresados " + conteo + " números");
        System.out.println("El programa finalizo porque ingreso un número negativo");
}
}