
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;


public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon",25000);
        Producto producto2 = new Producto("Remera",20000);
        Producto producto3 = new Producto("Campera",60000);
        Producto producto4 = new Producto("Medias",2500);
        Producto producto5 = new Producto("Slips",3000);
        Producto producto6 = new Producto("Pantalon Corto",10000);
        Producto producto7 = new Producto("Zapatillas",30000);
        Producto producto8 = new Producto("Chomba",20000);
        Producto producto9 = new Producto("Sueter",45000);
        Producto producto10 = new Producto("Camperon",75000);
        Orden orden1 = new Orden();
        // Agregamos productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        // Orden 2
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
        // Orden 3
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto1);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto3);
        orden3.agregarProducto(producto6);
        orden3.mostrarOrden();
        // Orden 4
        Orden orden4 = new Orden();
        orden4.agregarProducto(producto2);
        orden4.agregarProducto(producto4);
        orden4.agregarProducto(producto4);
        orden4.agregarProducto(producto5);
        orden4.mostrarOrden();
        // Tarea: Crear mas objetos de tipo producto
        // Crear mas objetos de tipo orden
        // Mostrarlos
    }
}
