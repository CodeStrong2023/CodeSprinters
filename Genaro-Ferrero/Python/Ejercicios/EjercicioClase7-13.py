# Ejercicio 2 de funciones 
# Crear una funcion para multiplicar los valores recibidos
# de tipo númerico, utizando argumentos variables 

# Definimos la función para multiplicar
def multiplicar(*numeros):
    resultado = 1 
    for numero in numeros:
        resultado*= numero
    return resultado

# Llamamos a la funcion 
print(multiplicar(3,5,14))