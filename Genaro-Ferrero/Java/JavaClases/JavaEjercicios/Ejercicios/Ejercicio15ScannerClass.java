import java.util.Scanner;

public class Ejercicio15ScannerClass {
    public static void main(String[] args) {
        Scanner pedido = new Scanner(System.in);
        float num[] = new float[5];
        float neg=0 , pos =0 , mediaNeg, mediaPos;
        int conteo=0, conteoNeg = 0 , conteoPos=0;
        System.out.println("Guardamos los elementos del arreglo:");
        for(int i= 0 ; i<5 ; i++){
            System.out.println("Digite un número: ");
            num[i] = pedido.nextFloat();
            if (num[i]>0){
                pos += num[i];
                conteoPos++;
            }
            else if (num[i]<0){
                neg += num[i];
                conteoNeg++;
            }
            else{
                conteo++;
            }
        }
        if(conteoPos == 0){
            System.out.println("\n No se puede sacar la media de los números positivos");
        }
        else{
            mediaPos = pos/conteoPos;
            System.out.println("\n La media de positivos: "+mediaPos);
        }
         if(conteoNeg == 0){
            System.out.println("\n No se puede sacar la media de los números negativos");
        }
        else{
            mediaNeg = neg/conteoNeg;
            System.out.println("\n La media de positivos: "+mediaNeg);
        }
        System.out.println(" La cantidad de neutros es: "+conteo);
    }
}
