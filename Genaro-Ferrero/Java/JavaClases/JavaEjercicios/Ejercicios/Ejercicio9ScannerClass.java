/*
 * Pedir, mes año y una fecha e indicar que la 
 * fecha es correcta suponiendo que los meses son de 30 dias 
 */

import java.util.Scanner;

public class Ejercicio9ScannerClass {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, año;
        System.out.println("Digite el dia: ");
        dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el Mes: ");
        mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el año: ");
        año = Integer.parseInt(entrada.nextLine());

        if ((dia > 0 && dia <= 30) && (mes > 0 && mes <= 12) && (año > 0 && año <= 2023)) {
            System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("Fecha incorrecta, por favor ingrese una fecha válida.");
        }
    }
}