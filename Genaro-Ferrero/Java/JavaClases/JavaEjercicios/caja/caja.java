package Java.JavaClases.JavaEjercicios.caja;

public class caja {
    
    // Atributos
    int ancho;
    int alto;
    int profundo;

     // Costructor vacio
    public caja(){
    }

    // Constructor con parametros
    public caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // Metodo para calcular el volumen 
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}
