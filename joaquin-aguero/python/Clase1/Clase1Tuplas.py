#Definimos una tupla
cocina = ('cuchara', 'cuchillo','tenedor')
print(len(cocina))
#Acceder a un elemento, para esto utilizaremos corchetes
print(cocina[0])
#Mostrar de manera inversa
print(cocina[-1])
#Acceder a un rango
print(cocina[0:2])
#Ejemplo
verduras = ('papa') #Una tupla necesita aunque sea de un elemento: la coma de lo contrario seria un tipo cadena
#Recorremos los elementos de la tupla
for cocinar in cocina: # Print esta usando \n para saltos de linead
    print(cocinar, end=' ') #Usamos end= para eliminar saltos de lineas
cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)


