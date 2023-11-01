package Java.JavaClases.JavaEjercicios.caja;

public class pruebaCaja {
// Metodo Main
public static void main(String[] args) {

    int medidaAncho = 3;
    int medidaAlto =2;
    int medidaProf =6;

    // Instanciamos el objeto
    caja caja1 = new caja();
    // Le damos valores al objeto
    caja1.ancho = medidaAncho;
    caja1.alto = medidaAlto;
    caja1.profundo = medidaProf;
    // Llamamos al método
    int resultado = caja1.calcularVolumen(); 

    //Primer resultado
    System.out.println(" El volumen de la caja 1 es de :"+ resultado);

    //Llamamos al contructor 2 
    caja caja2 = new caja(2,4,6);
    System.out.println("El volumen de la caja 2: "+caja2.calcularVolumen());
}
}
