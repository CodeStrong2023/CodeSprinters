print("Ejercicio N°2")
print("Operaciones de conjunto con listas")
# Escriba un programa que tenga dos listas sin repeticiones y realizar las siguientes operaciones 
# Creacion de las listas 
lista= [1,2,3,4,5,6,2,1,2,4,5,6,2,8,6,120,9]
lista2= [2,4,5,6,3,6,7,83,2,5,7,8,3,6]
print("Listas iniciales:")
print(lista)
print(lista2)
print(" 1: Lista de palabras que aparecen en las listas")
union = set(lista) # Para eliminar repetidos
union2 = set(lista2)
lista3 = list(union | union2) # Union de las dos listas 
print(lista3)
print(" 2: Lista de palabras que aparecen en la lista N°1")
listaResto = list( union - union2)
print(listaResto)
print(" 3: Lista de palabras que aparecen en la lista N°2")
listaResto2 = list(union2 - union)
print(listaResto2)
print(" 4: Lista de palabras que aparecen en ambas listas")
interseccion = (union & union2)
print(interseccion)