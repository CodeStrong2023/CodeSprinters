import javax.swing.JOptionPane;
public class Ejercicio6OptionPane {
    public static void main(String[] args) {
        System.out.println(" Ejercicio N°6 - Option Pane");
        int numero,suma = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Número : "));
            suma+= numero;
        } while(numero !=0);
        JOptionPane.showMessageDialog(null,"La suma de los Números ingresados es: "+ suma);
    }
}
