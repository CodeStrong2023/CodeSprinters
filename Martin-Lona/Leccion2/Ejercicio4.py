#Ejercicio 4

edad = int(input("Digite su edad :"))
mensaje = None
if edad >= 0 and edad < 10:
    mensaje = "La infancia es increible y es bella"
elif edad >= 10 and edad < 20:
    mensaje =  "Tienes muchos cambios, mucho que estudiar"
elif edad >= 20 and edad < 30:
    mensaje = "Amor y comienzo del trabajo"
else:
    print( "La opcion es incorrecta" )
print (f"Si tienes {edad} el mensaje es: {mensaje}")

