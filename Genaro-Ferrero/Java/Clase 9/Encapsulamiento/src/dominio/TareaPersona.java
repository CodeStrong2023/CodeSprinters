
package dominio;


public class TareaPersona {
    // Atributos
     private String nombre;
     private double peso;
     private double  altura;
     
     // Constructor
    public TareaPersona(String nombre,double peso,double altura){
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }
    // Metodos 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String toString(){
        return " Nombre: " + this.nombre +
                " Peso: " + this.peso +
                " kg  Altura: " + this.altura + " m";
    }
}
