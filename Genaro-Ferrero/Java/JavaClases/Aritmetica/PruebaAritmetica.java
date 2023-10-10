public class PruebaAritmetica {
    public static void main(String[] args) {

     miMetodo();

     Aritmetica aritmetica1 = new Aritmetica(); // aritmetica 1 es el objeto y aritmetica el contructor
     aritmetica1.a = 3; // asignamos valores a el objeto
     aritmetica1.b= 7;
     aritmetica1.sumarNumeros();

     int resultado = aritmetica1.sumarConRetorno();
     System.out.println("Resultado =" + resultado);

     resultado = aritmetica1.sumarConArgumentos(12, 16);
     System.out.println("Resultado usando Argumentos = " + resultado);

     System.out.println("Aritmetica1 a: "+aritmetica1.a);
     System.out.println("Aritmetica1 b: "+aritmetica1.b);

     Aritmetica aritmetica2 = new Aritmetica(5,8);
     System.out.println("Aritmetica2 a= "+ aritmetica2.a);
     System.out.println("Aritmetica2 b= "+ aritmetica2.b);
    }
    // Modularidad
    public static void miMetodo(){
        System.out.println("Aqui se agrego otro metodo");

    }
    // El objeto y atributo utiliza memoria Heap
    // Las variables locales utilizan memoria Stack
    // La memoria trabaja de manera dinamica
    // System.gc() Sirve para limpiar los residuos del programa
}
