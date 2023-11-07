
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
    private double saldo;
    
    
    
    
    // Constructor por defecto
    public CuentaBancaria() {
    }
    // Constructor completo
    
    public CuentaBancaria( String nombreUsuario, String contra, String nombreReal, String DNI, String sexo, int edad, double dinero,double saldo, String cbu) {
        this.nombreUsuario = nombreUsuario;
        this.contra = contra;
        this.nombreReal = nombreReal;
        this.DNI = DNI;
        this.sexo = sexo;
        this.edad = edad;
        this.dinero = dinero;
        this.cbu = cbu;
        this.saldo = saldo;
      
        
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
    
    public double getSaldo() {
    return this.saldo;
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

     public void setSaldo (double saldo) {
        this.saldo = saldo;
        
    }
    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
     // To String
     // Esto sera una salida para mostrar nuestra cuenta creada ...
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("|                       Cuenta Creada con Éxito                        |\n");
        sb.append("| Nombre de Usuario: ").append(nombreUsuario).append("\n");
        sb.append("| Contraseña: ").append(contra).append("\n");
        sb.append("| Nombre: ").append(nombreReal).append("\n");
        sb.append("| D.N.I: ").append(DNI).append("\n");
        sb.append("| Sexo: ").append(sexo).append("\n");
        sb.append("| Edad: ").append(edad).append("\n");
        sb.append("| Saldo: ").append(dinero).append("\n");
        sb.append("| C.B.U: ").append(cbu).append("\n");
    return sb.toString();
}
    
    
   
}
