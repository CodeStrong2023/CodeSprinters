class Vehiculo:
    """
    Definir una clase padre llamada vehiculo y dos clases hijas llamadas 
    auto y bicicleta, las cuales heredan de la clase padre vehiculo
    . La clase padre debe tener los siguientes atributos y metodos:
    
    Vehiculo (clase padre)
    -atriburo (color, ruedas)
    -metodos (__init(color,ruedas)y ___srt__())
    
    auto(clase hija de vehiculo)
    -atributos (velocidad (km/hr)
    -metodos (__init(color,ruedas,velocidad) y __str__)
    
    Biciclerta (clase hija de vehiculo)
    -atributos (tipo (urbana /montaña /etc.))
    -metodos (__init__(color,ruedas,tipo) y __str__)
    
    crear un objeto de cada clase 
    """
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f"Color: {self.color}, Ruedas: {self.ruedas}"

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return f"Color: {self.color}, Ruedas: {self.ruedas}, Velocidad: {self.velocidad} km/hr"

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return f"Color: {self.color}, Ruedas: {self.ruedas}, Tipo: {self.tipo}"

# Crear objetos de cada clase
vehiculo_generico = Vehiculo("Rojo", 4)
auto = Auto("Azul", 4, 120)
bicicleta = Bicicleta("Verde", 2, "Montaña")

print("Vehículo genérico:", vehiculo_generico)
print("Auto:", auto)
print("Bicicleta:", bicicleta)