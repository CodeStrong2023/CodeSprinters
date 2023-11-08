class Persona: #Creamos una clase
    def __init__(self, nombre , apellido , edad): #Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    #Definimos un método
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")

#Constructor
persona1 = Persona("Joaquin", "Aguero" , 20) #Se requieren argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2  = Persona("Juan", "Barrera", 19)
print(f"El objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

#Tarea => print de persona1
print(f"El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.nombre = "Francisco"
persona1.apellido = "Corvalan"
persona1.edad = 20
print(f"El objeto 1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

#Los atributos son las caracteristicas
#Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()
persona2.mostrar_detalle()