package Clase5;
/* Pedir el dia, mes y año de una fecha
 * e indicar si la fecha es correcta
 * suponiendo que todos los meses son de 30 dias
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        int dia = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = entrada.nextInt();
        if (dia > 0 && dia <= 30 && mes > 0 && mes <= 12 && anio > 0) {
            System.out.println("La fecha ingresada es correcta");
            System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("La fecha ingresada es incorrecta");
        }
    }
}
