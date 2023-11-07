package Clase7;
public class main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Matias", "Moyano");
        
        System.out.println("Persona nombre: " + persona1.nombre);
        System.out.println("Persona apellido: " + persona1.apellido);
    }
}
class Persona {
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        new Imprimir().imprimir(this);
        //super(); // Llama al constructor de la clase padre
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }
}

class Imprimir{
    public Imprimir(){
        super();
    }

    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion de persona: " + this);
    }
}
