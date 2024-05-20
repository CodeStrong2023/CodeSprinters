class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    # ADD = SUMAS -- SUB = RESTA
    def __add__(self, other):
        if isinstance(other, Persona):
            return self.nombre + " " + other.nombre
        return NotImplemented

    def __sub__(self, otro):
        if isinstance(otro, Persona):
            return self.edad - otro.edad
        return NotImplemented

persona1 = Persona("Ariel", 40)
persona2 = Persona("Betancud", 5)

# Esto utilizará la sintaxis interna y automática del método __add__ y __sub__
print(persona1 + persona2)
print(persona1 - persona2)