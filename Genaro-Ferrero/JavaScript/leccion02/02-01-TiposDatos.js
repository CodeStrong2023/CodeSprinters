// Tipos de Datos en Java Script
/*
La sintaxis en los comentarios es similar a  la sintaxis de java
*/

// Tipo String -"Str"
var nombre = "Gena";
console.log(typeof nombre);
nombre = 7; // Las variables en JavaScripts son dinamicas
console.log(typeof nombre);
nombre = 12.3; 
console.log(typeof nombre); // Una variable tipo float es igual a una variable tipo numerica en JavaScripts

// Tipo Numérico
var numero = 3000;
console.log(numero);

// Tipo objeto 
var objeto = {
    nombre: "Enzo",
    apellido: "Ferrero",
    telefono: "2604679904"
};
console.log(objeto);

// Tipo Booleano (Bandera)
var Bandera = true;
console.log(Bandera);

// Tipo de dato funcion
function mifuncion(){}
console.log(typeof mifuncion);

// Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

// Tipo de dato clase (Es una funcion)
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona)

// Tipo de dato undefined
var x = undefined;
console.log(typeof x);

// null: ausencia de valor
var y = null; // no tiene tipo de dato..pero su origen es object 
console.log(typeof y);

// Tipo de dato array y Empy String
var autos = ["Citroen","audi","ferraro","bmw"]
console.log(autos);
console.log(typeof autos)