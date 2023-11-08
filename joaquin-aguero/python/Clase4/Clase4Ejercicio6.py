# Ejercicio 6: Modificar los elementos de una lista
# Llenar una lista con los numeros del 1 al 10, luego modificar los elementos de la lista multiplicandolos por un valor ingresado por el usuario
lista = list(range(1, 11))
print('Lista de arranque')
for i in lista:
    print(i, end='-')
multiplicador = int(input('\n Escriba por que numero desea multiplicar: '))
for indice, i, in enumerate(lista):
    lista[indice] *= multiplicador
print(f'Lista con numeros multiplicados por {multiplicador}')
for i in lista:
    print(i, end='-')
