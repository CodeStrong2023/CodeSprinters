class Persona2:
    def __init__(self, nombre, apellido, edad):  # Encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")

    @property  # Decorador
    def nombre(self):  # Metodo getter
        print("Estamos usando metodo get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        print("Estamos usando el metodo set")
        self._nombre = nombre

    @property
    def apellido():
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad
    
    # Metodo destructor
    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}") 

persona1 = Persona2("Genaro", "Ferrero", 26)

print(persona1.nombre)  # Llamamos al getter
persona1.nombre = "Genaro Ferrero"  # Metodo set
print(persona1.nombre)
print(persona1.mostrar_detalles())  # Llamamos al metodo

# Podemos dejar un atributo sin su método set
# Pero este pasaría a ser un método Read-Only
# Osea que sería de solo lectura

# Crear 3 objetos más utilizando los métodos
# Creamos los objetos
persona2 = Persona2("Manuela", "Rodriguez", 27)
persona3 = Persona2("Pedro", "Picapiedras", 90)
persona4 = Persona2("Roberto", "Durant", 80)

# Editamos los objetos
persona2.nombre = "Florencia"
persona3.nombre = "Vilma"
persona4.nombre = "Mano de Piedra"
# Mostramos los datos
print(persona1.mostrar_detalles())
print(persona2.mostrar_detalles())
print(persona3.mostrar_detalles())
print(persona4.mostrar_detalles())


print(__name__)

