# Ejercicio Rango 
# Crear un rango de 3 a 10 pero con incremento de 2 en 2 
print("Clase N°1")

# Ejercicio 1
print("Ejercicios de rango")
print("Ejercicio N°1")
print("Iterar un rango de 0 a 10 con numeros divisibles por 3")

for i in range(11):
    if i % 3 == 0:
        print(i)

# Ejercicio 2
print("Ejercicio N°2")
print("Rango con valores de inicio = 2 y fin = 6")
rango = range(2, 7)
for i in rango:
    print(i)

# Ejercicios 3
print("Ejercicios N°3")
print("Crear un rango de 3 a 10 pero con incremento de 2 en 2")
for i in range(3, 11, 2):
    print(i)

# Ejercicio Tupla
print("Ejercicio Tupla")
print("Crea una tupla con los siguientes valores 13,1,8,5,3,2,5,8")
print("Con esa tupla crear una lista con los numeros menores a 5 e imprimirlos")
# Creamos la tupla y la imprimimos
tupla = (13,1,8,5,3,2,5,8)
print("La tupla sera :")
for tuplas in tupla:
    print(tuplas,end=" ")
# Con la tupla creamos la lista y la imprimimos
lista =[]
for numero in tupla:
    if numero < 5:
        lista.append(numero)
print ("\n","La nueva lista sera :",lista)
