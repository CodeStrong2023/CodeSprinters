# Ejercicio 3 : Insertar elementos y ordenarlos
# Pedir numeros y oredenarlos en una lista, cuando el usuario
# Introdusca un numero 0, nuestro programa dejaria de insertar.
# POr ultimo, mostrar los numeros ordenados de menor  a mayor

lista =[]
salir = False
while not salir:
    numero = int(input('Digite un numero: '))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort() # La lista esta ordenada con esta funcion
print(f'\n Lista ordenada: \n{lista}')
