package Clase6.proyectocaja.caja;

public class Caja {
    int ancho;
    int alto;
    int profundidad;
    //constructor vacio
    public Caja(){
     
    }
    //Constructor con parametros
    public Caja(int ancho, int alto, int profundidad){
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    //Metodo
    public int calcularVolumen(){
        return ancho * alto * profundidad;
    }

}
