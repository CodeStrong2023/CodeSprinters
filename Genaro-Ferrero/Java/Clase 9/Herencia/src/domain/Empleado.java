
package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;// Incremento
    
    public Empleado(){
        this.idEmpleado = ++ Empleado.contadorEmpleados;
    }
    // Constructor
    public Empleado(String nombre, double sueldo) {
        //super(nombre);// No se puede usar la clase padre si llamamos a un contructor interno 
        this(); // Estamos llamando de aqui a un contructor interno vacio
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    // Metodo getter and setters
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    public double getSueldo() {
        return this.sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    // Generamos el toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
