
package test;

import domain.Persona;

public class TestArreglosObjets {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2]; 
        personas[0] = new Persona("Genaro");
        personas[1] = new Persona("Facundo");
        System.out.println("personas O= " + personas [0]);
        System.out.println("personas O= " + personas [1]);
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("Personas"+i+"= "+ personas[i]);
        }
        String frutas[] = {"Banana","Pera","Durazno"};
         for(int i = 0; i < frutas.length; i++){
            System.out.println("Frutas"+i+"= "+ frutas[i]);
        }
    }
}
