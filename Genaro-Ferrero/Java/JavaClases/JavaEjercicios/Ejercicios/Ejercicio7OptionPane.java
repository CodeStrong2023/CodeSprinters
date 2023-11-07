import javax.swing.JOptionPane;

public class Ejercicio7OptionPane {
    // Pedir números hasta que se introduzca uno negativo y calcular la media 
    public static void main(String[] args) {
        System.out.println(" Ejercicio N° 7- OptionPane");
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (numero >= 0) {
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }
        if (conteo == 0) {
            System.out.println("\n Error, La division entre cero no existe");
        } else {
            promedio = (float) suma / conteo;
            System.out.println("\n El promedio es: " + promedio);
        }
    }
}