# Sumar nùmeros pares dentro de un rango .
a = int(input("Digite de donde va a comenzar la suma:"))
b = int(input("Digite hasta donde quiere sumar:"))
suma = 0
for i in range (a ,b + 1 ):
    if i% 2 == 0:
        suma+=i

print(f"\n La suma de los nùmeros pares en ese rango es: {suma}")
