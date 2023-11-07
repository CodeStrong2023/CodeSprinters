import java.util.Scanner;

public class Ejercicio13ScannerClass{
    public static void main(String[] args) {
        Scanner nueva = new Scanner(System.in);
        float[] arreglos = new float[5];
        System.out.println("Guardado de datos");
        for (int i=0 ; i<5 ; i++) {
            System.out.println("Numero "+(i+1)+ " : Digite un número");
            arreglos[i] = nueva.nextFloat();
        }
        System.out.println("\nImprimir los elementos del arreglo");
        for (float i: arreglos){
            System.out.println(i+" ");
        }
        System.out.println("\n");
    }
}