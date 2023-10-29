
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Genaro",150.000,false);
        System.out.println("Persona1 su nombre es: " + persona1.getNombre());
        // Modificar a travez de los metodos
        persona1.setNombre("Juan Ignacio");
        // Accedemos al metodo
        System.out.println("Persona1 su nombre modificado es: " + persona1.getNombre());
        System.out.println("Sueldo Persona1 :"+ persona1.getSueldo());
        System.out.println("Boleano Persona1 :"+ persona1.isEliminado());
        // Tarea: Crear otro objeto de tipo persona, asignar valores de manera inicial
        // Imprimir, modificar sus valores y volver a imprimir
        System.out.println("persona1: " + persona1.toString());
        // Lo llama solo con soutv + tab
        System.out.println("persona1 = " + persona1);
    }
}
