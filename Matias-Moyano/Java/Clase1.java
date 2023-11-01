public class Clase1 {
    public static void main(String args[]) {
        var conteo = 0; // Inferencia de tipos

        while(conteo < 7){
            System.out.println("Conteo = " + conteo);
            conteo++;
        }
        var contador = 0;
        do{
            System.out.println("Contador = " + contador);
            contador++;
        }while(contador < 7); //necesario el punto y coma
        // Etiquetas label
        inicio:
        for(var i = 0; i < 7; i++){
            if(i % 2 != 0){
                System.out.println("i = " + i);
                break inicio; //rompe el ciclo
            }
        }
        for(var i = 0; i < 7; i++){
            if(i % 2 == 0){
                System.out.println("i = " + i);
                //break; //rompe el ciclo
                //continue; //salta a la siguiente iteracion
            }
            
        }
    }
}