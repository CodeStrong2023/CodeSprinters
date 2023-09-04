# Lista de string (nombres)
# Lista = Ariel , Liliana, Natalia, Osvaldo 
# A cada elemento se le indica un indice. (0,1,2,3,4)

nombres =["Naty","Osvaldo","Lily","Ariel"]
print(nombres)
# Imprimimos un nombre espesifico de la lista indicando el indice

print(nombres[0])
# Para inprimir el ultimo elemento

print(nombres[-1])
# Los numeros negativos recorren la lista a la inversa
# Como recuperar un rango de la lista - no recorre en numero 0 y 2 

print(nombres[0:2])
# Ir del inicio de la lista al indice sin incuir el indice

print(nombres[ :3])
# Ir desde el indice indicado hasta el final

print(nombres[1: ])
# Modificamos un valor de la lista indicando el indice

nombres[3] = "Liliana"
nombres[0] = "Gena"
print(nombres)
# Iteramos la lista

for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los nombres de la lista")

# Cuantos elementos tiene una lista ?

print(len(nombres)) #Le pasamos como parametro la lista
# Agregamos un elemnto para trabajar con una lista
# Para ingresar cadenas a una lista 

nombres.append ("Marcelo") # La cadena la ingresa a el ultimo elemento
print(nombres)

# Para ingresar la cadena en una posicion especifica
nombres.insert(1,"Alberto")
print(nombres)
nombres.insert(3,"Ramon")

# Eliminamos un elemento de la lista
nombres.remove("Ramon")
print(nombres)

# Tuplas-- son como listas pero no se pueden modificar osea son inmutables 
# Definimos una tupla Se usan parentesis no corchetes
cocina = ("cuchara","cucharita","cucaracha","cucharon")
print(len(cocina))

# Acceder a un elemento 
print(cocina[0])

# Manera Inversa de atras hacia adelanta 
print(cocina[-1])

# Como acceder a un rango 
print(cocina[0:3])

# Ejemplo esto es una cadena es una variable tipo srtg
verduras =("papa")
# Para que sea tupla hay que colocarle una coma 

# Recorremos los elementos de la tupla
for cocinar in cocina:
    print(cocinar) #  Print esta  usando \n para saltos de linea

# Para evitar saltos de linea seria
for cocinar in cocina:
    print(cocinar,end=" ")

# Como modificar una tupla .
# Solo se puede hacer convirtiendo la tupla en lista y luego la lista en tupla

cocinaLista = list(cocina)
cocinaLista[0]= "Plato"
cocina = tuple(cocinaLista)
print("\n",cocina)

# No es una buena practica la gracia de la tupla es que no se pueda modificar

#Como eliminar una tupla
del cocina

