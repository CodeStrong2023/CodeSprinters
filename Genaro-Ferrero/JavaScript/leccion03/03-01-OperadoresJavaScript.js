// Ejercicios par o impar
let parImpar = 10;
if(parImpar % 2 == 0){
    console.log("El un número Par");
}
else{
    console.log("El un número Inpar")
}

// Ejercicio Mayor de edad
let edad= 20,adulto =18;
if(edad>= adulto){
    console.log("Es una persona Mayor de edad")
}
else{
    console.log("Es una persona Menor de Edad")
}

// Ejercicios dentro de un rango
let dentroRango =5;
let valMin = 0, valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax){
    console.log( "Estra dentro del rango")
}
else{
    console.log("Esta fuera del rango ")
}

// Ejercicio Si el padre puede asistir al juego de su hijo
let vacaciones = false , diaDescanso =false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("Es padre no puede asistir al juego de su hijo")
}

// Ejercicio Operador ternario 
let resultado2 = 3 > 2 ? "Verdadero": "Falso";
console.log(resultado2)

let numero = 9;
resultado2 = numero % 2 == 0 ? "Es un número Par" : "Es un numero Impar ";
console.log(resultado2)

// Convertir String a Numero
let miNumero = "10";
console.log(miNumero)
let edad2= Number(miNumero);// Funcion de convertir de String a Numero

// Funcion isNan
if (isNaN(edad2)){
    console.log("Esta variable no contiene Números")
}
else{
    if(edad2 >= 18){
        console.log("Puede votar");
}
    else{
        console.log("No puede votar");
}
}

let resultado3 = edad2 >=18 ? "Puede votar" : "No puede votar";
console.log(resultado3)

