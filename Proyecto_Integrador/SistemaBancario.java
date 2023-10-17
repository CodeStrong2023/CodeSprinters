package CodeSprinters.Proyecto_Integrador;
import java.util.Scanner;

public class SistemaBancario{
    private static Scanner scanner = new Scanner(System.in);
    private static CuentaBancaria cuentaActual;
    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 6) {
            mostrarMenu();
            opcion = scanner.nextInt();
            procesarOpcion(opcion);
        }
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("|  ------------------------------------------------------------------- |");
        System.out.println("| |                         Sistema bancario                         | |");
        System.out.println("|  ------------------------------------------------------------------  |");
        System.out.println("| |                      1. Crear cuenta                             | |");
        System.out.println("|  ------------------------------------------------------------------  |");
        System.out.println("| |                      2. Depositar dinero                         | |");
        System.out.println("|  ------------------------------------------------------------------  |");
        System.out.println("| |                      3. Retirar dinero                           | |");
        System.out.println("|  ------------------------------------------------------------------  |");
        System.out.println("| |                      4. Transferir dinero                        | |");
        System.out.println("|  ------------------------------------------------------------------  |");
        System.out.println("| |                      5. Datos de la cuenta                       | |");
        System.out.println("|  ------------------------------------------------------------------  |");
        System.out.println("| |                      6. Salir                                    | |");
        System.out.println("|  ------------------------------------------------------------------  |");
        System.out.println("|  |                 Seleccione una opcion  del 1 al 6               | |");
        System.out.println("|  ------------------------------------------------------------------  |");
    }


    // Método para procesar la opción del usuario
    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                // Verificación de robot y creación de cuenta
                if (verificacionRobot()) {
                    crearCuenta();
                }
                break;
            case 2:
                depositarDinero();
                break;
            case 3:
                retirarDinero();
                break;
            case 4:
                transferirDinero();
                break;
            case 5:
                if (verificacionRobot()) {
                    mostrarDatosCuenta();
                }
                break;
            case 6:
                System.out.println("|  ------------------------------------------------------------------- |");
                System.out.println("|                      Saliendo de la Aplicacion                       |");
                System.out.println("|  ------------------------------------------------------------------  |");
                break;
            default:
                System.out.println("|  ------------------------------------------------------------------- |");
                System.out.println("|                       La opcion no es valida                         |");
                System.out.println("|                     Elija una ocion del 1 al 6                       |");
                System.out.println("|  ------------------------------------------------------------------  |");
                break;
        }
    }

    // Métodos para las funcionalidades
    private static boolean verificacionRobot() {
        // Implementación de la verificación de robot
        return true; // Por ahora siempre retorna true
    }

    private static void crearCuenta() {
        
    }

    private static void depositarDinero() {
        
    }

    private static void retirarDinero() {
        
    }

    private static void transferirDinero() {
       
    }

    private static void mostrarDatosCuenta() {
        
    }
}
