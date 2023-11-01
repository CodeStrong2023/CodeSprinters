# Ejercicio 1: Sumar numeros pares dentro de un rango
# Hacer un programa para sumar numeros pares dentro de un rango, por ejemplo: suma de numeros pares del al 30 = 240
a = int(input("Escriba donde va a dar comienzo la suma: "))
b = int(input("Escriba hasta donde quiere sumar: "))
suma = 0
for i in range(a, b+1):
     if i % 2 == 0:
         suma += i
         print(f"\nLa suma de numeros pares dentro del rango es: {suma}")

