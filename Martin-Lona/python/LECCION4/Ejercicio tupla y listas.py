
import math # Importamos la clase math para la funcion sqrt ( raiz cuadrada )
# Ejercico tupla

tupla = (13,1,9,3,2,5,8) # Definimos la tupla
# Crear un lista que solo incluya los numeros menores a 5
# e imprima por consola [1,2,3]

lista = [] # Definimos la lista
# Filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

# Ejercicio de matematicas
# Para sacar la raiz cuadrada de un numero positivo
numero = int(input("Digite un numero positivo: "))
while numero < 0:
    print("Error -> Deberia ser un numero positivo")
    numero = int(input("Digite un numero positivo: "))
print(f'\n Su raiz cuadrada es: {math.sqrt(numero): .2f}')