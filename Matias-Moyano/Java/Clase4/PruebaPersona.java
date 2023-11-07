package Clase4;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1; // Declaracion de la variable persona1 de tipo Persona
        persona1 = new Persona(); // LLamada al constructor de la clase Persona
        persona1.apellido = "Karla";
        persona1.nombre = "Gomez";
        persona1.obtenerInformacion();
        Persona persona2 = new Persona();
        persona2.apellido = "Lopez";
        persona2.nombre = "Juan";
        persona2.obtenerInformacion();
    }
}
