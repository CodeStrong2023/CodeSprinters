# Ejercicio 2: operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que acontinuacion
# cree las siguientes listas (en las que no deben haber repeticion)
# 1 lista de palabras que aparecen en las listas
# 2 lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 lista de palabras que aparecen en la primera lista pero no en la primera
# 4 lista de palabras que aparecen en ambas listas

lista1 = [1, 2, 3, 4, 5, 6, 7, 7, 8, 9]
lista2 = [7, 6, 6, 5, 4, 3, 2, 1, 2, 5]

conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1 | conjunto2)
primera = list(conjunto1 - conjunto2)
segunda = list(conjunto2 - conjunto1)
ambas = list(conjunto1 & conjunto2)

print(f'Lista de palabras que aparecen en las listas:{union}')
print(f'Lista de palabras que aparecen solo en la primer lista{primera}')
print(f'Lista de palabras que aparecen solo en la segunda lista{segunda}')
print(f'Lista de palabras que aparece en ambas listas{ambas}')
