import java.util.Scanner;
public class Ejercicio5ScannerClass {
       public static void main(String[] args) { 
        System.out.println("Ejercicio N° 5 -Scanner Class");
        System.out.println("Realizar un juego en el que se genere un número aleatorio del 0 al 100 y el usuario tenga que adivinar que número es");
        System.out.println("Pidiendo otro numero he indicando si es mayor o menor cada ingrese un número el usuario");
        System.out.println("Dar la salida de cuantos intentos necesito el usuario para adivinar");
        int numero, variante,conteo = 1;
        Scanner entrada = new Scanner(System.in); // Inicio clase scanner
        variante =  (int) (Math.random()*100);
        System.out.println("Intente adivinar un número del 0 al 100 ");  // Pido el numero al usuario
        System.out.println("Digite su número");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != variante ) { 
                conteo++;
                if (numero < variante) {
                    System.out.println(" El número es mayor");
                }
                else { 
                    System.out.println(" El número es menor");
                }
              System.out.println("Intentelo nuevamente!!");  // Pido otro numero al usuario
        numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Felicitaciones lo ha conseguido solo a necesitado " + conteo + " intentos");
        System.out.println("El juego a terminado");
}
}