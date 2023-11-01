import java.util.Scanner;

public class Ejercicio14ScannerClass {
     public static void main(String[] args) {
        Scanner nueva1 = new Scanner(System.in);
        float[] numeros = new float[5];

        System.out.println("Guardado de datos");
        for (int i=0 ; i<5 ; i++) {
            System.out.println("Numero "+(i+1)+ " : Digite un número");
            numeros[i] = nueva1.nextFloat();
        }
        System.out.println("\nImprimir los elementos del arreglo");
        for (int i=4 ;i>=0;i--){
            System.out.println(i+" "+numeros[i]);
        }
        System.out.println("\n");
    }
}

