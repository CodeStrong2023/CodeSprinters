print("Ejercicios N°7")
# llenar una lista con números del 1 al 10 
# Modificar esta lista multiplicando por el valor ingresados del usuario
lista =list(range(1,11))
print("Mostramos la lista original: ")
for i in lista:
    print(i,end="-")

# Le pedimos el valor a multiplicar a el usuario
valor=int(input("\n Digite un valor a multiplicar la lista"))

#Multiplicamos los elementos de la lista
for indice, i in enumerate(lista):
    lista[indice] *= valor

print(f"Lista final con los elementos multiplicados por :{valor}")
for i in lista:
    print(i,end="-")