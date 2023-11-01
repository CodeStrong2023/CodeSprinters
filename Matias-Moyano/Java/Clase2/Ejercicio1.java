package Clase2;

public class Ejercicio1 {
    public static void main(String args[]) {
        var scanner = new java.util.Scanner(System.in);
        var numero = 0;
        do{
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();
            System.out.println("El cuadrado de " + numero + " es: " + Math.pow(numero, 2));
        }while(numero >= 0);
    }
}
