package main;
import OpcionesMenu.CuentaBancaria;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaBancario{
    private static Scanner scanner = new Scanner(System.in);
    // declaramos un array donde se van a guardar las cuentas bancarias
    private static ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
    /* 
     * [ cuenta1, cuenta2, cuenta3, ...]
     * cuenta1 : {
     * nombreUsuario: "usuario1",
     * contra: "contra1",
     * nombreReal: "nombreReal1",
     * DNI: "DNI1",
     * sexo: "sexo1",
     * edad: 1,
     * dinero: 1.0,
     * cbu: "cbu1"
     * }
     */
    //funcion main que se va a ejecutar cada vez que se inicie el programa
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
        BigInteger bigInt = new BigInteger(70, random); // 70 bits para asegurar 22 dígitos en la mayoría de los casos
        
        String CBU = bigInt.toString(10); // Convertir a base 10 para obtener solo números
        
        // Ajustar la longitud a 22 dígitos (agregar ceros a la izquierda si es necesario)
        while (CBU.length() < 22) {
            CBU = "0" + CBU;
        }
    
    
        CuentaBancaria cuenta = new CuentaBancaria();
        scanner.nextLine(); // Consumir el \n restante después de scanner.nextInt()
    
        System.out.println("| Ingrese su Nombre de Usuario: ");
        cuenta.setNombreUsuario(scanner.nextLine());
        System.out.println("| Ingrese su Nombre Completo: ");
        cuenta.setNombreReal(scanner.nextLine());
        System.out.println("| Ingrese su Contraseña: ");
        cuenta.setContra(scanner.nextLine());
        System.out.println("| Ingrese su DNI: ");
        cuenta.setDNI(scanner.nextLine());
        System.out.println("| Ingrese su Sexo: ");
        cuenta.setSexo(scanner.nextLine());
        System.out.println("| Ingrese su Edad: ");
        cuenta.setEdad(scanner.nextInt());
        cuenta.setDinero(0);
        cuenta.setCbu(CBU);
        
        cuentas.add(cuenta); // Agregar la cuenta creada al ArrayList
    }
    

    private static void depositarDinero() {
        
    }

    private static void retirarDinero() {
        
    }

    private static void transferirDinero() {
       
    }

    private static void mostrarDatosCuenta() {
        System.out.println("|  ------------------------------------------------------------------- |");
        System.out.println("|                      Mostrar Datos de la Cuenta                      |");
        System.out.println("|  ------------------------------------------------------------------  |");
        
        System.out.println("| Ingrese su Nombre de Usuario: ");
        String usuarioInput = scanner.next();
        System.out.println("| Ingrese su Contraseña: ");
        String contraInput = scanner.next();
        
        // Buscando la cuenta en el ArrayList
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNombreUsuario().equals(usuarioInput) && cuenta.getContra().equals(contraInput)) {
                System.out.println(cuenta.toString());
                return;
            }
        }
        
        // Si no encuentra la cuenta, mostrar mensaje de error
        System.out.println("|  ------------------------------------------------------------------- |");
        System.out.println("|            No se encontró una cuenta con esos datos                  |");
        System.out.println("|  ------------------------------------------------------------------  |");
    }
    
}
