print("Ejercicios N°4")
print("Sacar la raiz cuadrada de un Número Positivo")
# Importamos la clase math
import math
numero = int(input("Digite un Número: "))
while numero < 0:
    print("Error el número ingresado es negativo")
    numero = int(input("Digite un Número positivo: "))
print(f"\n Su raiz cuadrada es: {math.sqrt(numero):.2f}") # El .2f es para que no tire tantos digitos en el resultado
