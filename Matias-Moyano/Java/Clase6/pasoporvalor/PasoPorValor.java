package Clase6.pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorx = 20;
        System.out.println("El valor de x es: " + valorx);
        cambioValor(valorx); // solo le enviamos una copia del valor de la variable
        System.out.println("El nuevo valor de x es: " + valorx);
    }
    public static void cambioValor (int arg1){
        System.out.println("El valor del argumento es: " + arg1);
        arg1 = 15;
    }
}
