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