# Listas
nombres = ["Matias", "Moyano", "Matias Moyano"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[2])
print(nombres[-1]) # Ultimo elemento
print(nombres[-2]) # Penultimo elemento
print(nombres[0:2]) # indice 0 y 1
print(nombres[:2]) # indice 0 y 1
print(nombres[1:]) # indice 1 al final
print(nombres[0:3:2]) # Desde el indice 0 hasta el 2 de a 2
print(nombres[::2]) # Desde el elemento 0 hasta el final de a 2
print(nombres[::-1]) # Desde el elemento 0 hasta el final de a 2

# modificar elementos

nombres[0] = "Martin"
print(nombres)
nombres[1] = "Perez"
print(nombres)

# Iterar una lista
for nombre in nombres: # Itera cada elemento de la lista
    print(nombre)
else: # Se ejecuta cuando termina el for
    print("No existen mas elementos en la lista")

# Preguntamos cuantos elementos tiene la lista
print(len(nombres)) # le pasa la lista y devuelve la cantidad de elementos

# Agregar elementos
nombres.append("Pedro") # Agrega un elemento al final de la lista
nombres.append("Juan")
nombres.append("Lalo")
nombres.append("Ariel")


# Insertar un elemento en un indice especifico
nombres.insert(1, "Lucas") # Agrega un elemento en el indice 1

# Remover un elemento
nombres.remove("Martin") # Remueve el elemento Matias
nombres.pop() # Remueve el ultimo elemento de la lista
nombres.pop(1) # Remueve el elemento del indice 1

# Eliminar un indice especifico
del nombres[2] # Elimina el elemento del indice 2

# Eliminar todos los elementos de la lista
nombres.clear()

# Eliminar la lista
del nombres

## Ejercicios
## 1 iterar un rango de 0 a 10 e imprimir los divisibles entre 3
## Ejemplo de ejecucion: 0,3,6,9
print("Ejercicio 1")
for numero in range(11):
    if numero % 3 == 0:
        print(numero)

## 2 Crear un rango de numeros de 2 a 6 e imprimelos
## Ejemplo de ejecucion: 2,3,4,5,6
print("Ejercicio 2")

for numero in range(2,7):
    print(numero)

## 3 Crear un rango de 3 a 10 pero con incrementos de 2 en 2
## Ejemplo de ejecucion: 3,5,7,9
print("Ejercicio 3")

for numero in range(3,11,2):
    print(numero)


## tuplas
# Son inmutables, no se pueden modificar
frutas = ("Naranja", "Platano", "Guayaba")
print(frutas)
noEsTupla = ("Matias") # Esto no es una tupla necesitamos una coma
esTupla = ("Matias",) # Esto es una tupla

# Saber el largo
print(len(frutas))

# Acceder a un elemento
print(frutas[0])

# Navegacion inversa
print(frutas[-1])

# Acceder a un rango
print(frutas[0:2]) # Sin incluir el indice 2

# Recorrer elementos
for fruta in frutas:
    print(fruta, end=" ") # end=" " para que no haga un salto de linea

# Print tiene por defecto un salto de linea

# Cambiar valor tupla
# frutas[0] = "Pera" # No se puede modificar

# Convertir tupla a lista
frutasLista = list(frutas)
frutasLista[0] = "Pera"

# Convertir lista a tupla
frutas = tuple(frutasLista)

# Eliminar tupla
del frutas

#Ejericio
# Dada la siguiente tupla
tupla = (13,1,8,3,2,5,8)
# Crear una lista que solo incluya los numeros menores a 5
# Imprimir la lista [1,3,2]

lista = []
for numero in tupla:
    if numero < 5:
        lista.append(numero)

print(lista)




