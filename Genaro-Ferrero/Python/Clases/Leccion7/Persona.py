class Persona():
    def __init__(self,nombre,edad) :
        self.nombre = nombre
        self.edad = edad
        
    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre  = nombre
        
    @property
    def edad(self):
        return self._edad
    
    @edad.setter
    def edad (self, edad):
        self._edad= edad
            
class Empleado(Persona): 
    def __init__(self,nombre,edad,sueldo):
        self.sueldo = sueldo
        super().__init__(nombre,edad)
    
    @property 
    def sueldo(self):
        return self._sueldo
    
    @sueldo.setter
    def sueldo(self,sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f"Persona:  Nombre: {self.Nombre} Edad: {self.edad}"
    
    def __str__(self):
        return f"Empleado: Sueldo {self.sueldo} {super().__str__()}"

empleado1 = Empleado("Genaro",40,7500)
print(empleado1.nombre)
print(empleado1.sueldo)
print(empleado1.edad)

empleado2 = Empleado ("Liliana",38,50000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre = "Natalia "
empleado2.edad = 40
empleado2.sueldo = 250
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
