# Ejercicio 1 : Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuacion elimine los elementos repetidos, por ultimo mostrar la lista

lista = [1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9]
lista = list(set(lista))
print(lista)
