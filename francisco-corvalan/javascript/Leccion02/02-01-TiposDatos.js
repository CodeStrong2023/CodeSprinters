// Tipos de Datos en javascript
/*
La sintaxis en lo que es comentarios es muy parecida a java
*/

var nombre = 'Francisco';  //Tipo str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
var numero = 3000; //Tipo numerico
console.log(numero);
nombre = 12.3;
console.log(typeof nombre);
var objeto = {
    Nombre: "Francisco",
    Apellido: "Corvalan",
    Telefono: "2604587901" 

}
console.log(objeto);

//Tipo de dato boolean
var bandera = true;
console.log(bandera);

//tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
	constructor(nombre,apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
}
console.log(typeof Persona)

//Tipo de dato undefined
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

//nul: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y); 

// Tipo de dato array y Empty String
var autos = ['Citroen', 'Audi', 'BMW', 'Ford'];
console.log(autos);
console.log(typeof autos);

var z = " ";
console.log(z); //ESto se refiere a que es una cadena vacia:
console.log(typeof z);