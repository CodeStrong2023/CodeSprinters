package Clase9;
import java.util.Date;
public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    //Constructores
    public Cliente(Date fechaRegistro, boolean vip) {
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
    }
    public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip) {
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
    }
    //getters
    public int getIdCliente() {
        return this.idCliente;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    public boolean isVip() {
        return this.vip;
    }
    //setters
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(this.idCliente);
        sb.append(", fechaRegistro=").append(this.fechaRegistro);
        sb.append(", vip=").append(this.vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
