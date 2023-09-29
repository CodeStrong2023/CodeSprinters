/* Variables dinamicas */

let nombre = "Matias";
console.log(typeof nombre);
console.log(nombre);

nombre = 25;
console.log(typeof nombre);
console.log(nombre);

nombre = true; 
console.log(typeof nombre);

nombre = null;
console.log(typeof nombre);

//Boleanos
let bandera = true;
console.log(bandera)
console.log(typeof bandera)

//Funciones
function sumar(a, b) {
    return a + b;
}
const sumar2 = (a, b) => {
    return a + b;
}
console.log(sumar(1, 2));
console.log(typeof sumar);
console.log(typeof sumar2);
//symbol
let simbolo = Symbol("Mi simbolo");
console.log(simbolo);
console.log(typeof simbolo);

