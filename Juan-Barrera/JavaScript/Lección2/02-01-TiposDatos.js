// Tipos de Datos en JavaScript
/*
La sintaxia en lo que es comentarios 
es muy similar a la de Java
realmente diriamos que es identica
*/
//Tipo Str
var nombre = "Juan"; 
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);
//Tipo Numérico
var numero = 3000; 
console.log(numero);

var objeto = {
    nombre : "Juan",
    apellido : "Barrera",
    telefono : "2604002378",
} 

console.log(typeof objeto);

//Tipo de dato Boolean
var bandera = true;
console.log(typeof bandera);

//Tipo de dato función
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this,apellido = apellido;
    }
}
console.log(typeof Persona);

//Tipo de dato undefined
var x;
x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ["Citroen","Audi","BMW","Ford"];
console.log(autos);
console.log(typeof autos);

var z = "";
console.log(typeof z); //Esto se refiere a que es una cadena vacia