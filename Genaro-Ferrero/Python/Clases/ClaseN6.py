def mi_funcion():
    print("Nueva funcion")

def show(name,lastName):
    print(name+" "+lastName)
person =["Genaro","Ferrero"]
show(person[0],person[1])
show(*person)
person2 = ("Matias","Moyano")
show(*person2)
person3 = {"LastName":"Rodriguez", "Name": "Florecia"}
show(*person3)

numbers = [1,2,3,4,5]
for n in numbers:
    print(n)
    if n ==3:
        break # Para que no se ejecute el else 
else: 
    print("Esto se termino")

# Lista de  comprencion 
names = [ "Ferrero","Genaro", " Enzo","Juan"]
alongP= [ p for p in names if p[0] == "P"]
print(alongP)

bottlec =[{"name": "Quilmes", "Country": "Arg"},
          {"name": "Corona", "Country": "Mx"},
          {"name": "Stella Artois","Country":"Belgium"}
          ]
Arg = [b for b in bottlec if b["Country"]== "Arg"]
print(Arg)
print(bottlec)

def mi_funcion2(name,lastname):
    print("Saludo a todos los que ven a través del canal del YouTube")
    print(f"Nombre: {name},Apellido: {lastname}")
mi_funcion2("Jorge","Lucero")
mi_funcion2("Genaro","Ferrero")
mi_funcion2("Pepe","Hongito")

#La palabra return en funciones
def sumar(a,b):
    return a + b 
resultado = sumar (78,22)
# print(f"El resultado de la suma es : {resultado}")
print(f"El resultado de la suma es : {sumar(55,45)}")

def sumar2(a: int = 0,b:int = 0):
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma :{sumar2(22,66)}")

#Argumento, variables en funciones
def listarNombres(*nombres):
    for nombre in nombres:
        print(nombre)
listarNombres("Lucas","Gemaro","Joel","Martita","Mario","Leonardo")
listarNombres("Marcos","Romina","Daniel")
