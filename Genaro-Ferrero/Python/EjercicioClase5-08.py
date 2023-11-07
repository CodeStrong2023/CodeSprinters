# Menu interactivo
saldo = 1000

while True:
    print("\t.:Menu:.")
    print("1: Ingresar dinero")
    print("2: Retirar dinero")
    print("3: Mostrar saldo")
    print("4: Salir")

    opcion = int(input("Digite una opción de menú: "))
    if opcion == 1:
        extra = float(input("Cuánto dinero desea ingresar: "))
        saldo += extra
        print(f"Saldo actual: {saldo}")
    elif opcion == 2:
        retirar = float(input("Cuánto dinero desea retirar: "))
        if retirar > saldo:
            print("Saldo insuficiente")
        else:
            saldo -= retirar
            print(f"Saldo actual: {saldo}")
    elif opcion == 3:
        print(f"Saldo actual: {saldo}")
    elif opcion == 4:
        print("Gracias por utilizar su cajero automático. ¡Hasta pronto!")
        break
    else:
        print("La opción ingresada no existe")