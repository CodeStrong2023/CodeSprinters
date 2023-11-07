package Clase7;
public class main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Matias", "Moyano");
        
        System.out.println("Persona nombre: " + persona1.nombre);
        System.out.println("Persona apellido: " + persona1.apellido);
    }
}
class Persona {
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
