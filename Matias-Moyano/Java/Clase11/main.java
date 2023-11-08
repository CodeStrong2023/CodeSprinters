package Clase11;
import Clase10.Persona;
public class main {
    public static void main(String[] args) {
        int edades [] = new int[3];
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;

        System.out.println("edades[0] = " + edades[0]);
        System.out.println("edades[1] = " + edades[1]);
        //edades[4] = 10; //error: ArrayIndexOutOfBoundsException error de consola
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades[" + i + "] = " + edades[i]);
        }
        Persona personas[] = new Persona[4];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        personas[2] = new Persona("Pedro");

        System.out.println("personas[0] = " + personas[0]);
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas[" + i + "] = " + personas[i]);
        }
        //arreglos con sintaxis resumida
        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas[" + i + "] = " + frutas[i]);
        }
    }
}
