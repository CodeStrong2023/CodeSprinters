seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '500 millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 35, 'Altura': 1.80, 'Precio': '12 millones', 'Posicion': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 millones', 'Posicion': 'Media punta'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 millones', 'Posicion': 'Defensa central'},
    23: {'Nombre': 'Emiliano Martinez', 'Edad': 31, 'Altura': 1.95, 'Precio': '17 millones', 'Posicion': 'Portero'},
    5: {'Nombre': 'Leandro Paredes', 'Edad': 29, 'Altura': 1.82, 'Precio': '9 millones', 'Posicion': 'Centrocampista'},
    20: {'Nombre': 'Alexis Mac Allister', 'Edad': 24, 'Altura': 1.76, 'Precio': '40 millones', 'Posicion': 'Centrocampista ofensivo'},
    27: {'Nombre': 'Julian Alvarez', 'Edad': 23, 'Altura': 1.70, 'Precio': '80 millones', 'Posicion': 'Delantero Centro'},
    13: {'Nombre': 'Cristian Romero', 'Edad': 25, 'Altura': 1.85, 'Precio': '60 millones', 'Posicion': 'Defensa central'},
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

# Como tarea agregar por lo menos 4 jugadores mas al diccionario: seleccionArgentina
print(seleccionArgentina)
print('Tenemos cargados en el diccionario la cantidad de jugadores:', end=' ')
print(len(seleccionArgentina))

# Pilas usando listas
pila = [1, 2, 3]

# Agragar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
elementoBorrado = pila.pop() # Quita el ultimo elemento y lo guarda en la variable
print(f'Sacamos el elemento: {elementoBorrado}')
print(f'La pila ahora queda asi: {pila}')

# Colas con listas
# Estructura de datos de tipo (first input / first output)
cola = ['Messi', 'Di Maria', 'Paredes']

#Agregamos elementos al final de la cola
cola.append('Martinez')
cola.append('Alvarez')
print(cola)

# Sacamos elementos ded la cola
seRetira = cola.pop(0)
print(f'Atendio el cliente:´{seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendio el cliente:´{seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendio el cliente:´{seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendio el cliente:´{seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendio el cliente:´{seRetira}')
print(cola)


for i in seleccionArgentina:
    print(f'{i}→{seleccionArgentina}')
