# Ejercicio 2: Factorial de un numero positivo
# Hacer un programa para calcular el factorial de un numero positivo
numero = int(input("Escriba un numero: "))
while numero < 0:
    print("Error → El numero debe ser positivo")
    numero = int(input("Escriba un numero: "))
factorial = 1
for i in range(1, numero+1):
    factorial *= i
print(f"\nEl factorial del numero {numero} positivo ingresado es: {factorial}")
