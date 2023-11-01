
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        /*.out.println("Proporciona el Titulo: ");
        String titulo = scanner.nextLine();
        System.out.println("Proporcione el Autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo +" fue escrito por:" + autor );*/

 /*byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte:" + Byte.MIN_VALUE );
        System.out.println("Valor maximo del Byte:" + Byte.MAX_VALUE );
        
        short numEnteroShort =  32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short:" + Short.MAX_VALUE );
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int:" + Integer.MAX_VALUE ); 
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del Long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo del Long:" + Long.MAX_VALUE );*/
 /*float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo del Float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo del Float:" + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo del Double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo del Double:" + Double.MAX_VALUE);*/
        // Interferencias de tipo var y tipos primitivos
        /*var numEntero = 20;//Las literasl sin punto automaticamente son del tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat =10.0F;//Automaticamnete con el punto se transforma en Double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        // Tipos primitivos char
//        char miVariableChar = 'a';
//        System.out.println("miVariableChar = " + miVariableChar);
//
//        char varCaracter = '\u0024';// Asiganmos a Java un valor unicode
//        System.out.println("varCaracter = " + varCaracter);
//        char varCaracterDecimal = 36; //Valor decimal del juego de carcteres unicode
//        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
//        char varCaracterSimbolo = '$';// Un caracter especial, podemos pegar y copiar desde Unicode
//        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
//
//        var varCaracter1 = '\u0024';// Asiganmos a Java un valor unicode
//        System.out.println("varCaracter1 = " + varCaracter1);
//        var varCaracterDecimal1 = (char)36; //Valor Entero y le asigna un tipo int
//        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
//        var varCaracterSimbolo1 = '$';// Un caracter especial, podemos pegar y copiar desde Unicode
//        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
//        
//        int varEnteroChar = '$';
//        System.out.println("varEnteroChar = " + varEnteroChar);
//        int caracterChar = 'b';
//        System.out.println("caracterChar = " + caracterChar);
//        
        //Conversion de tipos primitivos
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir valor
        var entrada = new Scanner (System.in);
        System.out.println("Digite su edad =");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);
        
        //Convertir tipos primitivos en Java parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter = ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        
        
        
        
        
        
        
        
    }

}
