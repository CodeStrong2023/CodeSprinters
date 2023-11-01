# Conjunto
conjunto = set() # Conjunto vacio
conjunto1 = {} # NO SE PUEDE crear un conjunto vacio de esta forma
conjunto2 = {1,2,3} # Conjunto con valores
conjunto.add(1) # se agrega de a un elemento
conjunto.add(2) 
conjunto.add(3) 

print(conjunto)

print (4 in conjunto) # False

# Igualdad de conjuntos
conjunto3 = {3,5,6}
print(conjunto == conjunto3) # True

# Operaciones de conjuntos

conjunto4 = conjunto | conjunto3 # Union
print(conjunto4)

conjunto5 = conjunto & conjunto3 # Interseccion
print(conjunto5) # Se genera un nuevo conjunto con los elementos que estan en ambos conjuntos

conjunto6 = conjunto - conjunto3 # Diferencia
print(conjunto6) # Se genera un nuevo conjunto con los elementos que estan en conjunto pero no en conjunto3

conjunto6 = conjunto3 - conjunto # Diferencia
print(conjunto6) # Se genera un nuevo conjunto con los elementos que estan en conjunto3 pero no en conjunto

conjunto7 = conjunto ^ conjunto3 # Diferencia simetrica
print(conjunto7) # Se genera un nuevo conjunto con los elementos que estan en conjunto o en conjunto3 pero no en ambos

# Como determinar si un conjunto es subconjunto de otro
# Subconjunto es el conjunto que tiene menos elementos
conjunto8 = {1,2,3}
conjunto9 = {1,2,3,4,5,6}
conjunto10 = {7,8,9}

print(conjunto8.issubset(conjunto9)) # True
print(conjunto8.issubset(conjunto10)) # False

# Como determinar si un conjunto es superconjunto de otro
# Superconjunto es el conjunto que tiene mas elementos
print(conjunto9.issuperset(conjunto8)) # True
print(conjunto10.issuperset(conjunto8)) # False

# Conjuntos disconexos
# No tienen elementos en comun
conjunto11 = {1,2,3}
conjunto12 = {4,5,6}

print(conjunto11.isdisjoint(conjunto12)) # True
print(conjunto11.isdisjoint(conjunto9)) # False

# Convertir conjunto a inmutable
frozenset(conjunto11) # No se puede modificar ni eliminar elementos

# Repaso diccionarios
newDiccionario = { 'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green' }

# Como eliminar 
del newDiccionario['Azul']

# Pueden contener distintos tipos de datos
newDiccionario = { 'Azul': 'Blue', 10: 'Red', 'Verde': [1,2,3] }

seleccionArgentina = {
    10: {
        'nombre': 'Messi',
        'edad': 35,
        'altura': 1.70,
        'precio': 1000000000,
        'posicion': 'Delantero'
    },
    11: {
        'nombre': 'Di Maria',
        'edad': 33,
        'altura': 1.80,
        'precio': 500000000,
        'posicion': 'Delantero'
    },
    24: {
        'nombre': 'Guido',
        'edad': 27,
        'altura': 1.70,
        'precio': 20000000,
        'posicion': 'Mediocampista'
    },
    19: {
        'nombre': 'Alario',
        'edad': 28,
        'altura': 1.85,
        'precio': 30000000,
        'posicion': 'Delantero'
    },
}

print(seleccionArgentina)

for jugador, info in seleccionArgentina.items():
    print(jugador, info)

#Tarea: Agregar por lo menos 4 jugadores mas a la seleccion Argentina

seleccionArgentina[1] = {
    'nombre': 'Dibu',
    'edad': 28,
    'altura': 1.85,
    'precio': 30000000,
    'posicion': 'Arquero'
}

seleccionArgentina[8] = {
    'nombre': 'Otamendi',
    'edad': 28,
    'altura': 1.85,
    'precio': 30000000,
    'posicion': 'Defensor'
}

seleccionArgentina[9] = {
    'nombre': 'Paredes',
    'edad': 28,
    'altura': 1.85,
    'precio': 30000000,
    'posicion': 'Mediocampista'
}

seleccionArgentina[12] = {
    'nombre': 'Armani',
    'edad': 28,
    'altura': 1.85,
    'precio': 30000000,
    'posicion': 'Arquero'
}

print(seleccionArgentina)

# Pilas usando listas
pila = [3,4,5]

# Agregar elementos al final de la pila
pila.append(6)
pila.append(7)

# Sacar elementos del final de la pila
pila.pop()
elemento_borrado = pila.pop()

print(f'Elemento borrado: {elemento_borrado}')
print(f'Pila: {pila}')

# Colas usando listas
# Estructura FIFO (First In First Out) 
# Significa que el primer elemento en entrar es el primero en salir
cola = ['Angel', 'Juan', 'Matias', 'Lucas']

# Agregar elementos al final de la cola
cola.append('Pedro')
cola.append('Martin')

# Sacar elementos del principio de la cola
se_va = cola.pop(0)
print (f'Atendido: {se_va}')

