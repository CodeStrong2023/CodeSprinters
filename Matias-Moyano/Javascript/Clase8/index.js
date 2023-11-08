//Ejercicio dentro de un rango

let numero = 5;
let minimo = 0;
let maximo = 10;

if (numero >= minimo && numero <= maximo) {
  console.log("El numero esta dentro del rango");
} else {
  console.log("El numero esta fuera del rango");
}

//if (numero >= minimo && numero <= maximo) console.log("El numero esta dentro del rango");
//else console.log("El numero esta fuera del rango");

//hoy ya no se usar var, solo let y const

//let nombre = "Matias";
console.log(nombre);

const apellido = "Moyano";
//apellido = "Perez"; // no se puede reasignar una constante

/* Ampliando el uso de var let y const
var: se puede reasignar y redeclarar y es global
let: se puede reasignar pero no redeclarar y es local
const: no se puede reasignar ni redeclara
*/
var nombre = "Matias";
nombre = "Pablo";
console.log(nombre);

function saludar() {
  var nombre3 = "Juan";
  console.log(nombre);
}
//console.log(nombre3); // no se puede acceder a una variable local desde afuera de la funcion

if (true) {
  var edad = 25;
  console.log(nombre);
}
console.log(edad);

function saludar2() {
  let nombre2 = "Juan";
  console.log(nombre2);
}
//console.log(nombre2); // no se puede acceder a una variable local desde afuera de la funcion

const fecha = "10/10/2020";
//fecha = "11/10/2020"; // no se puede reasignar una constante
console.log(fecha);
