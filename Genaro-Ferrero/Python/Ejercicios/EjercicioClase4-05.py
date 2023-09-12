print("Ejercicio N°5")
print("Recorremos la lista de la seleccion argentina con for")
# Creamos la lista
seleccionArgentina = {
    10:{"Nombre":"Lionel Messi","Edad":35,"Altura":1.70,"Precio":"50 Millones", "Posicion": "Extremo Derecho"},
    11:{"Nombre": "Angel Dimaria","Edad":34,"Altura":1.80,"Precio":"12 Millones","Posicion":"Extremo Derecho"},
    21:{"Nombre": "Paulo Dybala","Edad":28,"Altura":1.77,"Precio":"35 Millones","Posicion":"Media Punta"},
    19:{"Nombre": "Nicolas Otamendi","Edad":34,"Altura":1.83,"Precio":"3.5 Millones","Posicion":"Defensa Central"},
    2:{"Nombre": "Franco Armani","Edad":35,"Altura":1.89,"Precio":"3.5 Millones","Posicion":"Arquero"},
    20:{"Nombre": "Julian Alvarez","Edad":23,"Altura":1.70,"Precio":"30 Millones","Posicion":"Delantero"},
    1:{"Nombre": "Damian Emiliano Martinez","Edad":31,"Altura":1.95,"Precio":"20 Millones","Posicion":"Arquero"},
    8:{"Nombre": "Enzo Fernandez","Edad":22,"Altura":1.78,"Precio":"25 Millones","Posicion":"Mediocampista"},
    29:{"Nombre": "Gonzalo Montiel","Edad":26,"Altura":1.79,"Precio":"10 Millones","Posicion":"Lateral Derecho"}
}
# Recorremos la lista
for i in seleccionArgentina:
    print(f"{i} : {seleccionArgentina[i]}")