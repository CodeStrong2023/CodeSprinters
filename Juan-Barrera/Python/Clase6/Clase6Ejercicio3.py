# Ejercicio 3: Crear una funcion para sumar los valores recibidos de tipo numericos, utilizando argumentos variables *args como parametro de la funcion
# Y agregar como resultado la suma de todos los valor pasados como argumentos
# Definimos una funcion
def sumar_valor(*args): #Recibimos una cantidad de parametros indefinidos
    resultado = 0
    # Iteramos cada elemento
    for valor in args:
        resultado += valor
    return resultado
# Llamamos a la funcion
print(sumar_valor(3, 5, 9))
