
package OpcionesMenu;

public class CuentaBancaria {

    
    private String nombreUsuario;
    private String contra;
    private String nombreReal;
    private String DNI;
    private String sexo;
    private int edad;
    private double dinero;
    private String cbu;

    // Constructor por defecto
    public CuentaBancaria() {
    }
    // Constructor completo
    
    public CuentaBancaria( String nombreUsuario, String contra, String nombreReal, String DNI, String sexo, int edad, double dinero, String cbu) {
        this.nombreUsuario = nombreUsuario;
        this.contra = contra;
        this.nombreReal = nombreReal;
        this.DNI = DNI;
        this.sexo = sexo;
        this.edad = edad;
        this.dinero = dinero;
        this.cbu = cbu;
    }
    
    // Getters 
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public String getContra() {
        return this.contra;
    }
    
    public String getNombreReal() {
        return this.nombreReal;
    }
    
    public String getDNI() {
        return this.DNI;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    public int getEdad () {
        return this.edad;
    }
    
    public double getDinero() {
        return this.dinero;
    }
    
    public String getCbu() {
        return this.cbu;
    }
    
    // Setters
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public void setContra(String contra) {
        this.contra = contra;
    }
    public static void setcbu(String CBU) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
     // To String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("|                       Cuenta Creada con Exito                        |");
        sb.append("| Nombre de Usuario: ").append(nombreUsuario);
        sb.append("| Contraseña: ").append(contra);
        sb.append("| Nombre: ").append(nombreReal);
        sb.append("| D.N.I: ").append(DNI);
        sb.append("| Sexo: ").append(sexo);
        sb.append("| Edad: ").append(edad);
        sb.append("| Saldo: ").append(dinero);
        sb.append("| C.B.U: ").append(cbu);
        return sb.toString();
    }
    
    
    
   
}
