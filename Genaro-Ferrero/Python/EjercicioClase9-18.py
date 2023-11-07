# Realizar similar al ejercicio del area del cuadrado pero con un cubo
class Cubo:
    def __init__(self,altura,ancho,profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad
    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad

print( "Digite los parametros para calcular el volumen de un prisma")
ancho = float(input("Ancho del prisma: "))
profundidad = float(input("Profundidad del prisma: "))
altura= float(input("Altura del prisma: "))

cubo1 = Cubo(altura,profundidad,ancho)
print(f"El volumen del prisma sera: {cubo1.calcular_volumen()}")
