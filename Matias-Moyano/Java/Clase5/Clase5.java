package Clase5;

public class Clase5 {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 5;
        aritmetica.b = 10;
        aritmetica.sumarNumeros();
        var resultado = aritmetica.sumarNumeros2();
        System.out.println("El resultado de la suma es: " + resultado);
        var resultado2 = aritmetica.sumarNumeros3(5, 10);
        System.out.println("El resultado de la suma es: " + resultado2);
    }
}
