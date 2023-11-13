package Clase12;
import Clase10.Persona;
public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2]; //3 filas, 2 columnas
        System.out.println("edades = " + edades);
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 9;
        edades[2][0] = 10;
        edades[2][1] = 11;
        System.out.println("edades[0][0] = " + edades[0][0]);
        System.out.println("edades[0][1] = " + edades[0][1]);
        System.out.println("edades[1][0] = " + edades[1][0]);
        System.out.println("edades[1][1] = " + edades[1][1]);
        System.out.println("edades[2][0] = " + edades[2][0]);
        System.out.println("edades[2][1] = " + edades[2][1]);

        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades[" + fila + "][" + col + "] = " + edades[fila][col]);
            }
        }
        //String frutas[][] = new String[3][2];
        //Sintaxis simplificada
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora", "Mora"}, {"Kiwi", "Manzana"}};
        for (int fila = 0; fila < frutas.length; fila++) {
            for (int col = 0; col < frutas[fila].length; col++) {
                System.out.println("frutas[" + fila + "][" + col + "] = " + frutas[fila][col]);
            }
        }

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Pedro");
        personas[1][0] = new Persona("Laura");
        personas[1][1] = new Persona("Andres");
        personas[1][2] = new Persona("Lucia");
        imprimir(personas);
    }
    public static void imprimir(Object matriz[][]) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println("matriz[" + fila + "][" + col + "] = " + matriz[fila][col]);
            }
        }
    }
}
