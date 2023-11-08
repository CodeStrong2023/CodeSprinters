//ejercicio si el padre puede asistir al partido de su hijo

let vacaciones = false;
let diaDescanso = true;

if (vacaciones || diaDescanso) {
  console.log("El padre puede asistir al partido");
} else {
  console.log("El padre no puede asistir al partido");
}

//operador ternario
let resultado =
  vacaciones || diaDescanso
    ? "El padre puede asistir al partido"
    : "El padre no puede asistir al partido";

//convertir de string a numero
let numero = "10";
console.log(typeof numero);
numero = Number(numero);
console.log(typeof numero);

//funcion isNaN
console.log(isNaN(numero));
console.log(isNaN("Matias"));
