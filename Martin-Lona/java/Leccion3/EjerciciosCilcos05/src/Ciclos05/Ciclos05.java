/*
Ejercicio 5 : Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100,y
luego ir pidiendo numeros indicando " es mayor" o "es menos"
segun sea mayor o menor con respecto a N
El preoseco termina cundo el usuario acierta y mostramos
el numero de intentos hechos.class .
*/

package Ciclos05;

import java.util.Scanner;


public class Ciclos05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo =0;
        aleatorio = (int) (Math.random()*100); // esto genra un numero aleatorio
        do{
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if (numero < aleatorio){
                System.out.println("Digite un numero mnayor: ");
            }
            else if ( numero > aleatorio){
                System.out.println("Digite un numero menor: ");
            }
            else{
                System.out.println("¿¿¿FELICIDADES!!! Has adivinado el numero");
            }
            conteo++;
        }while(numero != aleatorio);
        System.out.println("Adivinaste el numero en "+conteo+" intentos");

    }
    
}
