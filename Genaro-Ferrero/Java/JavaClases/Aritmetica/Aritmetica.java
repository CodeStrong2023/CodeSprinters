public class Aritmetica {

    // Atributos
    int a;
    int b;

    // Método para sumar e imprimir el resultado
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("Resultado=" + resultado);
    }

    // Método para sumar y devolver el resultado
    public int sumarConRetorno() {
        return a + b;
    }

    // Método para sumar los argumentos - operador this
    public int sumarConArgumentos(int arg1, int arg2) {
       this.a = arg1; // El argumento a se asigna al atributo
        this.b = arg2;
       //  return a + b;
       return this.sumarConRetorno();
    }

}