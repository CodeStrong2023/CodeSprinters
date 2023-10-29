
package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Genaro");
        System.out.println("Persona1= " + persona1);
        Persona persona2 = new Persona("Matias");
        System.out.println("Persona2= " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        // this.contador = 10; No se puede referenciar desde contexto Estatico
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }
    // Esto es solo para imprimir
    public static void imprimir(Persona persona){
        System.out.println("Persona = " + persona);
    }
    // Podemos crear un objeto 
    public int getContador(){
        imprimir(new Persona("Joel"));
        return this.contador;
    }
}
