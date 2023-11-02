// Ampliando el uso de var let y const
/*
Con var puedes reasignar en cualquier momento 
estte forma parte del ambito global
Un error es que se sreescriba
*/
var nombre ='Francisco';
nombre = 'Armando';
console.log(nombre);

function saludar(){
    var nombre = 'Lionel';
    console.log(nombre);
}
console.log(nombre);

if(true){
    var edad = 20;
    console.log(edad);
}
console.log(edad);

/* let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque, solo disponible dentro de llaves
o dentro de una funcion
*/
function saludar2(){
    let nombre2 = 'Francisco';
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 35;
    console.log(edad2);
}
//console.log(edad2);
/* 
const se utiliza para valores constantes que no pueden ser reasignados
*/
const fechaNacimiento = 2003;
console.log(fechaNacimiento);
//fechaNacimiento = 2006;
console.log(fechaNacimiento);
