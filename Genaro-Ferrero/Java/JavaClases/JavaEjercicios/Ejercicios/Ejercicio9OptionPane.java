/*
 * Pedir, mes año y una fecha e indicar que la 
 * fecha es correcta suponiendo que los meses son de 30 dias 
 */

import javax.swing.JOptionPane;

public class Ejercicio9OptionPane {
    public static void main(String[] args) {
        String diaStr = JOptionPane.showInputDialog("Digite el día: ");
        String mesStr = JOptionPane.showInputDialog("Digite el Mes: ");
        String añoStr = JOptionPane.showInputDialog("Digite el año: ");

        int dia = Integer.parseInt(diaStr);
        int mes = Integer.parseInt(mesStr);
        int año = Integer.parseInt(añoStr);

        if ((dia > 0 && dia <= 30) && (mes > 0 && mes <= 12) && (año > 0 && año <= 2023)) {
            JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + dia + "/" + mes + "/" + año);
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, por favor ingrese una fecha válida.");
        }
    }
}