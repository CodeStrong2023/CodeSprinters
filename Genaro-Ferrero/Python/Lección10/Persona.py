class Persona:
    contador_pesonas = 0  # Variable de clase

    @classmethod
    def generar_siguiente_valor(cls):
        cls.contador_pesonas +=1 # Vamos incrementando 1
        return cls.contador_pesonas

    def __init__(self, nombre, edad):
        self.id_persona = Persona.generar_siguiente_valor()
        self.nombre = nombre
        self.edad = edad

    def __str__(self):
        return f"Persona [{self.id_persona} {self.nombre} {self.edad} ]"


persona1 = Persona("Ariel", 40)
print(persona1)
persona2 = Persona("Osvaldo", 45)
print(persona2)
persona3 = Persona("Genaro", 26)
Persona.generar_siguiente_valor()
persona4 = Persona ("Pedro",60)
print(f"Valor contador personas:{Persona.contador_pesonas}")
