# Ejercicio 13: funcion con *args para multiplicar 
#Crear una funcion para multriplicar los valores
#recibidos de tipo numerico, utilizando argumentos variables *args
# como parametro de la funcion y regresar como resultado
#la multiplicacion de todos los valores pasados como argumentos

def ejercicio13(*nums):
    mult = 1
    for n in nums:
        mult *= n
    return mult

print(ejercicio13(1,2,3,4,5,6,7,8,9,10))

def listarTerminos(**terminos):
    for key,value in terminos.items():
        print(f"{key}: {value}")

listarTerminos() # no imprime nada
listarTerminos(IDE="Integrated Development Environment", PK="Primary Key", DBMS="Database Management System")

def desplegarNombres(nombres):
    for n in nombres:
        print(n)
nombres2 = ["Matias","Pablo","Juan"]
desplegarNombres(nombres2)
desplegarNombres("Matias") # imprime cada letra
desplegarNombres((1,2,3,4)) # imprime cada numero
desplegarNombres([1,2,3,4]) # imprime cada numero
desplegarNombres((10,)) # imprime 10

def factorial(numero):
    if numero == 1:
        return 1
    else:
        return numero * factorial(numero-1) 
resultado = factorial(5)
print("El factorial de 5 es: ",resultado)

##Ejercicio: que el usuario ingrese un numero y mostrar el factorial de ese numero
numero = int(input("Ingrese un numero: "))
resultado = factorial(numero)
print(f"El factorial de {numero} es {resultado}")

#Ejercicio 14: Imprimir numeros de manera descendente usando recursividad

def ejercicio14(numero):
    if numero == 0:
        return 0
    elif numero < 0:
        return
    else:
        print(numero)
        return ejercicio14(numero-1)


##Ejercicio 15: Calculadora de impuestos
#Crear una funcion para calcular el total de un pago incluyendo
# un impuesto aplicado (IVA)
#mostrar pago sin impuesto, porcentaje de impuesto y total del pago

def ejercicio15(pago,impuesto):
    total = pago + pago * impuesto / 100
    print(f"El pago sin impuesto es {pago}")
    print(f"El porcentaje de impuesto es {impuesto}")
    print(f"El total del pago es {total}")

ejercicio15(100,21)

#Ejercicio 16: Convertidor de temperaturas
# realizar dos funciones para convertir de grados celcius a 
#fahrenheint y viceversa
# °C = (°F - 32) / 1.8
# °F = °C * 1.8 + 32

def celciusToFahrenheit(celcius):
    fahrenheit = celcius * 1.8 + 32
    print(f"pasaste de {celcius}°C a {fahrenheit}°F")

def fahrenheitToCelcius(fahrenheit):
    celcius = (fahrenheit - 32) / 1.8
    print(f"pasaste de {fahrenheit}°F a {celcius}°C")

celciusToFahrenheit(0)
fahrenheitToCelcius(32)
