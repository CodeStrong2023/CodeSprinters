// Ejercicio 1 : Calcular estaciòn del año
let mes = 4;
let estacion;

if (mes >= 1 && mes <= 3) {
    estacion = "Verano";
} else if (mes >= 4 && mes <= 6) {
    estacion = "Otoño";
} else if (mes >= 7 && mes <= 9) {
    estacion = "Invierno";
} else if (mes >= 10 && mes <= 12) {
    estacion = "Primavera";
} else {
    estacion = "Mes inválido";
}

console.log(`La estación del año para el mes ${mes} es ${estacion}.`);

// Ejercicio 2 : Hora del dìa

let horaDia = 9;
let mensaje;

if (horaDia >= 6 && horaDia <= 11) {
  mensaje = "Buenos días";
} else if (horaDia >= 12 && horaDia <= 16) {
  mensaje = "Buenas tardes";
} else if (horaDia >= 17 && horaDia <= 19) {
  mensaje = "Buenas tardes";
} else if (horaDia >= 20 && horaDia <= 23) {
  mensaje = "Buenas noches";
} else {
  mensaje = "Hora no válida";
}

console.log(mensaje);

// Escructura swich


switch (mes) {
    case 1:case 2:case 3:
        estacion = "Verano";
        break;
    case 4:case 5:case 6:
        estacion = "Otoño";
        break;
    case 7: case 8: case 9:
        estacion = "Invierno";
        break;
    case 10: case 11: case 12:
        estacion = "Primavera";
        break;
    default:
        estacion = "Mes inválido";
}

console.log(`La estación del año para el mes ${mes} es ${estacion}.`)