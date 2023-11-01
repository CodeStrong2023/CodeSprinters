import javax.swing.JOptionPane;
public class Ejercicio4OptionPane {
     public static void main(String[] args) { 
        System.out.println("Ejercicio N° 4 - OptionPane");
        System.out.println("Pedir números hasta que se teclee un número negativo, y mostrar cuantos números se han intruducido");
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (numero > 0) { 
                conteo++;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }
        System.out.println("Han sido ingresados " + conteo + " números");
        System.out.println("El programa finalizo porque ingreso un número negativo");
}
}