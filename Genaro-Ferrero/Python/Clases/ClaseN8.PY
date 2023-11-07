class Persona: # Creamos una clase 
    def __init__(self, nombre, apellido ,edad,*args, **kwargs ): # Metodo init under
        # Arriba se deben colocar los parametros
        # Estos son los atributos
        self.nombre = nombre 
        self._apellido = apellido # Encapsulado de una forma sugerida
        self.edad = edad
        self.args = args
        self.wkargs = kwargs
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self._apellido} {self.edad}, la direccion es: {self.args}, los datos importantes son {self.wkargs} ")

persona1 = Persona("Genaro","Ferrero",26) # Este es un contructor 

print(persona1.nombre)
print(persona1._apellido)
print(persona1.edad)

persona2 = Persona("Joel","Martinez",26)
print(f"El objeto 2 de la clase Persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

# Modificacion de objeto 

persona1.nombre = "Liliana"
persona1._apellido = "Buccella"
persona1.edad = "40"

# Mostamos la nueva persona modificada
print(persona1.nombre)
print(persona1._apellido)
print(persona1.edad)

# Los atributos son: Caracteristicas 
# El metodo va a ser el comportamiento que tengan estos objetos

# Metodo de instancia 

persona1.mostrar_detalle()
persona2.mostrar_detalle()
Persona.mostrar_detalle(persona1)

# Agrega un atributo de solo esa persona
persona1.telefono = "2604679904"

persona3 = Persona("Pedro","Picapiedras",226,"Telefono","2604234323","Av. 9 de julio", 234, Altura= 1.90,Peso= 123)
persona4 = Persona("Bulma","Picapiedras",216,"Telefono","260412345","Av. 9 de julio", 234, Altura= 1.60,Peso= 50)
persona3.mostrar_detalle()
persona4.mostrar_detalle()

# El doble __ en el atributo si genera un encapsulamiento real
# Osea que no acepta cambios 
