package Java.JavaClases.JavaEjercicios.pasoPorValor;

public class pasoPorValor {
    public static void main(String[] args) {
        var valorX=20;
         System.out.println("valorX ="+ valorX);
         cambioValor(valorX);
         System.out.println("ValorX ="+ valorX);
    }

    public static void  cambioValor(int arg1) {
        System.out.println("arg1 ="+arg1);
        arg1 = 15;
    }

}