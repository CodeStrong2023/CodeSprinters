from Producto import Producto


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_productos(self, producto):
        self._productos.append(producto)  # Esto para agregar un nuevo producto

    def calcular_total(self):
        total = 0  # Variable temporal para almacenar el total temporal
        for producto in self._productos:
            total += producto.precio
        return total

    def __str__(self):
        productos_str = " "
        for producto in self._productos:
            productos_str += producto.__str__() + "|"
        return f"Orden: {self.id_orden}, \nProducto: {productos_str} "


if __name__ == "__main__":
    # Productos
    producto1 = Producto("Camiseta", 100.00)
    producto2 = Producto("Pantalon", 150.00)
    producto3 = Producto("Calzoncillo", 60.00)
    producto4 = Producto("Medias", 20.00)
    producto5 = Producto("Buzo", 300.00)
    producto6 = Producto("Traje de Pana", 1000.00)
    producto7 = Producto("Shorts", 80.00)
    producto8 = Producto("Musculosa", 120.00)

    productos1 = [producto1, producto2]  # Lista de productos
    orden1 = Orden(productos1)
    print(orden1)
    productos2 = [producto1, producto2, producto3, producto4, producto5, producto6, producto7, producto8]
    orden2 = Orden(productos1)
    orden3 = Orden(productos2)
    print(orden2)
    print(orden3)
# Tareas : MOdificar la orden2, ingresando nuevos productos con sus nombres y precios
# Crear una nueva lista de productos y agregarla a la orden2