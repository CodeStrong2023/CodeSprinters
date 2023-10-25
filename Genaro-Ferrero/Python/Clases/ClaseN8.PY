class Persona: # Creamos una clase 
    def __init__(self, nombre, apellido ,edad ): # Metodo init under
        # Arriba se deben colocar los parametros
        # Estos son los atributos
        self.nombre = nombre 
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")

persona1 = Persona("Genaro","Ferrero",26) # Este es un contructor 

print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona("Joel","Martinez",26)
print(f"El objeto 2 de la clase Persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

# Modificacion de objeto 

persona1.nombre = "Liliana"
persona1.apellido = "Buccella"
persona1.edad = "40"

# Mostamos la nueva persona modificada
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

# Los atributos son: Caracteristicas 
# El metodo va a ser el comportamiento que tengan estos objetos

# Metodo de instancia 

persona1.mostrar_detalle()
persona2.mostrar_detalle()