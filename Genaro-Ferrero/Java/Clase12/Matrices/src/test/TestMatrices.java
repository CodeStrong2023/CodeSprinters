
package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        // lado de izquierda es la definicion 
        // El primer numero son las filas el segundo las columnas
        int edades[][] = new int [3][2];
        System.out.println("Edades = " + edades);
        // LLenado manual
        edades[0] [0] = 5;
        edades[0] [1] = 7;
        edades[1] [0] = 8;
        edades[1] [1] = 4;
        edades[2] [0] = 5;
        edades[2] [1] = 10;

        System.out.println("Edades 0-0 = " + edades[0][0]);
        System.out.println("Edades 0-1 = " + edades[0][1]);
        System.out.println("Edades 1-0 = " + edades[1][0]);
        System.out.println("Edades 1-1 = " + edades[1][1]);
        System.out.println("Edades 2-0 = " + edades[2][0]);
        System.out.println("Edades 2-1 = " + edades[2][1]);
        
        System.out.println("Recorremos la matriz con un For");
        for (int fila = 0; fila < edades.length; fila ++){
            for (int col = 0; col < edades[fila].length; col++){
                System.out.println("Edades " + fila + "-" + col+ ": "+ edades[fila][col]);
            }
        }
        // Sintaxis clasica
        // String frutas [][] = new String [3][2];
        // Sintaxis simplificada
        String frutas [][]= {{"Limon","Pomelo"},{"Ciruela","kiwi"},{"Banana","Manzana"}};
        // Lo imprimimos 
        System.out.println("Imprimimos la matriz Frutas");
        imprimir(frutas);
//        for (int i = 0; i < frutas.length; i ++){
//            for (int j = 0; j < frutas[i].length; j++){
//                System.out.println(" Frutas " + i + "-" + j + ": "+ frutas[i][j]);
//            }
//        }
        // Creamos una matriz de objetos 
        Persona personas [][] = new Persona [2][3];
        // Asignamos valores a la matriz
        personas[0][0] = new Persona ("Ariel");
        personas[0][1] = new Persona ("Gena");
        personas[0][2] = new Persona ("Pedro");
        personas[1][0] = new Persona ("Enzo");
        personas[1][1] = new Persona ("Matias");
        personas[1][2] = new Persona ("Joel");
        
        System.out.println("Imprimimos la matriz Personas");
        imprimir(personas);
    }
    public static void imprimir (Object matriz[][]){
        System.out.println("Imprimimos la Matriz");
        for (int i = 0; i < matriz.length; i ++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println(" matriz " + i + "-" + j + ": "+ matriz[i][j]);
            }
        }
    }
}