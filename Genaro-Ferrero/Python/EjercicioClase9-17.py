# Elercicio de rectangulo
# Clase N°9
class Rectangulo:
    def __init__(self,altura,base):
        self.altura = altura
        self.base = base
    def calcular_area(self):
        return self.base * self.altura

base = float(input("Digite el número para la base del rectangulo: "))
altura = float(input("Digite el número para la altura del rectangulo: "))
rectangulo1 = Rectangulo(base,altura)
print(f"El area del rectangulo es: {rectangulo1.calcular_area()}")

