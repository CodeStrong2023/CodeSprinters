import javax.swing.JOptionPane;

public class Ejercicio12OptionPane {
    public static void main(String[] args) {
        System.out.println("En este ejercicii se pedira un número y se calculara su factorial");
        long factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
        for( int i =1; i <= numero ; i++) {
            factorial *= i;
        }
  JOptionPane.showMessageDialog(null," El factorial de ese número es:" + factorial);
    }
}
