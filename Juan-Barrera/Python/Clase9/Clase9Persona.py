class Persona: #Creamos una clase
    def __init__(self, nombre , apellido , edad, dni, *args, **kwargs): #Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
        self._dni = dni

    #Definimos un método
    def mostrar_detalle(self):
        print(f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad} {self._dni}, la dirección es: {self.args}, los datos importantes son: {self.kwargs}")

#Constructor
persona1 = Persona("Joaquin", "Aguero" , 20, 45478569) #Se requieren argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona2 = Persona("Juan", "Barrera", 19, 45714572)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

#Tarea => print de persona1
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

persona1.nombre = "Francisco"
persona1.apellido = "Corvalan"
persona1.edad = 20
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")

#Los atributos son las caracteristicas
#Los métodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle() #La referencia en este caso se pasa de manera automática
persona2.mostrar_detalle()

#Persona.mostrar_detalle() #Debemos pasarle una referencia para el self o dará error
persona1.telefono = '2604003689'
print(persona1.telefono)

persona3 = Persona("Leonel", "Messi", 36, "Teléfono: ", "2604897645", "Calle Cornu", 2435, "Manzana: ", 44, "Casa", 21, Altura=1.67, Peso= 64, CFavorito= "Azul", Auto="Audi", Modelo= 2023 )
persona3.mostrar_detalle()

persona4 = Persona("Edinson", "Cavani", 34, "Teléfono: ", "*****", "Calle Brandsen", 1345, "Manzana: ", 7, "Casa", 50, Altura=1.90, Peso= 80, CFavorito= "Amarillo", Auto="Chevrolet", Modelo= 2023 )
persona4.mostrar_detalle()