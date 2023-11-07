package Clase9;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    //Constructores
    public Empleado(String nombre,double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    //getters
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    public double getSueldo() {
        return this.sueldo;
    }
    //setters
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //StringBuilder es mas eficiente que String para concatenar
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado); //append: agrega al final
        sb.append(", sueldo=").append(this.sueldo); 
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
   


}
