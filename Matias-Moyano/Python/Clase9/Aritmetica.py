class Aritmetica:
    """ 
    El nombre de este comentario es: Docstring
    esto es documentacion de la clase
    Vamos a hacer en esta clase operaciones de suma, resta, multuiplicacion y mas

    """
    def __init__(self, operando1, operando2):
        self.operando1 = operando1
        self.operando2 = operando2
    def sumar(self):
        return self.operando1 + self.operando2
    def restar(self):
        return self.operando1 - self.operando2
    def multiplicar(self):
        return self.operando1 * self.operando2
    def dividir(self):
        return self.operando1 / self.operando2


aritmetica1 = Aritmetica(2, 4)
print(f"Resultado de la suma: {aritmetica1.sumar()}")
print(f"Resultado de la resta: {aritmetica1.restar()}")
print(f"Resultado de la multiplicacion: {aritmetica1.multiplicar()}")
print(f"Resultado de la division: {aritmetica1.dividir()}:.2f")


""" Class rectangulo, debe tener dos atributos: base y altura
    el nombre del metodo debe ser calcular_area y la formula es base * altura
    pero la base y la altura deben ser ingresadas por el usuario 
    y los objetos deben ser 3
 """
class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    def calcular_area(self):
        return self.base * self.altura

for i in range(3):
    base = int(input("Ingrese la base: "))
    altura = int(input("Ingrese la altura: "))
    rectangulo = Rectangulo(base, altura)
    print(f"El area del rectangulo es: {rectangulo.calcular_area()}")

""" Class cubo, con los atributos ancho, alto y profundidad
    con un metodo calcular_volumen que tendra la formula:
    ancho * alto * profundidad
    que el usuario ingrese los valores
 """
class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad
    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad

base = int(input("Ingrese la base: "))
altura = int(input("Ingrese la altura: "))
profundidad = int(input("Ingrese la profundidad: "))
cubo = Cubo(base, altura, profundidad)

print(f"El volumen del cubo es: {cubo.calcular_volumen()}")
