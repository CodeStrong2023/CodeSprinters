let x, y; // se puede declarar mas de una variable en una linea
(x = 10), (y = 20); // se puede inicializar mas de una variable en una linea
console.log(x, y);

let z = x + y;

//let 10 = 10; // no se puede declarar una variable que empiece con un numero
let _10 = 10; // se puede declarar una variable que empiece con un guion bajo
let $10 = 10; // se puede declarar una variable que empiece con un signo de dolar

//let let = 10; // no se puede declarar una variable con una palabra reservada

//Ejercicio para encontrar numeros pares
let numero = 0;
let numerosPares = [];

while (numero <= 100) {
  if (numero % 2 === 0) {
    numerosPares.push(numero);
  }
  numero++;
}
console.log(numerosPares);

// Ejercicio es mayor de edad

let edad = 18;
if (edad >= 18) {
  console.log("Es mayor de edad");
} else {
  console.log("Es menor de edad");
}
