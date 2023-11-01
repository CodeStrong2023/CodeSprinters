# Hacer un programa que pida una cadena por teclado
# Meter los caracteres en una lista sin repetir caracteres
cadena = input ("Digite una cadena: ")
lista = []
for i in cadena:
    if i not in lista:
        lista.append(i)
print(f"\n Lista de caracteristicas sin repertir ninguno: \n {lista}")
