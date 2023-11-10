# Ejercicio 11: Agenda telefonica
# Hacer un programa que simule una agenda de contactos
# Imprimimos las opciones
agenda = {}
while True:
    print("\t Menú de opciones")
    print("1: Nuevo contacto")
    print("2: Borrar contacto")
    print("3: Ver contactos existentes")
    print("4: Salir")
    # Sin cerrar el While ingresamos las opciones
    opcion = int(input("Digite una opción de menú: "))
    # Digitamos que pasa si el usuario elige opcion 1
    if opcion ==1: 
        nombre = input("Digite el nombre de contacto: ")
        telefono = input("Digite el número de teléfono: ")
        if nombre not in agenda :
            agenda[nombre] = telefono
            print("Contacto agregado con exito")
        else:
            print("Este nombre de contacto ya existe")
    # Digitamos que pasa si el usuario elige opcion 2
    elif opcion == 2:
        nombre = input("Cual es el nombre del contacto: ")
        if nombre in agenda :
            del (agenda[nombre])
            print("Se ha eliminado el contacto requerido")
        else: 
            print("Este contacto no existe en la agenda")
    # Digitamos que pasa si el usuario elige opcion 3
    elif opcion == 3:
        print("Agenda de contactos")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Teléfono: {valor}")
    # Digitamos que pasa si el usuario elige opcion 4
    elif opcion == 4: 
        print("Gracias por ultilizar su agenda de contactos")
        break
    # Digitamos que pasa si el usuario se equivoca de opcion
    else: 
        print("Se equivoco de opción de menú")
    print()

