#Ejercicio5
nota = int(input("Ingrese una calificacion :"))
califica = None
if 9 <= nota <= 10:
    califica = " A"
elif 8 <= nota <= 9:
    califica = "B"
elif 7 <= nota <= 8:
    califica = "C"
elif 6 <= nota <= 7:
    califica = " D"
elif 0 <= nota <= 6:
    califica = " F"
else:
    print("El numero ingresado es incorrecto")
print(f"Su nota es : {nota} y su calificaion es : {califica}")