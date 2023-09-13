# tipo set
planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno"}
print(planetas) # No se sabe el orden en el que se van a imprimir

# Largo
print(len(planetas))

# Revisar si un elemento esta presente
print("Marte" in planetas) # True 
print("Pluton" in planetas) # False

# Agregar un elemento
planetas.add("Pluton")
planetas.add("Tierra") # No se puede repetir elementos, no se agrega
print(planetas)

# Eliminar con remove posiblemente arroja error
planetas.remove("Pluton")
print(planetas)
# planetas.remove("Pluton") # Arroja error

# Eliminar con discard no arroja error
planetas.discard("Jupiter")
print(planetas)
planetas.discard("Jupiter") # No arroja error

#Diccionarios
# Llave: Valor
diccionario = {
    "IDE": "Integrated Development Environment",
    "OOP": "Object Oriented Programming",
    "DBMS": "Database Management System"
}
print(diccionario) # No se sabe el orden en el que se van a imprimir

# Largo
print(len(diccionario)) 

# Acceder a un elemento (key)
print(diccionario["IDE"]) # Si no existe arroja error
print(diccionario.get("IDE")) # Si no existe no arroja error

# Modificar valores
diccionario["IDE"] = "Integrated development environment" # No se puede repetir llaves
print(diccionario)

# Iterar llaves
for termino in diccionario:
    print(termino) # Imprime las llaves

for termino in diccionario:
    print(diccionario[termino]) # Imprime los valores

for valor in diccionario.values():
    print(valor) # Imprime los valores

for termino, valor in diccionario.items(): # items() devuelve llaves y valores
    print(termino, valor) # Imprime llaves y valores

# Comprobar existencia de elementos
print("IDE" in diccionario) # True
print("SEO" in diccionario) # False

# Agregar nuevos elementos
diccionario["PK"] = "Primary Key"
print(diccionario)

# Remover elementos
diccionario.pop("DBMS") # Arroja error si no existe
print(diccionario)
diccionario.popitem() # Remueve el ultimo elemento agregado
del diccionario["IDE"] # Arroja error si no existe

# Vaciar diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario
print(diccionario) # Arroja error

# Concatenar listas
lenguajes = ["Python", "Kotlin", "Java", "JavaScript"]
frameworks = ["Django", "Flask", "Spring", "Angular"]
lista_concatenada = lenguajes + frameworks
print(lista_concatenada)
print(lista_concatenada.index("Kotlin")) # Devuelve el indice del elemento
print(lista_concatenada.index("React")) # Arroja error si no existe

# Saber cuantos valores repetidos hay dentro de una lista
print(lista_concatenada.count("Java")) # Devuelve 1


# Que la lista se multiplique repitiento sus elementos
lista_multiplicada = ["Hola"] * 10
print(lista_multiplicada)
lenguajes_multiplicados = lenguajes * 3

# Metodos de ordenamiento

lenguajes.sort() # Ordena la lista

# Ordenar de forma inversa
lenguajes.sort(reverse=True)

tupla = (10, 'Hola', 6.78, [1,2,3], 10) # Puede contener cualquier tipo de dato
print(tupla)

print (4 in tupla) # Devuelve False
# Lo que podemos usar dentro de las tuplas son: index, count, len
# En tuplas se puede convertir una lista y viceversa
