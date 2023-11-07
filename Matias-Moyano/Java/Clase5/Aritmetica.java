package Clase5;

public class Aritmetica {
    int a;
    int b;

    //Metodo
    public void sumarNumeros (){
        int resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    public int sumarNumeros2 (){
        int resultado = a + b;
        return resultado;
    }
    public int sumarNumeros3 (int a, int b){
        int resultado = a + b;
        return resultado;
    }
}
