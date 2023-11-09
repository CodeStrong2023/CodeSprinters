// Evitar repertir el código
// Dry don´t repeat yourself

let day = 1;
switch (day) {
    case 1:
         console.log("Hoy es Lunes");
         break;
    case 2:
         console.log("Hoy es Martes");
         break;
    case 3:
         console.log("Hoy es Miercoles" );
         break;
    case 4:
         console.log("Hoy es Jueves");
         break;
    case 5:
         console.log("Hoy es Viernes");
         break;
    case 6:
         console.log("Hoy es Sabado");
         break;
    case 7:
         console.log("Hoy es Domingo");
         break;
    default:
         console.log("Error en ingresar el dia de la Semana ")
         break;
}
// Version mejorada 

let days = ["Lunes", "Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"]
function getDay(n){
    if ( n < 1 || n > 7 ) {
        throw new Error("Out of range");
    }
    return days[n-1];
}
console.log(getDay(5));
// Meses Extendido
let meses = 5;

switch (meses) {
    case 1:
        console.log("Este mes es Enero");
        break;
    case 2:
        console.log("Este mes es Febrero");
        break;
    case 3:
        console.log("Este mes es Marzo");
        break;
    case 4:
        console.log("Este mes es Abril");
        break;
    case 5:
        console.log("Este mes es Mayo");
        break;
    case 6:
        console.log("Este mes es Junio");
        break;
    case 7:
        console.log("Este mes es Julio");
        break;
    case 8:
        console.log("Este mes es Agosto");
        break;
    case 9:
        console.log("Este mes es Septiembre");
        break;
    case 10:
        console.log("Este mes es Octubre");
        break;
    case 11:
        console.log("Este mes es Noviembre");
        break;
    case 12:
        console.log("Este mes es Diciembre");
        break;
    default:
        console.log("Error al ingresar el número del mes");
        break;
}

// Version Reducida

let mes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];

function getMonthName(n) {
    if (n < 1 || n > 12) {
        throw new Error("Fuera de rango");
    }
    return mes[n - 1];
}

let mes1 = 5; 
console.log("Este mes es " + getMonthName(mes1));