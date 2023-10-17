# Ejercicio 5: Factorial de un número positivo  
# Hacer un programa para calcular el factorial de un número positivo 
numero = int(input("Digite un número "))
while numero  < 0 :
    print("Error  el número tiene que ser positivo")
    numero = int(input("Digite un número: "))
factorial = 1 # Tiene que ser inicializada en 1  
for i in range(1,numero + 1 ):
    factorial *= i 
print(f"\n el factorial del número es: {factorial}")