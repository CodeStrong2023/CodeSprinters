import javax.swing.JOptionPane;
public class Ejercicio5OptionPane {
           public static void main(String[] args) { 
        System.out.println("Ejercicio N° 5 -Scanner Class");
        System.out.println("Realizar un juego en el que se genere un número aleatorio del 0 al 100 y el usuario tenga que adivinar que número es");
        System.out.println("Pidiendo otro numero he indicando si es mayor o menor cada ingrese un número el usuario");
        System.out.println("Dar la salida de cuantos intentos necesito el usuario para adivinar");
        int numero, variante,conteo = 1;
        variante =  (int) (Math.random()*100);
        System.out.println("Intente adivinar un número del 0 al 100 ");  // Pido el numero al usuario
                 numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (numero != variante ) { 
                conteo++;
                if (numero < variante) {
                    System.out.println(" El número es mayor");
                }
                else { 
                    System.out.println(" El número es menor");
                }
                numero = Integer.parseInt(JOptionPane.showInputDialog("Intenta nuevamente"));
        }
        System.out.println("Felicitaciones lo ha conseguido solo a necesitado " + conteo + " intentos");
        System.out.println("El juego a terminado");
}
}