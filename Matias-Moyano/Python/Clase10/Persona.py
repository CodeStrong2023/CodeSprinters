class Persona:
    def __init__(self, nombre, apellido,dni, edad, *args, **kwargs):
        #self.__nombre = nombre #Totalmente encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._dni = dni # el guion bajo es para indicar que es un atributo privado
        self._edad = edad

    def mostrar_detalle(self):
        print(f"Persona: {self._nombre} {self._apellido} {self._dni} {self._edad}")
    #Getters
    @property # Decorador
    def nombre(self):
        print("Llamando metodo get nombre")
        return self._nombre
    @nombre.setter
    def nombre(self, nombre):
        print("Llamando metodo set nombre")
        self._nombre = nombre
    
    @property # Decorador
    def apellido(self):
        print("Llamando metodo get apellido")
        return self._apellido
    @apellido.setter
    def apellido(self, apellido):
        print("Llamando metodo set apellido")
        self._apellido = apellido
    
    @property # Decorador
    def dni(self):
        print("Llamando metodo get dni")
        return self._dni
    @dni.setter
    def dni(self, dni):
        print("Llamando metodo set dni")
        self._dni = dni

persona1 = Persona("Matias", "Moyano",123123123, 25)
persona1.mostrar_detalle()
print(persona1._nombre) #No se DEBE hacer
persona1._nombre = "Juan" #Esto no se DEBE hacer
print(persona1.nombre) #Llamando metodo get nombre

