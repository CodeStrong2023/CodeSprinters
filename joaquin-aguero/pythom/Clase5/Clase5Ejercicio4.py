# Ejercicio 4: Juego adivina el numero
# Realizar un juego para adivinar un numero. Para ello se debe generar un numero aleatorio entre el 1 y el 100, y luego ir pidiendo numeros indicando "es mayor" o  "es menor" segun sea con respecto a n. El proceso termina cuando el usuario acierta y alli se debe mostrar el numero de intentos
import random
print("\t.: Juego de adivinar el numero:.")
aleatorio = random.randint(0, 100)
contador = 0
while True:
    numero = int(input("Digite un numero: "))
    contador += 1
    if numero > aleatorio:
        print("\tNo es el numero, digite un numero menor")
    elif numero < aleatorio:
        print("\tNo es el numero, digite un numero mayor")
    else:
        print(f"FELICITACIONES, ACABAS DE ADIVINAR EN NUMERO {aleatorio}")
        break
    print(f"\nNumero de intentos: {contador}")
