class Producto:
    contador_productos = 0

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1
        self._id_producto = Producto.contador_productos
        self._nombre = nombre
        self._precio = precio
    # Metodo setter and getter
    @property
    def nombre(self):
        return self.nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, precio):
        self._precio = precio
    # Metodo STR
    def __str__(self):
        return f"Id Producto: {self._id_producto}, Nombre: {self._nombre},Precio: {self._precio}"


if __name__ == "__main__": #Solo será visible si la prueba se ejecuta desde aqui
    producto1 = Producto("Camiseta", 100.00)
    producto2 = Producto("Pantalon", 150.00)
    producto3 = Producto("Calzoncillo", 60.00)
    producto4 = Producto("Medias", 20.00)
    producto5 = Producto("Buzo", 300.00)
    producto6 = Producto("Traje de Pana", 1000.00)
    producto7 = Producto("Shorts", 80.00)
    producto8 = Producto("Musculosa", 120.00)
