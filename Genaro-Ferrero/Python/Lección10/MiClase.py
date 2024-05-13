
class MiClase:
    # Variable de clase, este atributo dará a cada objeto el mismo valor
    variable_clase = "Esta es una variable de clase"
    def __init__(self, variable_instancia): # La variable de instancia, da diferentes valores
        self.variable_instancia = variable_instancia
    @staticmethod
    def metodo_estatico(): # Metodo estatico, se asocia a la clase
        print(MiClase.variable_clase)

    @classmethod
    def metodo_clase(cls):
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)

print(MiClase.variable_clase)
miClase1 = MiClase("Esta es una variable instancia")
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = MiClase("Esta es otra prueba de variable de instancia")
print(miClase2.variable_instancia)
print(miClase2.variable_clase)

# Cada objeto atravez de la variable de clase comparten el mismo valor

MiClase.variable_clase2 = "Valor de la variable clase 2" # si o si hay que asignarle un valor a una clase creada nueva
print(MiClase.variable_clase2)
print(miClase1.variable_clase2)
print(miClase2.variable_clase2)

MiClase.metodo_estatico()

MiClase.metodo_clase()
miObjeto1 = MiClase("Variable de instancia")
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()