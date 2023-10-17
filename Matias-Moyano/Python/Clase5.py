import random
# Ejercicio 4: Sumar numeros pares dentro de un rango
def ejercicio4 () :
    inicio = int(input("Ingrese el numero de inicio: "))
    fin = int(input("Ingrese el numero de fin: "))
    suma = 0

    for i in range(inicio,fin+1):
        if i % 2 == 0:
            suma += i

    print(f"La suma de los numeros pares entre {inicio} y {fin} es {suma}")

#Ejercicio 5: Factorial de un numero positivo
def ejercicio5():
    numero = int(input("Ingrese un numero: "))
    factorial = 1

    while numero < 0:
        print("El numero debe ser positivo")
        numero = int(input("Ingrese un numero: "))
    else:
        for i in range(1,numero+1):
            factorial *= i

    print(f"El factorial de {numero} es {factorial}")

#Ejercicio 6: Tabla de multiplicar
#Hacer un programa que pida un numero por teclado y guarde 
# en una lista su tabla de multiplicar hasta el 10.

def ejercicio6():
    numero = int(input("Ingrese un numero: "))
    lista = []

    for i in range(1,11):
        lista.append(numero * i)
    print("La tabla de multiplicar es:")
    print(lista)

#Ejercicio 7: Juego adivina el numero

#Realizar un juego para avidinar el numero, para ello
#se debe generar un numero aleatorio entre 1 y 100, y
# luego ir pidiendo numeros indicando "es mayor" o "es menor"
# El proceso termina cuando el usuario acierta y mostrar
# en cuantos intentos acerto

def ejercicio7():
    numero = random.randint(1,100)
    intentos = 0
    adivinado = False
    print("Adivina el numero entre 1 y 100")
    while not adivinado:
        intentos += 1
        numeroUsuario = int(input("Ingrese un numero: "))
        if numeroUsuario == numero:
            adivinado = True
        elif numeroUsuario > numero:
            print("El numero es menor")
        else:
            print("El numero es mayor")
    print("Adivinaste el numero!")
    print(f"Acertaste en {intentos} intentos")

#Ejercicio 8 Menu interactivo - cajero automatico
# Hacer un programa que simule un cajero automatico con un saldo inicial de $1000
# y tendra el siguiente menu:
# 1. Ingresar dinero en la cuenta
# 2. Retirar dinero de la cuenta
# 3. Mostrar dinero disponible
# 4. Salir

def ejercicio8():
    saldo = 1000

    opciones = int(input("Bienvenido al cajero automatico\n1. Ingresar dinero en la cuenta\n2. Retirar dinero de la cuenta\n3. Mostrar dinero disponible\n4. Salir\nIngrese una opcion: "))
    while opciones != 4: # Si aprieta 4 sale del programa
        if opciones == 1: # Si aprieta 1 ingresa dinero
            ingreso = int(input("Ingrese el monto a ingresar: "))
            saldo += ingreso
            print(f"El saldo disponible es {saldo}")
        elif opciones == 2: # Si aprieta 2 retira dinero
            retiro = int(input("Ingrese el monto a retirar: "))
            if retiro > saldo:
                print("No tiene saldo suficiente")
            else:
                saldo -= retiro
                print(f"El saldo disponible es {saldo}")
        elif opciones == 3: # Si aprieta 3 muestra el saldo
            print(f"El saldo disponible es {saldo}")
        else:
            print("Opcion incorrecta")
        opciones = int(input("Bienvenido al cajero automatico\n1. Ingresar dinero en la cuenta\n2. Retirar dinero de la cuenta\n3. Mostrar dinero disponible\n4. Salir\nIngrese una opcion: "))

#Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
#pedir al usuario una frase, 
#se le devolvera la misma frase pero sin espacios y contar los caracteres
#sin contar los espacios en blanco

def ejercicio9():
    frase = input("Ingrese una frase: ")
    fraseSinEspacios = frase.replace(" ","")
    print(fraseSinEspacios)
    print(f"La longitud de la frase es {len(fraseSinEspacios)}")

# Para probar los ejercicios:
#ejercicio4()
#ejercicio5()
#ejercicio6()
#ejercicio7()
#ejercicio8()
#ejercicio9()
