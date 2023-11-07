import javax.swing.JOptionPane;

public class Ejercicio8OptinPane {
    public static void main(String[] args) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Número"));
    int i = 1;
     while (i <= numero) {
        JOptionPane.showMessageDialog(null,i);
        i++;
     }
    }
}
