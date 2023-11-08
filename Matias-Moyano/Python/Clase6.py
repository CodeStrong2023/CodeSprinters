""" Ejercicio 10: No repetir caracteres
    Hacer un programa que pida una cadena por teclado
    luego meter los caracteres en una lista sin repetir caracteres
 """
def ejercicio10():
    cadena = input("Ingrese una cadena: ")
    lista = []
    for i in cadena:
        if i not in lista:
            lista.append(i)
    print(lista)

""" Ejercicio 11: Agenda telefonica
    Hacer un programa que simule una agenda de contactos
    Crear un diccionario donde la clave sea el nombre del contacto
    y el valor sea el telefono. El programa debe tener un menu
    con las siguientes opciones:
    1. Agregar contacto
    2. Eliminar contacto
    3. Ver contactos
    4. Salir
 """

def ejercicio11():
    contactos = {}
    opcion = 0
    while opcion != 4:
        opcion = int(input("1. Agregar contacto\n2. Eliminar contacto\n3. Ver contactos\n4. Salir\nIngrese una opcion: "))
        if opcion == 1:
            nombre = input("Ingrese el nombre del contacto: ")
            telefono = input("Ingrese el telefono del contacto: ")
            contactos[nombre] = telefono
        elif opcion == 2:
            nombre = input("Ingrese el nombre del contacto a eliminar: ")
            if nombre in contactos:
                del contactos[nombre]
            else:
                print("El contacto no existe")
        elif opcion == 3:
            for nombre, telefono in contactos.items():
                print(f"{nombre} - {telefono}")
        elif opcion == 4:
            print("Adios")
        else:
            print("Opcion incorrecta")


def show(name, lastName):
    print(f"Hello {name} {lastName}")
person = ["Matias", "Moyano"]
show(person[0], person[1]) # pasamos uno por uno los datos
show(*person) # pasamos todos los datos de la lista

person2 =( "Matias", "Moyano") 
show(*person2) # pasamos todos los datos de la tupla

person3 = {"name": "Matias", "lastName": "Moyano"}
show(**person3) # pasamos todos los datos del diccionario

numbers = [1,2,3,4,5,6,7,8,9,10]
for n in numbers:
    print(n)
    if n == 5:
        break
else:
    print("Fin del ciclo for")

names = ["Pablo", "Juan", "Pedro", "Maria", "Ana"]
alongP = [p for p in names if p[0] == "P"] #Esto devuelve una nueva lista
print(alongP)

bottleC = [ {"name": "Quilmes", "country": "Arg"},
            {"name": "Brahma", "country": "Brasil"},
            {"name": "Corona", "country": "Mexico"},
            {"name": "Heineken", "country": "Holanda"}]
arg = [b for b in bottleC if b["country"] == "Arg"]
print(arg)
print(bottleC)

def arguments(name,lastName):
    print(f"Hello {name} {lastName}")

arguments(name="Matias", lastName="Moyano") # si no le pasamos los argumentos en orden, debemos especificar el nombre de los argumentos
arguments("matias","moyano") 

#Palabra return en funciones
def suma(a,b):
    return a+b
resultado = suma(5,5)
print(resultado)
print(suma(5,5))

# Valores por defecto en funciones
def suma(a:int=0,b:int=0) -> int: # es redundante poner el tipo de dato en los parametros y en el return
    return a+b
print(suma())
print(suma(5))
print(suma(5,5))

# Argumentos, variables en funciones
def listaNombres(*nombres):
    for n in nombres: #se va a convertir en una tupla
        print(n)

listaNombres("Matias","Moyano","Pablo","Juan")

#Ejercicio 12: Crear una funcion para sumar los valores recibidos
#numericos, utilizando argumentos variables *args como parametro de la
#funcion y agregar como resultado la suma de todos los valores 
#pasados como argumentos

def ejercicio12(*args:int):
    suma = 0
    for a in args:
        suma += a
    return suma

print(ejercicio12(1,2,3,4,5,6,7,8,9,10))

