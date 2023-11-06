# Lista = Barco, Medina, Cavani, Merentiel

nombres = ['Medina', 'Barco', 'Cavani', 'Merentiel']
print(nombres)
print(nombres[0:2])# Solo muestra el indice 0, 1 pero no el indice 2
# ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3])# Indices a mostrar 0, 1, 2
# Desde el indice indicado hasta el final
print(nombres[1: ])
# Modificamos un valor
nombres[2]= 'Edinson'
nombres[0]= 'Cristian'
print(nombres)
# Iterar una lista
for nombre in nombres: # Nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')
# Preguntamos cuantos elementos tiene
print(len(nombres)) # Le pasamos como parametro la lista
#Agregamos un elemento
nombres.append('Marcelo')
print(nombres)
# Insertamos un elemento en un indice especifico
nombres.insert(1, 'Valentini')
print(nombres)
nombres.insert(3, 'Rojo')
print(nombres)
#Eliminamos un elemento
nombres.remove('Valentini')
print(nombres)
# Eliminar el ultimo elemento
nombres.pop()
print(nombres)
# Eliminar un indice especifico
del nombres[2] #del es eliminar
print(nombres)
# Eliminar, borrar o limpiar todos los elementos
nombres.clear()
# Eliminar la lista
del nombres
print(nombres) # Aca va a mostrar un error
