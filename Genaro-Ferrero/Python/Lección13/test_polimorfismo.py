from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    # print(objeto)  # De manera indirecta llama al str
    print(type(objeto))  # Esto se hace para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if(isinstance(objeto, Gerente)):
         print(objeto.departamento)


empleado = Empleado("Ariel ", 500000)
imprimir_detalles(empleado)

gerente = Gerente("Genaro", 1500000, "Sistemas")
imprimir_detalles(gerente)
