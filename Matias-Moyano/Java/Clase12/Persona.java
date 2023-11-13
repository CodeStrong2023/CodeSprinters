package Clase12;

public /* final */ class Persona {
    private String nombre; 
    protected char genero;//protected: solo se puede acceder desde la misma clase o desde una clase hija
    protected int edad;
    protected String direccion;
    
    //sobrecarga de constructores: varios constructores con distintos parametros
    //constructor vacio
    public Persona() {
        
    }

    //constructor con un parametro
    public Persona(String nombre) {
        this(); //llama al constructor vacio
        this.nombre = nombre;
    }

    //constructor con todos los parametros
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    //getters
    public final String getNombre() {
        return this.nombre;
    }
    public char getGenero() {
        return this.genero;
    }
    public int getEdad() {
        return this.edad;
    }
    public String getDireccion() {
        return this.direccion;
    }
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //toString con StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //StringBuilder es mas eficiente que String para concatenar
        sb.append("nombre=").append(this.nombre); //append: agrega al final
        sb.append(", genero=").append(this.genero); 
        sb.append(", edad=").append(this.edad); 
        sb.append(", direccion=").append(this.direccion); 
        sb.append(", ").append(super.toString()); //super.toString() llama al toString de la clase padre (Object
        return sb.toString();
    }
    
}

