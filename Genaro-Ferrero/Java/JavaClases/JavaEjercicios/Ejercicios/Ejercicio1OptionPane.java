import javax.swing.JOptionPane;
public class  Ejercicio1OptionPane{
    public static void main(String[] args) throws Exception {
    System.out.println("Ejercicios N ° 1- Sin clase Scanner");
    System.out.println("Leer un número y mostrar su cuadrado , repetir este proceso hasta que se ingrese un número negativo");
        int numero,cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        while (numero >= 0) {
            cuadrado =(int)Math.pow(numero,2); //  Para elevarlo al cuadrado
            System.out.println("El número" + numero + " elevado al cuadrado es : "+ cuadrado);
             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        }    
        System.out.println( "El programa a finalizado porque ha ingresado un número negativo");
    }
}
