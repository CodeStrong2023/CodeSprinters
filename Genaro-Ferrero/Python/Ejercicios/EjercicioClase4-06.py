# Llenar una lista con números del 1 al 50
# Imprimir la lista
print("Ejercicio N°6")
lista=[]
i=1
# LLenamos la lista con while
while i <= 50 :
    lista.append(i)
    i+=1
# Mostramos la lista 
for i in lista:
    print(i,end="-")
print("\n","El mismo ejercicios pero ahora programado en una sola linea de codigo")
# Llenamos la lista e imprimimos
lista1 = list(range(1,51)) # Comienza de 0 - por eso se escribe el 51
for i in lista1:
    print(i,end="-")
    
