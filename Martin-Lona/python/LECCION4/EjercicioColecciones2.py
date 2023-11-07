# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga dos listas y que a continuacion
# cree las siguientes listas ( en las que no deben haber repeticion )
# 1 Lista de palabras que aparecen en las listas
# 2 LIsta de palabra que parecen em la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aparecen en ambas listas

lista1 = [2,3,7,3,4,9,2,7]
lista2 = [4,2,1,0,4,8,6]

# Eliminar los elementos repetidos de ambas listas con conjuntos

conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list (conjunto1 | conjunto2 ) # Unimos los dos conjuntos
solo1 = list(conjunto1 -conjunto2) # Solo muestra el conjunto 1
solo2 = list(conjunto2 - conjunto1) # Solo muestra el conjunto 2
ambas =  list(conjunto1 & conjunto2) # Mostramos ambas listas
print(f"Lista de palabras que aparecen en las listas : {union}")
print(f"LIsta de palabra que parecen em la primera lista, pero no en la segunda : {solo1}")
print(f"Lista de palabras que aparecen en la segunda lista, pero no en la primera : {solo2}")
print(f"Lista de palabras que aparecen en ambas listas : {ambas}")

# Ejercicio 3 : Agregar personales a una lista
# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
# Nombre : Argon
# Clase : Guerrero
# Raza: Dunadan del Norte

# Nombre : Gandalf
# Clase : Mago
# Raza: Istar

# Nombre : Legolas
# Clase : Arquero
# Raza: Elfo Sindar

personajes = [] # Creamos una lista vacia
# Creamos diccionarios
p1 = {"Nombre" : 'Argon', 'Clase' : 'Guerrero', 'Raza' : 'Dunadan del Norte'}
personajes.append(p1)# Agregamos a la lista un personaje
p2 = {"Nombre" : 'Gandalf', 'Clase' : 'Mago', 'Raza' : 'Istar'}
personajes.append(p2)
p3 = {"Nombre" : 'Legolas', 'Clase' : 'Arquero', 'Raza' : 'Elfo Sindar'}
personajes.append(p3)
print(personajes)