// Pedir números hasta que se introduzca uno negativo y calcular la media 

import java.util.Scanner;

public class Ejercicio7ScannerClass {
    public static void main(String[] args) {
        System.out.println(" Ejercicio N° 7- Scanner Class");
        Scanner entrada = new Scanner(System.in)
        int numero ,conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Digite un NÚMERO: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0){
|           suma+= numero;
            conteo++;
            System.out.println("Digite otro Número:");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if (conteo==o){
            System.out.println("\n Error, La division entre cero no existe");
        }
        else{
            promedio = (float)suma/conteo;
            System.out.println("\n El promedio es: "+ promedio);
        }
    }
}
