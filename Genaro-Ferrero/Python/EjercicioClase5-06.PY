# Tabla de multiplicar 

numero = int(input( "Digite un número "))
lista= []
for i in range (1,11):
    lista.append(i*numero)
print(f"\n Tabla de multiplicar del {numero}: \n {lista}")
