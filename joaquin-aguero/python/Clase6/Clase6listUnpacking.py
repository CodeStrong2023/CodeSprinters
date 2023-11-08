# Comenzamos con funciones
# mi funcion () no se puede llamar antes de definir a una funcion
# Definimos una funcion
def mi_funcion(): # Para identificar a la funcion utilizamos parentesis
    print('Saludos a los alumnos de la tecnicatura')

mi_funcion() #Estamos llamando a la funcion
mi_funcion() # Se puede llamar a una funcion n cantidad de veces

# Desempaquetado de listas o list unpacking
def show(name, lastName):
    print(name+' '+lastName)
person = ["Francisco", "Corvalan"]
show(person[0], person[1]) #Pasamos uno por uno los datos de la lista a la funcion
show(*person) # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ["Edinson", "Cavani"]
show(*person2)
person3 = {'lastName': "Merentiel", "name": "Miguel"}
show(**person3)

numbers = [1, 2, 3, 4, 5] # Aun con el la lista vacia se va a ejecutar el else
for n in numbers:
    print(n)
    if n == 3:
        break # Esta es la unica manera para que no se ejecute el else
else:
        print('Esto se termino')

# List comprehension, lista de compresion
names = ["Cavani", "Romero", "Barco", "Merentiel"]
alongP = [p for p in names if p[0] == 'P'] # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stela Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumento (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a traves de YouTube")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Jorge", "Lucero")
mi_funcion2("Ariel", "Betancud")
mi_funcion2("Analia", "Pedrosa")

# La palabra return en funciones
# Creamos un funcion para sumar
def sumar (a, b):
    return a + b
# resultado = sumar (78, 22)
# print(f'El resultado de la suma es:{resultado})
print(f'El resultado de la suma es: {sumar(55, 45)}')

def sumar2(a = 0, b = 0): # Le damos un valor por default
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')

def listarNombres(*nombres): # Normalmente se utiliza: *args
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
listarNombres('Cavani', 'Merentiel', 'Barco')
listarNombres('Roncaglia', 'Valdez', 'Briasco')
