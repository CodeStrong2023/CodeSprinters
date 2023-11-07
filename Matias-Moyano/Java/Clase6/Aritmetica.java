package Clase6;

public class Aritmetica {
    int a;
    int b;

    //sobrecarga de constructores es cuando tenemos mas de un constructor en una clase
    //consttructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacio");
    }
    //constructor con dos argumentos
    public Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        System.out.println("Ejecutando constructor con dos argumentos");
    }
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