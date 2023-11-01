class Aritmetica:
    """
    El nombre de este tipo de comentario es DocString
    En esta clase vamos a hacer algunas operaciones"
    """
    def __init__(self,operandoA,operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    
    # Metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB
    
    # Metodo para restar
    def resta(self):
        return self.operandoA - self.operandoB
    
    #Metodo para multiplicar
    def multiplicacion(self):
        return self.operandoA * self.operandoB
    
    # Metodo para dividir
    def division(self):
        return self.operandoA / self.operandoB
    
aritmetica1 = Aritmetica(7,9)
print(aritmetica1.sumar()) 
print(f"La resta: {aritmetica1.resta()}")
print(f"La multiplicacion: {aritmetica1.multiplicacion()}")
print(f"La division: {aritmetica1.division():.2f}")
  
    
