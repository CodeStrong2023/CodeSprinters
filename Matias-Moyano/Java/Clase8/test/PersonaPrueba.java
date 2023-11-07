package test;
import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Matias", "Moyano", 25, false);
        System.out.println("Persona nombre: " + persona1.getNombre());
        //modificar a través de los metodos set
        persona1.setNombre("Matias2");
        persona1.setApellido("Moyano2");
        System.out.println("Persona nombre modificado: " + persona1.getNombre());
        //Tarea: crear un objeto persona2 y mostrar sus atributos
        //imprimir, modificar sus valores y volver a imprimir
        Persona persona2 = new Persona("Juan", "Perez", 30, false);
        System.out.println("Persona nombre: " + persona2.getNombre());
        //modificar a través de los metodos set
        persona2.setNombre("Juan2");
        persona2.setApellido("Perez2");
        persona2.setEdad(35);
        persona2.setEliminado(true);
        System.out.println("Persona nombre modificado: " + persona2.getNombre());
        System.out.println("Persona edad: " + persona2.getEdad());
        System.out.println("Persona eliminado: " + persona2.isEliminado());
        System.out.println("Persona: " + persona2.toString());
        System.out.println("Persona: " + persona2);
    }
}
