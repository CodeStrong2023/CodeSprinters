import java.util.Scanner;
public class  Ejercicio1ScannerClass{
    public static void main(String[] args) throws Exception {
    System.out.println("Ejercicios N ° 1");
    System.out.println("Leer un número y mostrar su cuadrado , repetir este proceso hasta que se ingrese un número negativo");
    Scanner entrada1 = new Scanner(System.in);
        int numero,cuadrado;
        System.out.println("Digite un número");
        numero = Integer.parseInt(entrada1.nextLine());
        while (numero >= 0) {
            cuadrado =(int)Math.pow(numero,2); //  Para elevarlo al cuadrado
            System.out.println("El número" + numero + " elevado al cuadrado es : "+ cuadrado);
            System.out.println("Digite un número");
            numero = Integer.parseInt(entrada1.nextLine());
        }    
        System.out.println( "El programa a finalizado porque ha ingresado un número negativo");
    }
}
