package Clase6.proyectocaja.caja;

public class PruebaCaja {
    public static void main(String[] args) {
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundidad = 6;

        Caja caja1 = new Caja();
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProfundidad;
        int resultado = caja1.calcularVolumen(); //se llama al metodo
        System.out.println("El volumen de la caja es: " + resultado);

        Caja caja2 = new Caja(2, 4, 6);
        int resultado2 = caja2.calcularVolumen(); //se llama al metodo
        System.out.println("El volumen de la caja es: " + resultado2);
    }
}
