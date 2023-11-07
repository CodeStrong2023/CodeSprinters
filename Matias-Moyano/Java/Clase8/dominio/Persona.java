package dominio;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private boolean eliminado;

    //Constructor
    public Persona(String nombre, String apellido, int edad, boolean eliminado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.eliminado = eliminado;
    }
    //Constructor vacio
    public Persona() {
    }
    //Metodos
    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public boolean isEliminado() {
        return eliminado;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + this.nombre + ", apellido=" + this.apellido + ", edad=" + this.edad + ", eliminado=" + this.eliminado + '}';
    }

}
