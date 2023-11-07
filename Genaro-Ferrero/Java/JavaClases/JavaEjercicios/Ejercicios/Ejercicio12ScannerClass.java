import java.util.Scanner;

public class Ejercicio12ScannerClass {
    public static void main(String[] args) {
        System.out.println("En este ejercicii se pedira un número y se calculara su factorial");
        Scanner entrada2 = new Scanner(System.in);
        long factorial = 1;
        System.out.println("Digite un número");
        int numero = Integer.parseInt(entrada2.nextLine());
        for( int i =1; i <= numero ; i++) {
            factorial *= i;
        }
        System.out.println(" El factorial de ese número es:" + factorial);
    }
}
