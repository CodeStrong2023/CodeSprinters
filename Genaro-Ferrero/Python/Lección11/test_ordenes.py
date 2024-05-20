from Orden import Orden
from Producto import Producto


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
print(f"Total de la orden 1: ´{orden1.calcular_total()}")
productos2 = [producto1, producto2, producto4, producto6, producto7]
orden2 = Orden(productos1)
orden3 = Orden(productos2)
orden3.agregar_productos(producto3)
orden3.agregar_productos(producto8)
orden3.agregar_productos(producto5)
print(orden2)
print(f"Total de la orden 2: ´{orden2.calcular_total()}")
print(orden3)
print(f"Total de la orden 3: ´{orden3.calcular_total()}")