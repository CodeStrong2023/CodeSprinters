import javax.swing.JOptionPane;
public class Ejercicio3OptionPane {
      public static void main(String[] args) { 
        System.out.println("Ejercicio N° 3 - OptionPane");
        System.out.println("Leer un número e indicar si es par o impar , terminar el proceso si el número es cero");
        int numero;
     numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (numero !=0) { 
            if (numero % 2 == 0) {
                System.out.println("El número es Par");
            }
            else {
                System.out.println("El número es Impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }
        System.out.println("El número es 0, este programa se finalizara");
    }
}