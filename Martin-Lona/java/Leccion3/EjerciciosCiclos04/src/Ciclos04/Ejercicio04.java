/* 
Ejercicio 4 : Pedir numeros hasta que se teclee un negativo,
y mostrar cuatnos numeros se han introducido
Lo hacemos primero con la calse Scanner
y luego con la calse JOptionPane

*/

package Ciclos04;

import javax.swing.JOptionPane;


public class Ejercicio04 {
    public static void main(String[] args) {
         int numero, conteo = 0;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero>= 0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es POSITIVO");
            conteo++;
            JOptionPane.showMessageDialog(null, "Digite otro nuemro: ");
            numero = Integer.parseInt();
        }
        JOptionPane.showMessageDialog(null, " A ingresado "+conteo+" numeros que no son negativos");
    }
    
}
