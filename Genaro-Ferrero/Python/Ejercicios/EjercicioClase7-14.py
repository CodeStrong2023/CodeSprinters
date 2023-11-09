# Ejercicio 3: Funciones Recursiva
# imprimir valores del 5 al 1 de manera desendente segun que numero
# ingresa el usuario

def pedido(num):
    if num > 5:
        print("Valor ingresado incorrecto")
    elif num >= 1:
        print(num)
        pedido(num-1)
    elif num == 0:
        return
    elif num <= 0:
        print("Valor ingresado incorrecto")

num = int(input("Digite la Un número del 1 al 5 : "))
pedido(num)