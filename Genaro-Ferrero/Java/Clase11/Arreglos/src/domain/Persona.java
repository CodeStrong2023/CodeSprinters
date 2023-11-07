
package domain;

public class Persona {
    // Atributo
    private String nombre;
    // Costructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Getter Setter
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // To String

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}'+", " +super.toString() ;
    }
    
}
