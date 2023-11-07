# Mostrar una frase sin espacions y contar su longitud
frase = input("Digite una frase: ")
frase1 = " "
for i in frase:
    if i != " ":
            frase1 +=i 
frase = frase1
print(f"\n Frase Final: {frase}")
print(f"\n Número de caracteres: {len(frase)}")

