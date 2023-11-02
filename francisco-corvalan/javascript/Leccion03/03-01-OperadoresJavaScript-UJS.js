// Ejercicio para encontrar numeros pares
let parImpar = 7;
if(parImpar % 2 == 0){
    console.log("Es un numero par");
}
else{
    console.log("Es un numero impar");
}

// Ejercicio es mayor de edad
let edad = 16, adulto =18;
if( edad >= adulto ){
    console.log("Es una persona mayor de edad");
}
else{
    console.log("Es una persona menor de edad");
}

// Ejercicio dentro de un rango
let dentroRango = 17; //Aqui vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if( dentroRango >= valMin && dentroRango <= valMax ){
    console.log('Esta dentro del rango establecido')
}
else{
    console.log('Esta fuera del rango establecido');
}
// Ejercicio : Si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if( vacaciones || diaDescanso ){
    console.log("El padre puede asister al juego de su hijo");
}
else{
    console.log("El padre no puede asistir al juego de su hijo");
}

// Operador Ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);
let numero = 12;
resultado2 = numero % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado2);

//Convertir String a Number
let miNumero = "21";
console.log(typeof miNumero);
let edad2 = Number(miNumero);
console.log(typeof edad2);
// Funcion isNaN
if(isNaN(edad2 >= 18)){
    console.log("Esta variable no contiene solo numeros");
}
else{
    if(edad2 >= 18){
        console.log("Puede votar")
    }
    else{
        console.log("No puede votar");
    }
    
}

let resultado3 = edad2 >= 18 ? "Puede votar" : "No puede votar";
console.log(resultado3);