class Persona:
    def __init__(self, nombre, apellido,dni, edad, *args, **kwargs):
        #self.__nombre = nombre #Totalmente encapsulado
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni # el guion bajo es para indicar que es un atributo privado
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self._dni} {self.edad}, la direccion es: {self.args}, los datos importantes son: {self.kwargs}")


persona1 = Persona("Matias", "Moyano",123123123, 25)
persona2 = Persona("Juan", "Perez", 123123,30)
Persona.mostrarDetalle(Persona("Matias", "Moyano",1123123123, 25))
Persona.mostrarDetalle(persona1) #Esto no esta bueno

persona1.telefono = "123456789"
print(persona1.telefono) ## hemos creado un atributo nuevo solo para el objeto persona1
#print(persona2.telefono) ## no existe el atributo telefono para el objeto persona2

persona1 = Persona("Matias", "Moyano", 123123123, 25, "Calle 123", "Cordoba", "Argentina")
persona2 = Persona("Juan", "Perez", 30,123123123, "Calle 456", "Cordoba", "Argentina", telefono="123456789", email="juan@gmail.com")

persona1.mostrar_detalle()
persona2.mostrar_detalle()
print(persona1._dni) # Accede igual, pero no es lo correcto
##print(persona1.__nombre) # No accede, porque es privado