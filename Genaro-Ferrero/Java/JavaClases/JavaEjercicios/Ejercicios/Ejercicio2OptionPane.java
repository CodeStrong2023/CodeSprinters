import javax.swing.JOptionPane;
public class Ejercicio2OptionPane {
    public static void main(String[] args) {
        System.out.println("Ejercicio N° 2 -OptionPane");
        System.out.println("Leer un número e indicar si es positivo o negativo, terminar el proceso si el número es cero");
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (numero !=0) { 
            if (numero < 0) {
                System.out.println("El número es negativo");
            }
            else {
                System.out.println("El número es positivo");
            }
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }
        System.out.println("El número es neutro, este programa se finalizo");
    }
}
