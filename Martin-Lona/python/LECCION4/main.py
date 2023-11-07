# lista = Ariel,Liliana, Natalia, Osvaldo
# Coleeciones Python
# Las listas se conocec como arreglos o vectores en otrso leguajes
'''nombres =[ 'Naty', 'Lily', 'Ariel', 'Osvaldo']
print (nombres)
print (nombres[0])
print (nombres[1])
print (nombres[3])
print (nombres[-1])
print (nombres[-2])

print (nombres[0:2])
print (nombres[ :3])
print (nombres[1: ])

# Modificamos un valor

nombres [1] = 'Liliana'
print (nombres)
nombres [0] = 'Natalia'
for nombre in nombres : # Nombre es singular, la lista es plural
    print (nombre)
else:
    print('Se acabaron los elemntos de la lista')

# Preguntemos cuantos elementos tiene una lista

print (len(nombres))# le pasamos como parametro la lista

# Agregamos un elemnto

nombres.append ('Marcela')
nombres.append([1,2,3])
nombres.append (True)
nombres.append (10,45)
print(nombres)

# Insertar un nuevo elemento en un indice especifico

nombres.insert(1,'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

#Eliminamos un elemnto

nombres.remove('Alberto')
print (nombres)

#Eliminar el ultimo elemnto

nombres.pop()
print(nombres)

#Eliminar un indice especifico

del (nombres[2])
print (nombres)

# Elimnar borrar todos los elemntos

nombres.clear()
print(nombres)

 #Eliminar la lista

del nombres
print(nombres)'''



#Ejercicio1 : Iterra un rango de 0 a 10 e imprimir numeros divisibles entre 3
#Ejemplo de ejecucion: 0,3,6,9
'''print ('Rango de 0 a 10 con numeros divisibles entre 3')
for i in range(11):
    if i % 3 == 0:
        print(i)

#Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimelos
#Ejemplo de ejecucio: 2,3,4,5,6
print ('Rango con valores de inicio = 2 y valor fin = 6')
rango = range (2, 7)
for i in rango:
    print(i)

#Ejercicio 3: Crear un rango de 3 al 10 pero con incremento de 2 en 2, en vez de 1 en 1
#Ejemplo de ejecucion: 3,5,7,9
print('Crear rango de inicio = 3 , fin = 10 , con incremento 2')
for i in range(3, 11, 2):
       print(i)'''
#DEfinimos una tupla

cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

#Acceder a un elemnto, para ello usamos corchetes no parentesis
print(cocina[0])
# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2])

# Ejemplo

verduras = ('papa',) # Una tupla necesita aunque sea un elemento la coma
# de lo contrario solo seria del tipo string cadena

# Recorremos los elementos de la tupla
for cocinar in cocina:# Print esta usando \n para saltos de linea
    print (cocinar, end=' ')# Usamos end= para eliminar los saltos de linea

cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# del cocina es para eliminar una tupla

# Tipo set

planetas = {'Marte', 'Jupiter', 'Venus'}
print(len(planetas)) # Usamos la funcion len = lenth significa largo
 # Revisar si un elemento existe dentro de set
print('Marte' in planetas)

# Agregar un elemento

planetas.add('Tierra')
print(planetas)

# Eliminar elementos, puede arrojarun error si el elemento no existe

planetas.remove ("Jupiter")# Esta funcion ante la inexistencia o un mal ingreso del elemnto da error
print(planetas)
planetas.discard("tierra")# esta funcion no nmos representa ningun tipo de error
print(planetas)

#Limpiar set o conjunto

planetas.clear()
print(planetas)

#Eliminar set o conjuntos
del planetas
# print(planetas) # al elminar nos muestra un error

#"Maradona":10 Un diccionario esta compuesto por dos elementos
# una llave y un valor
# dict (key,value)
diccionario = {
    'IDE':'Intregrated Development Environment',
    'POO':'Programacion Orientada a Objetos',
    'SABD':'Sistema de Administracion de Base de Datos'
}

#Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

#Acceder a un diccionasrio con la llave (Key)

print(diccionario['IDE'])

# Otra forma de recuperar un elemnento

print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elementos
diccionario ['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Concatenamos listas

lista1 = [1,2,3]
lista2 = [4,5,6]
lista3 = lista1 + lista2 # Concatenamos
print(lista3)

lista3.extend ([7,8,9,1]) # Funcion para gregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Funcion para ubicar en que inice esta el valor ingresado
# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1)) # Cuenta cunto valores iguales hjay dentro de la lista
# Para poner al reves una lista
lista3.reverse()
print(lista3)

#Para que una lista se multiplique repitindo sus elñemtnos
lista = [1,2,3]*2
print(lista)

# Metodos de ordenamiento
lista3.sort()# Ordena nuestros elementos de forma ascendente
print(lista3)
lista3.sort(reverse=True) # ordena descendente
print(lista3)


tupla = (4,'Hola',6.78, [1,2,78], 6) # Pueden tener diferentes tipos de datos dentro
print(tupla)

print( 4 in tupla) # Accion booleana, su respeusta es del tipo booleana

# Repaso de set o conjunto
# para definir un conjunto
conjunto = set()
conjunto1 = {"Hola",}
conjunto.add (7)
conjunto.add("Hola")
print(conjunto)
conjunto1.add("bye")
print(conjunto1)
print(3 not in conjunto1)# Preguntamos si el numero 3 no esta en el conjunto1
# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto)# Nos devuelve como respuesta un booleano

# Operaciones en conjuntos
conjunto2 = conjunto | conjunto1 # La linea une los dos conjuntos
print(conjunto2)

conjunto2 = conjunto & conjunto1 # Que elementos tiene en comun
print (conjunto2)

conjunto2 = conjunto - conjunto1 # Asigna el valor que esta en el conjunto1 pero no el conjunto2
print(conjunto2)
conjunto2 = conjunto1 - conjunto
print(conjunto2)

conjunto2 = conjunto ^ conjunto1 # Son los elementos que estan en los dos conjuntos y no estan compartidos
print(conjunto2)

conjunto2 = conjunto | conjunto1
print(conjunto.issubset(conjunto2))# Aqui preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto2.issubset(conjunto1))
print(conjunto2.issubset(conjunto))

print(conjunto2.issuperset(conjunto)) # Preguntamos si los elmentos de l conjunto estan dentro del 2
print(conjunto2.issuperset(conjunto2)) # Si es verdedero quiere decir que el conjunto2 es un superconjunto
print(conjunto1.issuperset(conjunto2 ))

# Como saber si ambos conjuntos son disconexos, esto es sino comparten conjuntos en comun
print(conjunto.isdisjoint(conjunto1)) # No hay cosas en comun

# Convertir un conjunto totalmente inmutable
conjunto = frozenset # Esto hace que un conjunto sea totalmente inmutable
# No se peude agreagar, modificar ni eliminar elementos del conjunto

# Repaso de diccionarios
diccionarioNuevo = { 'Azul' : 'Blue', 'Rojo' : 'Red', 'Verde' : 'Green', 'Amarillo' : 'Yellow'}
print(diccionarioNuevo)

# Como eliminar
del(diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferentes tipos de datos

diccionario2 = {'Ariel': {'Edad': 40, 'Altura': 1.83} ,'Osvaldo': [45, 1.85], 'Natalia': [35, 1.67]}
print(diccionario2)

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 MIllones', 'Posicion': 'Extremo Derecho'}
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

# Pilas usando listas
    pila = [1, 2,3]

#Agregar elementos a la pila por el final
    pila.append(4)
    pila.append(5)
print(pila)

#Seguimos mostrando como recorrer un diccionario con el ciclo for
for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')