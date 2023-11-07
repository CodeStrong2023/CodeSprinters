package Clase6.pasoporreferencia;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("Nombre persona1 = " + persona1.nombre);
        cambiarValor(persona1); //se pasa la referencia del objeto
        System.out.println("Nombre persona1 = " + persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = null;
        persona2 = cambiarElValor(persona2);
    }
    public static void cambiarValor(Persona persona){ //Parametro por referencia
        persona.nombre = "Karla";
    }
    public static Persona cambiarElValor(Persona persona){ //siempre hay que retornar un objeto
        if (persona == null){
           System.out.println("Valor de persona invalido: null");
           return null;
        }else{
           persona.nombre = "Monica";
           return persona;
        }

    }
}
