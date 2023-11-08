//Ejercicio 1: Calcular estacion del año
//Ejercicio 2: Hora del dia, dependiendo la hora mostrar un mensaje que estoy haciend

function ejercicio1() {
  let estacionActual = "Verano";
  switch (estacionActual) {
    case "Verano":
    case "verano":
      console.log("Estas en verano");
      break;
    case "Invierno":
    case "invierno":
      console.log("Estas en invierno");
    case "Primavera":
    case "primavera":
      console.log("Estas en primavera");
      break;
    case "Otoño":
    case "otoño":
      console.log("Estas en otoño");
      break;
    default:
      console.log("No es una estacion del año");
      break;
  }
}
ejercicio1();

function ejercicio2() {
  let horaActual = 14;
  if (horaActual >= 6 && horaActual <= 12) {
    console.log("Buenos dias");
  } else if (horaActual >= 13 && horaActual <= 19) {
    console.log("Buenas tardes");
  } else if (horaActual >= 20 && horaActual <= 24) {
    console.log("Buenas noches");
  } else {
    console.log("Hora no valida");
  }
}
ejercicio2();
