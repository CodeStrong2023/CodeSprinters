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

//Ejercicio Calcular estacion del año
let mes = 7
let estacion;
if(mes ==1 || mes ==2 || mes ==12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes ==5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes ==8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes ==11){
    estacion = "Primavera";
}
else{
    estacion = "INCORRECTO"
}
console.log("El valor corresponde a la estacion de: "+estacion);

// Ejercicio Hora del dia
let horaDia = 17;
let mensaje;
if(horaDia >= 7 && horaDia <= 10){
    mensaje = "Hora del desayuno";
}
else if(horaDia >= 11 && horaDia <= 14){
    mensaje = "Hora del almuerzo";
}
else if(horaDia >= 15 && horaDia <= 19){
    mensaje = "Hora de Merendar";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Hora de la cena";
}
console.log(mensaje);

// Estructura Switch(la sintaxis es igual a java)
switch(mes){
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estacion de: "+estacion);