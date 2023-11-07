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
        double saldo = 1000;
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
    
    // Metodos que se utilizaran en las Clases.
    
    // Metodo para comprobar si el nombre tiene números 
    private static boolean tieneNumeros(String str) {
    for (char c : str.toCharArray()) {
        if (Character.isDigit(c)) {
            return true;
        }
    }
    return false;
    }
    
    // Metodo para la contraseña
    // En este metodo creamos el requisito de que se tenga al menos un número y una mayuscula 
    private static boolean cumpleRequisitosContrasena(String str) {
    boolean tieneNumero = false;
    boolean tieneMayuscula = false;

    for (char c : str.toCharArray()) {
        if (Character.isDigit(c)) {
            tieneNumero = true;
        } else if (Character.isUpperCase(c)) {
            tieneMayuscula = true;
        }

        if (tieneNumero && tieneMayuscula) {
            return true;
        }
    }
    return false;
    }
    
    // Métodos para las funcionalidades
    private static boolean verificacionRobot() {
        // Implementación de la verificación de robot
        return true; // Por ahora siempre retorna true
    }
    
    // Metodo para verigicar el largo de los DNI
    private static boolean esDNIValido(String dni) {
    if (dni.matches("\\d{7,8}")) {
        return true;
    }
    return false;
    }
    
    // Metodo para poner como validas las respuestas M y F 
    // Refiriendonos con M: Masculino y F: femenino
    private static boolean esSexoValido(String sexo) {
    return sexo.equals("M") || sexo.equals("F");
    }
    
    // Metodo para pedir una edad mayor a 16 y menor de 100 años 
    private static boolean esEdadValida(int edad) {
    return edad >= 16 && edad < 100;
    }
    // Metodo para limpiar pantalla 
    public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }
    
    // Metodo para inicializar seccion 
    /*
     * Con este podremos iniciar sesion a una cuenta especifica 
     * Lo utilizaremos en muchas opciones 
     * Conciste en un Do que pide un nombre de usuario 
     * y lo ingresa al Metodo buscarCuentaPorUsuario 
     * si encuentra un usuario continua pidiendo la contraseña
     * si no la encuentra avisa que el usuario es incorrecto y inicia nuevamente 
     * Luego pide la contraseña 
     * si la contraseña no es igual a la correspondiente con la cuentra encontrada
     * avisa que la contraseña es incorrecta y pide nuevamente el usuario
     * si la contraseña es correcta da inicio a la sesión indicando Sesion es iniciada con exito
     */

    private static CuentaBancaria iniciarSesion() {
        do {
            System.out.println("|  ------------------------------------------------------------------- |");
            System.out.println("|                     Iniciar Sesión en su Cuenta                       |");
            System.out.println("|  ------------------------------------------------------------------  |");
    
            System.out.println("| Ingrese su Nombre de Usuario: ");
            String usuarioInput = scanner.next();
    
            // Buscando la cuenta en el ArrayList
            CuentaBancaria cuentaEncontrada = buscarCuentaPorUsuario(usuarioInput);
    
            if (cuentaEncontrada == null) {
                System.out.println("|  ------------------------------------------------------------------- |");
                System.out.println("|           Nombre de Usuario Incorrecto. Intente nuevamente           |");
                System.out.println("|  ------------------------------------------------------------------  |");
                continue;
            }
    
            System.out.println("| Ingrese su Contraseña: ");
            String contraInput = scanner.next();
    
            if (cuentaEncontrada.getContra().equals(contraInput)) {
                System.out.println("|  ------------------------------------------------------------------- |");
                System.out.println("|             Sesión Iniciada con Éxito                                |");
                System.out.println("|  ------------------------------------------------------------------  |");
                return cuentaEncontrada;
            } else {
                System.out.println("|  ------------------------------------------------------------------- |");
                System.out.println("|             Contraseña Incorrecta. Intente nuevamente                |");
                System.out.println("|  ------------------------------------------------------------------  |");
                continue;
            }
        } while (true);
    }

    // Metodo buscar cuenta por Usuario 
    /*
     * Este metodo  es utilizado en el metodo InicialSesion y sirve el nombre de usuario 
     * en el arrayd cuenta y verificar si estos son iguales o no 
     * si No Encuentra la cuenta retornara un Null 
     */
    private static CuentaBancaria buscarCuentaPorUsuario(String nombreUsuario) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNombreUsuario().equals(nombreUsuario)) {
                return cuenta;
            }
        }
        return null; // Si no se encuentra la cuenta
    }
    
     //método ingreso de dinero mayor que cero
     private static boolean esMontoValido(double dinero) {
     return dinero > 0;
     }
 

   public static void crearCuenta() {
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
    
    // Pedimos el nombre de Usuario
    System.out.println("| Ingrese su Nombre de Usuario: ");
    cuenta.setNombreUsuario(scanner.nextLine());
    
    // Pedimos el nombre Real 
    System.out.println("| Ingrese su Nombre Completo: ");
    String nombreReal = scanner.nextLine();
    // Con esate ciclo while le decimos al usuario que su nombre real no puede contener números 
    while (tieneNumeros(nombreReal)) {
        System.out.println("| No pueden ingresarse números en el nombre. Intente nuevamente: ");
        nombreReal = scanner.nextLine();
    }
    cuenta.setNombreReal(nombreReal);
    
    // Pedimos la contraseña 
    System.out.println("| Ingrese su Contraseña: ");
    String contrasena = scanner.nextLine();

    // En este siclo while revisamos que funcione el requisitoContraseña en nuestro codigo 
    while (!cumpleRequisitosContrasena(contrasena)) {
    System.out.println("| La contraseña debe contener al menos un número y al menos una letra mayúscula. Intente nuevamente: ");
    contrasena = scanner.nextLine();
    }
    cuenta.setContra(contrasena);
    
    // Pedimos el D.N.I
    System.out.println("| Ingrese su DNI: ");
    String dni = scanner.nextLine();
    // En este siclo while revisamos que el dni tenga o no entre 7 o 8 digitos 
    while (!esDNIValido(dni)) {
    System.out.println("| El DNI debe tener entre 7 y 8 Numeros ");
    System.out.println("| Ingrese su DNI: ");
    dni = scanner.nextLine();
    }
    cuenta.setDNI(dni);
    
    // Pedimos el Sexo  
    System.out.println("| Ingrese su Sexo Con F o M ");
     System.out.println("| Refiriendonos F: Femenino M: Masculino ");
    String sexo = scanner.nextLine();
    // En el signo While indicamos si el valor dado por el usuario es correcto 
    while (!esSexoValido(sexo)) {
    System.out.println("| Ingrese un valor válido para el sexo (M = Masculino: F=Femenino ): ");
    sexo = scanner.nextLine();
    }
    cuenta.setSexo(sexo);
    
    // Pedimos la edad 
    System.out.println("| Ingrese su Edad: ");
    int edad = scanner.nextInt();
    
    // En este while 
    while (!esEdadValida(edad)) {
    if (edad < 16) {
        System.out.println("| La aplicación no acepta personas menores de 16 años.");
        System.out.println("| Ingrese su Edad:");
    } else {
        System.out.println("| La aplicación no acepta personas mayores de 100 años.");
        System.out.println("| Ingrese su Edad:");
    }
    edad = scanner.nextInt();
    }
    cuenta.setEdad(edad);
    
    // Seteamos su Dinero Inicial como "0" ya que solo ha creado la cuenta 
    // Aun el usuario no a ingresado Dinero
    cuenta.setDinero(0);
    
    // Le damos a el Usuario Un CBU: Este se generara aleatoriamente sera númerico 
    // Y con un largo de 22 caracteres 
    cuenta.setCbu(CBU);
    
    // Esta linea agrega la cuenta a la Arrayd cuentas.
    cuentas.add(cuenta); 
    clearScreen();
    // Le decimos al Usuario que su cuenta fue creada con exito 
    System.out.println(cuenta.toString());
    System.out.println("|  ------------------------------------------------------------------- |");
    System.out.println("|              Presione cualquier tecla para continuar...              |");
    System.out.println("|  ------------------------------------------------------------------- |");
 
    scanner.nextLine(); // Consumir el \n restante después de scanner.nextInt()
}

    private static void depositarDinero() {
    System.out.println("|  ------------------------------------------------------------------- |");
    System.out.println("|                              Depositar Dinero                        |");
    System.out.println("|  ------------------------------------------------------------------  |");
    
    // Mostrar el saldo
    System.out.println("Su Saldo Actual es :" + saldo + "Dolares");
    
    // Pedimos el dinero a Depositar
    System.out.println("| Ingrese Cantidad de Dinero a depositar: ");
    double dinero = scanner.nextInt();
    
    // En el ciclo While indicamos que el valor dado por el usuario debe ser mayor a cero
    while (!esMontoValido(dinero)) {
    if (dinero < 0) {
        System.out.println("| La aplicación no acepta monto menores a cero.");
        System.out.println("| Ingrese otro Monto a depositar : ");
        dinero = scanner.nextInt();
    } else {
            saldo = saldo + dinero; 
    }
    // Mostramos el saldo final
   System.out.println("Su Saldo Actual es :" + saldo + "Dolares");
    }
        

    private static void retirarDinero() {
        
    }
        
   

    private static void transferirDinero() {
       
    }


    private static void mostrarDatosCuenta() {
        // Llamamos al metodo Cuenta 
        CuentaBancaria cuenta = iniciarSesion();
        // Si la cuenta es encontrada damos la siguiente salida que muestra el to string de la Cuenta Bacaria 
        if (cuenta != null) {
         System.out.println("|  ------------------------------------------------------------------- |");
         System.out.println("|                  Cuenta Encontrada con Éxito                         |");
         System.out.println(cuenta.toString());
        } else {
            // Su la cuenta no es encontrada damos esta salida y volvemos a repetir el proceso 
            System.out.println("|  ------------------------------------------------------------------- |");
            System.out.println("|     No se encontró una cuenta con esos datos.                        |");
            System.out.println("|  ------------------------------------------------------------------  |");
        }
    }
}
