class Persona:
    #pass # No se procesa nada mas (No tiene contenido)
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrarDetalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")

persona1 = Persona("Matias","Moyano",25)    
print(persona1.nombre)
print(persona1.apellido)

persona2 = Persona("Pablo","Gomez",30)
print(persona2.nombre)
print(persona2.apellido)
print(persona2.edad)


persona1.nombre = "Juan"
print(persona1.nombre)

persona1.edad = 30

##Los atributos son: caracteristicas
# Los metodos son: acciones
persona1.mostrarDetalle()
persona2.mostrarDetalle()