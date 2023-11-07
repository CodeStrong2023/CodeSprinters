#Ejercicio 4: Sumasr numeros pares dentro de un rango
# Hacer un programa para sumnar numeros pares dentro de un rango
# por ejemplo:
#               suma de numeros pares del 2 al 30
#               suma = 240
a = int(input(' Digite de donde va a comenzar la suma: '))
b = int(input(' Digite hasta donde quiere llegar la suma: '))
suma = 0
for i in range (a,b+1):
    if i % 2 == 0: # ESto es el si el numero es par
        suma += i
print(f'\n La suma del total de los numeros pares es : {suma}')