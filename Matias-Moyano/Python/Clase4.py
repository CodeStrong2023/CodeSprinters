import math
# Ejerciciop de colecciones 1
# Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuacion
# elimine los elementos repetidos y muetre la lista

lista = [1, 2, 3, 2, 2, 4, 4, 5, 6, 7, 8, 9]

lista2 = list(set(lista)) # El set borra los numeros repetidos

print(lista2)

# Ejercicio de colecciones 2
# Escriba un programa que tenga dos listas y que a continuacion
# Cree las siguientes listas(en las que no debe haber repeticiones)

# 1 Lista de palabras que aparecen en las dos listas
# 2 Lista de palabras que aparecen en la primera lista pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista pero no en la primera
# 4 Lista de palabras que aparecen en ambas listas

lista1 = ["Martin", "Matias", "Hernan", "Santiago", "Lucas", "Mariano"]
lista2 = ["Martin", "Matias", "Hernan", "Santiago", "Pablo", "Juan"]

lista3 = list(set(lista1) & set(lista2)) # 1 
print(lista3)

lista4 = list(set(lista1) - set(lista2)) # 2
print(lista4)

lista5 = list(set(lista2) - set(lista1)) # 3
print(lista5)

lista6 = list(set(lista1) | set(lista2)) # 4
print(lista6)

# Ejercicio de colecciones 3 Agregar personajes a una lista
# Escriba un programa donde tenga una lista de personajes del señor de los anillos

# Nombre, clase, raza

personajes = []

personajes.append({"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Ishtari"})
personajes.append({"Nombre": "Aragorn", "Clase": "Guerrero", "Raza": "Dunadan"})
personajes.append({"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo"})

print(personajes)

# Ejercicio con matematicas y clase Math
# Sacar la raiz cuadrada de un numero positivo


""" numero = int(input("Ingrese un numero: "))
while numero < 0:
    print("El numero debe ser positivo")
    numero = int(input("Ingrese un numero: "))

raiz = math.sqrt(numero)

print(f"La raiz cuadrada de {numero} es {raiz:2f}")
print("La raiz cuadrada de {} es {}".format(numero, raiz)) """

# Ejercicio recorremos un diccionario de la seleccion Argentina

seleccionArgentina = {
    1: {"Nombre": "Franco", "Apellido": "Armani", "Posicion": "Arquero"},
    2: {"Nombre": "Gonzalo", "Apellido": "Montiel", "Posicion": "Defensor"},
    7: {"Nombre": "Rodrigo", "Apellido": "De Paul", "Posicion": "Mediocampista"},
    10: {"Nombre": "Lionel", "Apellido": "Messi", "Posicion": "Delantero"}
}

for llave,valor in seleccionArgentina.items():
    print(llave,valor)
    print(f"El jugador {valor['Nombre']} {valor['Apellido']} juega de {valor['Posicion']}")


# Ejercicio 1 llenar una lista
# Llenar una lista con los numeros del 1 al 50
# mostrar la lista con el bucle for
# los elementos deben mostrarse 1-2-3-...-50

lista = []
lista2 = list(range(1,51)) # range genera una lista de numeros

for i in range(1,51):
    lista.append(i)

for i in lista:
    print(i, end="-")

#Ejercicio 2: Modificar los elementos de una lista
# LLenar una lista con numeros del 1 al 10 
# Modificar los elementos multiplioandolos por un valor ingresado por el usuario

lista = []
lista2 = list(range(1,11))

print("LIsta original:")

for i in lista2: 
    print(i, end="-")

multiplicador = int(input("Ingrese un numero para multiplicar los numeros de la lista: "))

for i in lista2:
    lista.append(i * multiplicador)

print(lista)

# Ejercicio 3: insertar elementos y ordenarlos
# Pedir numeros y meterlos en una lista, 
# cuanddo el usuario introduzca un 0, nuestro programa dejaria de insertar
# por ultimo, mostrar los numeros de menor a mayor

lista = []

numero = int(input("Ingrese un numero: "))
while numero != 0:
    lista.append(numero)
    numero = int(input("Ingrese un numero: "))
else:
    lista.sort()

print(lista)