# Clase N ° 3
# Conjuntos 
# Dentro de un conjunto .. hay valores unicos y pueden tener distitos tipos de datos
conjunto = set()
conjunto1 = {"bye"} # Con llaves solas no se le puede añadir nada / Es necesario agregar un elemento
conjunto.add(7)
conjunto.add("hola")
print(conjunto)
conjunto1.add("Hola")
print(conjunto1)
# Imprimo preguntando si es el número 3 esta en el conjunto .. devuelve un booleano
print(3 not in conjunto1)
# Igualdad de dos conjutos 
print(conjunto1 == conjunto) #Tambien devuelve un booleano
# Operaciones en conjutos

# Union de conjutos
conjunto3 = conjunto1 | conjunto
print(conjunto3)

# Interseccions de conjuntos
conjunto3 = conjunto1 & conjunto
print(conjunto3)

# Muestra de elementos de un solo conjunto
conjunto3 = conjunto - conjunto3
print(conjunto3)

# Diferencia simetrica
conjunto3 = conjunto ^ conjunto1
print(conjunto3)

# Como saber si un conjunto esta dentro de otro conjunto - devuelve un booleano
conjunto3 = conjunto | conjunto1
print(conjunto1.issubset(conjunto3))

print(conjunto3.issuperset(conjunto1))
print(conjunto3.issuperset(conjunto))
print(conjunto.issuperset(conjunto3))

# Como saber si los conjuntos no comparte ningun elemento en comun
print(conjunto1.isdisjoint(conjunto)) 

# Para que los conjuntos sean inmutables 
conjunto1 = frozenset 

# Repaso Diccionario
diccionario = {"Azul": "Blue","Rojo":"Red","Verde": "Green","Amarrillo": "Yellow"}
print(diccionario)

# Como eliminar 
del (diccionario["Azul"])
print(diccionario)

# Como agregar otros daros
diccionario2 ={"Arieñ":{"Edad":40,"Altura":1.83},"Genaro":[25,1.80],"Natalia":[35,1.67]}
print(diccionario2)

seleccionArgentina = {
    10:{"Nombre":"Lionel Messi","Edad":35,"Altura":1.70,"Precio":"50 Millones", "Posicion": "Extremo Derecho"},
    11:{"Nombre": "Angel Dimaria","Edad":34,"Altura":1.80,"Precio":"12 Millones","Posicion":"Extremo Derecho"},
    24:{"Nombre": "Paulo Dybala","Edad":28,"Altura":1.77,"Precio":"35 Millones","Posicion":"Media Punta"},
    19:{"Nombre": "Nicolas Otamendi","Edad":34,"Altura":1.83,"Precio":"3.5 Millones","Posicion":"Defensa Central"},
    2:{"Nombre": "Franco Armani","Edad":35,"Altura":1.89,"Precio":"3.5 Millones","Posicion":"Arquero"},
    20:{"Nombre": "Julian Alvarez","Edad":23,"Altura":1.70,"Precio":"30 Millones","Posicion":"Delantero"},
    1:{"Nombre": "Damian Emiliano Martinez","Edad":31,"Altura":1.95,"Precio":"20 Millones","Posicion":"Arquero"},
    8:{"Nombre": "Enzo Fernandez","Edad":22,"Altura":1.78,"Precio":"25 Millones","Posicion":"Mediocampista"},
    29:{"Nombre": "Gonzalo Montiel","Edad":26,"Altura":1.79,"Precio":"10 Millones","Posicion":"Lateral Derecho"}
}
print(seleccionArgentina)
# Recorremos el arreglo
for llaves,valor in seleccionArgentina.items():
    print(llaves,valor)

# Vemos el tamaño
print("Tenemos cargados en el diccionario la cantidad de : ")
print(len(seleccionArgentina))

# Se agregaron 4 jugadores nuevos a el diccionario

# Pilas
pila = [1,2,3]
print(pila)

# Se trabaja con el ultimo elemento - SE AGREGA AL FINAL y se quita al final metodo
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos y retorna
elementoBorrado = pila.pop()
print(pila)
print("El elemento borrado es: ",elementoBorrado)

# Colas con Listas
# Estructura de datos tipo fifo (primero en entrar primero en salir -firs input / firs output)
cola=["Ariel","Osvaldo","Lilliana","Pilar"]

# Agregamos elementos 
cola.append("Natalia")
cola.append("Jose")
print(cola)

# Sacamos elementos 
seRetira = cola.pop(0)
print("Atendido el cliente: ", seRetira)
print(cola)

seRetira = cola.pop(0)
print("Atendido el cliente: ", seRetira)
print(cola)

seRetira = cola.pop(0)
print("Atendido el cliente: ", seRetira)
print(cola)

seRetira = cola.pop(0)
print("Atendido el cliente: ", seRetira)
print(cola)