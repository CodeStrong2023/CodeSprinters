print("Ejercicio N°8")
# Pedir numeros y meterlos en un lista , cuando el usuario intruduzca un número 0 el programa deja de insertar elementos 
# Por ultimo mostrar los elementos ordenamos de mayor a menor
lista1=[]
salir = False
# Pedimos números para la lista al usuario 
print("Se pediran números para una nueva lista")
print("El programa dejara de pedir Números cuando usted ingrese el número 0")
while not salir:
    numero = int(input("Digite un Número para agregar a la lista: "))
    if numero == 0:
        salir = True
    else: 
         lista1.append(numero)
# Le damos la salida al usuario 
print("Usted ingreso el número 0")
lista1.sort() # Con esto ordenamos la lista
# Damos nostramos la lista al usuario 
print(f"Su lista ordenada de menor a mayor sera: \n {lista1} ")