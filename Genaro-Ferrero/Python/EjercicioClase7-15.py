# Ejercicio 4 : Calcular inmpuestos de iva
# El archivo debe calcular el iba 

# Creamos la funcion
def PagoTotal(pagoSinImpuesto,impuesto):
    pago_total = pagoSinImpuesto + pagoSinImpuesto * (impuesto/100)
    return pago_total

# Ejecutamos la función
pagoSinImpuesto = float(input("Digite el valor del pago: "))
impuesto = float(input("Digite el monto del impuesto: "))
pagoConImpuesto = PagoTotal(pagoSinImpuesto, impuesto)
print(f"El pago con impuesto es: {pagoConImpuesto}")