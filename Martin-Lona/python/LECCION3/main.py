
'''
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los alumnos de la Tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x=10
y=2
z= x + y
print(id(z))
#Las literales se escriben x 232
print(id(x))
print(id(y))

# Tipos int, float, string, bool
x = 10
print(x)
print (type(x))
x = 13.5
print(x)
print(type(x))
x = "Hola Mundo"
print (x)
print(type(x))
x = True
print (x)
print (type(x))
# Manejo de cadenas (String)
miGrupoFavorito = " Pink Floyd "+"y "+"Artic Monkeys"
caracteristicas= "La Mejor Banda de Rock Progresivo"
print(" Mi Grupo Favorito es: " , miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2= "8"
print (int(numero1) + int(numero2))

 # Tipos de Booleanos (Bool)

miBooleano = 1 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")


    # Porecesar la entrada del usuario
    # Funcion Input
    resultado = input("Digite un numero:") # Regresa un dato tipo string
    print(resultado)

# Conversion de la entrada de datos
numero1 = int(input("Escribe el primer numero:"))
numero2 = int(input("Escribe el segundo numero:"))
resultado = numero1 + numero2
print ("El resulado es:", resultado)

# Ejercicio

miDia = int(input("Como estuvo tu dia del 1 al 10:"))
print ("Mi dia estuvo de ", miDia)
'''

"""
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
#print("El resultado de la suma es :",suma)
print(f"El resultado de la suma es : {suma}")

resta = operandoA -operandoB
print (f"El resultado de la resta es : {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es : {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la division es : {division}")

division = operandoA // operandoB
print(f"El resultado de la division es (int) : {division}")

modulo = operandoA % operandoB
print(f"El resultado de la division es (modulo) : {modulo}")

exponente = operandoA ** operandoB
print(f"El resultado de la division es : {exponente}")
"""
"""
alto = int(input("Preporciona el alto del rectangulo: "))
ancho =int(input("Proporciona el ancho del rectangulo :"))
area = alto * ancho
perimetro = (alto + ancho) *2

print ("Area:", area)
print ("Perimero:", perimetro)
"""
"""
miVariable3 = 10
print(miVariable3)

# Operadores de Reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

miVariable3 -= 2
print(miVariable3)

miVariable3 *= 3
print(miVariable3)

miVariable3 /= 2
print(miVariable3)

d = 4
b = 4
resultado = d == b # Comprobamos si son iguales
print(resultado)

# Operador diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print (resultado)

# Operador menor que
resultado = d< b
print(resultado)

# Operador menor o igual que
resultado = d <= b
print (resultado)
"""
"""
a = int(input("Digite un numero:"))
if a % 2 == 0:
    print(f"El valor de a es : {a} es numero PAR")
else:
     print(f"El valor de a es : {a} es numero IMPAR")
"""
"""
edadAdulto = 18
edadPersona = int(input("Digite su edad :"))
if edadPersona >= edadAdulto:
    print(f"Usted tiene: {edadPersona} y es mayor de edad")
else:
    print(f"Usted tiene: {edadPersona} y es menor de edad")
"""

#Operadores Logicos
"""
a = True
b = False
resultado = a and b
print(resultado)

# Operadro Or
resultado = a or b
print(resultado)

# Operador NOT
resultado = not a
print(resultado)
"""
"""
# Ejercicio valor dentro de un rango
valor = int(input("Digite un numero:"))
valorMinimo = 5
valorMaximo = 10
dentroRango = valor <= valorMaximo and valor >= valorMinimo
if dentroRango:
    print(f" El numeoro {valor} esta dentro del rango")
else:
    print(f"El numero {valor} esta fuera del rango")
   """

# Ejercicio con el operador OR
"""
vacaciones = True
diaDescanso = False
if vacaciones or diaDescanso:
    print("Puede asistir al juego")
else:
    print("No puede asistir al juego")
"""

# Ejercicio rango entre 20 y 30 años
"""
edad = int(input("Digite su edad:"))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

if veinte or treinta:
     print("Estas dentro del rango de 20 a 39 años")
else:
     print("No estas dentro del rango de 20 a 39 años")
     """
# Ejercicio solicitar dos valores imprimir el mayor
"""
valor1 = int(input("Digite el primer valor:"))
valor2 = int(input("Digite el segundo valor:"))
if valor1 < valor2:
print("El valor valor mayor es el 2")
else:
print("El valor mayor es el 1")
"""

# Ejercicio tiendo de libros
"""
print("Ingrese los siguientes datos de un libro")
nombreLibro = input ("Digite el nombre del Libro:")
idLibro = int(input("Digite el ID del libro"))
precioLibro = float (input("Digite el precio del Libro:"))
envioLibro = input("El envio es gratis (True / False):")
if envioLibro == 'True':
    enviolibro = True
elif envioLibro == 'False':
    envioLibro = False
else:
    envioLibro = "Los datos ingresados son incorrectos"
print(F'''
        Nombre del Libro: {nombreLibro}
        ID del LIbro:{idLibro}
        Precio del Libro: {precioLibro}
        El envio es gratis: {envioLibro}
''')
"""
"""
# Imprimimos los numeros del 0 al 5 con el ciclo while

maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1
"""
"""
minimo = 1
contador = 5
while minimo <= contador:
    print(contador)
    contador -=1
"""

# Ciclo For
"""
cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")
"""

# Palabra reservada Break
"""
for letra in "Alemania":
    if letra == "a":
            print(f"La letra encontrada es: {letra}")
            break
else:
    print("Fin de ciclo for")
"""

# Palabra reservada continue
"""
for i in range(6):
    if i % 2 == 0:
        print (f"Valor : {i}")

for i in range(6):
    if i % 2 != 0:
        continue
    print(f"Valor: {i} ")
"""

# Ejercicio Año Biciesto

opcion = 1
while opcion == 1:
    num = int(input("Ingrese el numero de año :"))
    if ((num % 4 == 0) and (num % 100 != 0 )) or (num % 400 == 0):
        print("El año es biciesto")
    else:
        print("El año no es biciesto")
    opcion = int(input("Ingreses la  opcion (1) para seguir adelante  :"))
else:
    print ("gracias")




