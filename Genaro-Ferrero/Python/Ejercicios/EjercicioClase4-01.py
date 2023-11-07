# Ejercicio 1 : Eliminar duplicados de una lista 
# Escriba un programa donde tenga una lista y que a continuacion elimine los elementos repetidos
# Mostrar la lista

print("Ejercicio 1 : Eliminar duplicados de una lista")
# Creamos la lista

lista=[1,2,3,4,5,6,7,8,1,1,1,2,3,4,5,5,5,5,2]
print("La lista inicial es: ")
print(lista)

# Eliminamos los duplicados 
#lista1 = set(lista) # Convirtiendo la lista a tipo set
#lista = list(lista1) # Convertimos el set a tipo lista 
# En una sola linea seria:
lista =list(set(lista))

print("La lista sin duplicados es:")
print(lista) # Imprimimos la lista