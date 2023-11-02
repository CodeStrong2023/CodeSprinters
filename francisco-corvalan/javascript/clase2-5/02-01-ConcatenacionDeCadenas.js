var nombre = 'Francisco';
var apellido = 'Corvalan';
var nombreCompleto = nombre+' '+apellido; // Primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = 'Facundo'+' '+'Roncaglia'; // Segunda concatenacion
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);

nombre += apellido; //Tercera concatenacio usando el operador simplificado
console.log(nombre);