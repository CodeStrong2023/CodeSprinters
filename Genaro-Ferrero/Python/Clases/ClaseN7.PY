def listarTerminos(**terminos):
    for llave, valor in terminos.items():
        print(f" {llave}:{valor}")
              
listarTerminos()
listarTerminos(PRUEBA= "Hola esto es un ",Diccionario="Diccionario")

# Lista para recibir elementos 
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombre2=["Genaro","Joel","Agustin"]
desplegarNombres(nombre2)
desplegarNombres("Pedro") # Este lo llama como cadena 
desplegarNombres((10,11)) # Debemos poner dos parentesis para que se transforme en una
# Tupla iterable
desplegarNombres([22,55]) # Tambien podemos ponerlos como listas

# Funciones Recursivas 
def factorial(numero):
    if numero == 1: 
        return 1
    else:
        return numero * factorial (numero-1) # Caso recursivo
resultado = factorial(5)
print((f"El factorial del número 5 es : {resultado}"))

# Tarea clase 7 

def factorial1(numero1):
    if numero1 == 1: 
        return 1
    else:
        return numero1 * factorial1 (numero1-1) # Caso recursivo
numeroFactorial = int(input("Digite un número: "))
resultado1 = factorial1(numeroFactorial)
print((f"El factorial del número {numeroFactorial} es : {resultado1}"))
