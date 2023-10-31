package main;
import OpcionesMenu.CuentaBancaria;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaBancario{
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
    
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
        System.out.println("|  ------------------------------------------------------------------- |");
        System.out.println("|                              Crear cuenta                            |");
        System.out.println("|  ------------------------------------------------------------------  |");
        
    
        // Generador de CBU
        SecureRandom random = new SecureRandom();
        BigInteger bigInt = new BigInteger(128, random);

        String CBU = bigInt.toString(36).toUpperCase();

        // Ajustar la longitud a 22 caracteres (agregar ceros a la izquierda si es necesario)
        if (CBU.length() < 22) {
            int diferencia = 22 - CBU.length();
            String ceros = "0".repeat(diferencia);
            CBU = ceros + CBU;
        } else if (CBU.length() > 22) {
            // Si la cadena es demasiado larga, recortarla
            CBU = CBU.substring(0, 22);
        }
        


        for (int i = 0; i < cuentas.length; i++) {
            CuentaBancaria cuenta = new CuentaBancaria();
            System.out.println("| Ingrese su Nombre de Usuario"+(i+1)+": ");
            CuentaBancaria.setNombreUsuario(scanner.nextLine());
            System.out.println("| Ingrese su Nombre Completo"+(i+1)+": ");
            CuentaBancaria.setNombreReal(scanner.nextLine());
            System.out.println("| Ingrese su Contraseña"+(i+1)+": ");
            CuentaBancaria.setContra(scanner.nextLine());
            System.out.println("| Ingrese su DNI"+(i+1)+": ");
            CuentaBancaria.setDNI(scanner.nextLine());
            System.out.println("| Ingrese su Sexo"+(i+1)+": ");
            CuentaBancaria.setSexo(scanner.nextLine());
            System.out.println("| Ingrese su Edad "+(i+1)+": ");
            CuentaBancaria.setEdad(scanner.nextInt());
            CuentaBancaria.setDinero(0);
            CuentaBancaria.setcbu(CBU);
        }
        
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
