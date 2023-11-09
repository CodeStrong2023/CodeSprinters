# Convertido de temperaturas 
# De Celcius a Farenheit
# y de Farenheit a Celcuis

# Funcion de Celsuis a Farenheit
def celsuisFahrenheit(celsius):
    return celsius * 9 / 5 +32

# Funcion de Fahreinheit a Celsius
def fahreinheitCelsuis(fahrenheit):
    return ( fahrenheit -32)* 5/9

# Pedimos las variabls y con las funciones damos el resultado
celsius = float(input("Digite el valor de grados Celsius: "))
resultado = celsuisFahrenheit(celsius)
print(f"{celsius} C a F : {resultado}")

fahrenheit = float(input("Digite el valor de grados Fahrenheit: "))
resultado = fahreinheitCelsuis(fahrenheit)
print(f"{fahrenheit} F a C : {resultado}")