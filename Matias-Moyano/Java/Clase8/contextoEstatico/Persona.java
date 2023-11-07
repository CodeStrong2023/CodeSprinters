package contextoEstatico;

public class Persona {
    private int idPersona;
    private static int contadorPersonas;
    private String nombre;

    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        //incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        //asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    } 
    //getters y setters
    public int getIdPersona() {
        return this.idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }
    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo toString
    @Override //sobreescribimos el metodo toString de la clase Object
    public String toString() {
        return "Persona{" + "idPersona=" + this.idPersona + ", nombre=" + this.nombre + '}';
    }
}
