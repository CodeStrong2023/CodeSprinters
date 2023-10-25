package CodeSprinters.Proyecto_Integrador;
public class CuentaBancaria {
    private int numeroDeCuenta;
    private String nombreUsuario;
    private String contra;
    private String nombreReal;
    private String DNI;
    private String sexo;
    private int edad;
    private double dinero;
    private String cbu;

    // Constructor completo
    public CuentaBancaria(int numeroDeCuenta, String nombreUsuario, String contra, String nombreReal, String DNI, String sexo, int edad, double dinero, String cbu) {
        this.numeroDeCuenta = numeroDeCuenta;
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
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    //...Demás getters
    
    // Setters
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    //...Demás setters

    public void depositar(double monto) {
        if (monto > 0) {
            this.dinero += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && this.dinero >= monto) {
            this.dinero -= monto;
            return true;
        }
        return false;
    }
}

