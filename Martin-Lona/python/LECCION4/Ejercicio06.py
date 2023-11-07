# Ejercicio 6: Tabla de Multiplicar
# Hacer un programa que pida un numero por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo:
# Si digita el 5 la lista tendra : 5,10,15,20,25,30,35,40,45,50

numero = int(input("Digite un numero: "))
lista = [] # Creamos una lista vacia
for i in range (1,11):
    lista.append(i*numero)
print(f"\nTabla de multipolicar del {numero}: \n {lista}")

