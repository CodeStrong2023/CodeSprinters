#Ejercicio 3

mes = int(input("Digite un mes del Año entre 1 y 12 :"))
estacion = None
if mes >= 1 and mes <= 3:
    print("Estamos en Verano")
    estacion = "Verano"
elif mes > 3 and mes <= 6:
    print("Estamos en Otoño")
    estacion = "Otoño"
elif mes > 6 and mes <= 9:
    print("Estamos en Invierno")
    estacion = "Inverino"
elif mes > 9 and mes <=12:
    print("Estamos en Primavera")
    estacion = "Primavera"
else:
    print("La opcion indicada es incorrecta")
print(f"En el mes: {mes} la estacion del Año es: {estacion}")