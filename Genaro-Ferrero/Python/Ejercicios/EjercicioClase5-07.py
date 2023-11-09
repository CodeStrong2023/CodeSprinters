
import random
print("Juego del número aleatorio")
aleatorio = random.randint(0,100)
contador = 0
while True :
    numero = int(input(f"\n Adivine el número correcto del 1 al 100: "))
    contador +=1
    if numero > aleatorio:
        print("\t No es el número, digite un número menor" )
    elif numero < aleatorio:
        print(f"\t No es el número digite un número mayor")
    else:
        print(f"Felicitaciones acabas de adivinar el número {aleatorio}")
        break
print(f"\n Hiciste {contador} intentos!!")