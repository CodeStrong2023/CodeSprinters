# Clase N ° 2 
# Coleccion tipo set 
# Esta no tiene un orden y no permite almacenar elementos repetidos no se puede cambiar pero permite agregar o quitar elementos
# El orden de esta lista es completamente aleatorio

planetas={"Marte","Tierra","Jupiter","Venus"}
print(planetas)

# Funciones del tipo set
# Lend largo de la cadena
print(len(planetas))

#Revisar si un elemnto existe o no - tiene un cuenta los acentos
print("Marte" in planetas)

#Revisar si un elemento no esta en la lista
print("Marte" not in planetas )

#Agregar un elemento 
planetas.add("Venus")  # add es una funcion
print(planetas)

# Para eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove("Jupiter")
print(planetas)

# Discard hace lo mismo pero si no escribimos bien el elemento solo no lo borra ... no tira error
planetas.discard("Tierra")
print(planetas)

# Limpiar el tipo set -de esta forma queda vacio 
planetas.clear()
print(planetas)

# Para eliminar la lista
del planetas

# Diccionario es una cadena + una informacion asociada
diccionario= {
    "IDE":"Integrated Development Environment",
    "POO":"Programacion Orientada a objetos",
    "SABD":"Sistema de administracion de base de datos "
}
print(diccionario)

# Len cantidad de elementos del diccionario
print(len(diccionario))
 
# Como acceder a un elemento - Las llave nos da acceso al valor (escribir sin errores)
print(diccionario["IDE"])

# Formas de recuperar un elemento
print(diccionario.get("POO"))

# Modificacion de un elemento
diccionario["IDE"]="Entorno de desarrollo integrado"
print(diccionario.get("IDE"))

# Como recorrer los elementos
for termino in diccionario:
    print(termino)

# Para acceder al valor de la llave 
for termino,valor in diccionario.items():
    print(termino,":",valor)

# Otras maneras de acceder a un diccionaro -(muetra solo las llaves)
for termino in diccionario.keys():
    print(termino)

# Imprime los valores sin las llaves
for valor in diccionario.values():
    print(valor)

# Comprovar la existencia
print("IDE" in diccionario)

# Comprovar si no esta 
print("IDE" not in diccionario)

# Agregar un elemento ( no es posible agregar llaves duplicadas)
diccionario["PK"]= "Llave primaria"
print(diccionario)

# Eliminar un elemento 
diccionario.pop("PK")
print(diccionario)

# Vacial un diciconario
diccionario.clear
print(diccionario)

# Eliminar diccionario 
del diccionario

# Repaso de listas 
nombres= ["gena","joel","agustin","german"]
print(nombres)

# Se puede agregar cualquier tipos  de variables a la lista 
nombres.append([1,2,3])
nombres.append(True)
nombres.append(10.45)
print(nombres)

# Como concatenar listas
lista1= [1,2,3]
lista2= [4,5,6]
lista3= lista1 + lista2
print(lista3)

# Funciones extend siver para agregar varios elementos de una lista
lista3.extend([7,8,9,1,1,1])
print(lista3)

# Funcion index para ver en que indice esta un elemento - el valor tiene que estar en la lista sino tira error 
print(lista3.index(5))

# Cuantos valores se repiten en una lista
print(lista3.count(1))

# Como poner alrrevez la lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista=[1,2,3]*2
print(lista)

# Metodos de ordenamientos los ordena de una manera acendente por default
lista3.sort()
print(lista3)

# A la inversa seria (de forma descendente )
lista3.sort(reverse=True)
print(lista3)

# Repaso de tuplas
# Que podemos repetir ?
tupla = (4,"hola",4.123,[1,2,3],4,"hola")
print(tupla)

# Buscar un elemento en truplas (booleano)
print(4 in tupla) # Si no esta ponemos not in 