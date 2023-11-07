package Clase6;

public class main {
    public static void main(String[] args) {
        int a = 10; //variable local
        int b = 7;  // memoria stack
        miMetodo();
        //usando constructor vacio
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumarNumeros();
        //para almacenar un objeto o los atributos se utiliza memoria heap
        int resultado = aritmetica1.sumarNumeros2();
        System.out.println("El resultado de la suma es: " + resultado);
        int resultado2 = aritmetica1.sumarNumeros3(5, 8);
        System.out.println("El resultado de la suma es: " + resultado2);
        //usando constructor con argumentos
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        aritmetica2.sumarNumeros();
        //aritmetica1 = null; nunca se debe hacer esto
        //System.gc(); //garbage collector es pesado no se debe usar
    }
    public static void miMetodo (){
        int a = 10;
        System.out.println("Aqui hay otro metodo");
    }
}
