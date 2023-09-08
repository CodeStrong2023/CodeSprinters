    public class ClaseN1 {
 // Ciclo While
        public static void main(String[] args) throws Exception {
            var conteo = 0; // Inferencia de tipos 
        System.out.println("Ciclo while");
        while (conteo <= 7) {
    System.out.println ("Conteo = "+ conteo );
    conteo ++;  // Vamos aumentando en uno la variable 
    }
 //  Ciclo Do While
    System.out.println("Ciclo Do While ");
    var contador = 0;
        do{
            System.out.println("Contador = " + contador);
            contador ++;
        }while(contador <=7); // En este caso hay que poner ; al final 
 // Ciclo For -Break -Continue - Etiqueta labels
    System.out.println( "Ciclo for");
        // En la primer parte: Se utiliza para declarar la variable 
        // En la segunda parte : Condicion a cumplir 
        // En la tercera parte : Incremento o decremento (Iterador)
         for ( var cuenta = 0; cuenta <=7 ; cuenta ++ ) {
            if(cuenta  % 2 == 0) // Para encontrar los numeros pares
        System.out.println( "Cuenta = " + cuenta ); // Si hay solo una linea de codigo no hace falta {}
           // break; // Sirve para romper un ciclo
         }
          System.out.println( "Palabra clave continue");
         for ( var cuenta = 0; cuenta <=7 ; cuenta ++ ) {
            if(cuenta  % 2 != 0) 
            continue; // Itera nuevamente 
        System.out.println( "Cuenta = " + cuenta ); 
        // Label con break no cecomendable
          System.out.println( "Label con break");
             inicio:
         for ( var cuentas = 0; cuenta <=7 ; cuentas++ ) {
            if(cuentas  % 2 == 0) 
         System.out.println( "Cuentas = " + cuentas ); 
             break inicio;
        }
    }}}

