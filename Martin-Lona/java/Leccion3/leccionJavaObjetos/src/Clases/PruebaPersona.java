
package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();// Llamamos al constructor
        persona1.nombre = "Ariel"; // El valor hexadecimal normalemnte comienza con 0x
        persona1.apellido = "Betancud";
        persona1.obtenerinformacion();
           
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerinformacion();
        persona2.nombre = "Oslvado";
        persona2.apellido = "Giordanini";
        persona2.obtenerinformacion();
    }
}
