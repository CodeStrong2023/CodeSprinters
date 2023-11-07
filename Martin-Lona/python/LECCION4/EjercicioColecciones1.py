# Ejercicio 1 : Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuacion elimine
# elimine los elementos repetidos, por ultimo mostrar la lista.

# Creamos una lista
lista = [1,2,3,"Ariel", 7,7,3,"Alberto",5,"Ariel"]
#conjunto = set(lista) # Convertimos la lista a un conjunto de tipo set
#lista = list(conjunto) # Convertimos el conjunto en una lista
lista = list(set(lista)) # La conversion hecha en una sola linea de codigo (eficiente)
print(lista)