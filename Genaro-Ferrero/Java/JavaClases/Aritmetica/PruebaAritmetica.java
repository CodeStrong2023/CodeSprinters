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
            // Seria como crear un nuevo objeto
     Persona persona = new Persona("Genaro","Ferrero");
     System.out.println("Persona = "+ persona);
     System.out.println("Nombre = "+ persona.nombre);
     System.out.println("Apellido = "+ persona.apellido);
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
// Tipo defualt o package
class Persona {
    String nombre;
    String apellido;

    Persona(String nombre,String apellido) {// Constructor
        super();// Llama al constructor padre 
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        // Muesta el espacio de memoria creado
        System.out.println("Objeto persona usando this"+this);
    }
}
 class Imprimir{
        public Imprimir(){
            super(); // El constructor de la clase padre, para reservar memoria 
        }
    
        public void imprimir(Persona persona){
          System.out.println("Persona desde la clase imprimir"+ persona);
          System.out.println("Impresion del objeto actual (this):" + this);
           }
        }
