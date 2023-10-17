package Java.JavaClases.pasoPorReferencia;
import Clases.ClaseN4_Persona;
public class pasoPorReferencia {
    public static void main(String[] args) {
    ClaseN4_Persona ClaseN4_Persona1 = new ClaseN4_Persona();
    persona1.nombre ="Enter";
    System.out.println("persona1 nombre = "+ persona1.nombre);
    cambiarValor(persona1);
    System.out.println("El cambio que hicimos en el nombre es: "+ persona1);
    }

    public static void cambiarValor(ClaseN4_Persona persona) {
        persona.nombre = "Maria";
    }
    public static ClaseN4_Persona cambiarValor( ClaseN4_Persona persona){
        persona.nombre= "Monica";
        return persona;
    }
        
    }

}
