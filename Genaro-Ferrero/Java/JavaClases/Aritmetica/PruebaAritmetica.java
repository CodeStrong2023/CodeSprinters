public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica(); // aritmetica 1 es el objeto y aritmetica el contructor
     aritmetica1.a = 3; // asignamos valores a el objeto
     aritmetica1.b= 7;
     aritmetica1.sumarNumeros();

     int resultado = aritmetica1.sumarConRetorno();
     System.out.println("Resultado =" + resultado);

     resultado = aritmetica1.sumarConArgumentos(12, 16);
     System.out.println("Resultado usando Argumentos" + resultado);
    }
}
