
package test;


public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3];
        System.out.println("edades = " + edades);
        // Como modificarlos
        edades[0] =17;
        System.out.println("edades 0 = " + edades[0]);
        edades[1] = 21;
        System.out.println("edades 1 = " + edades[1]);
        edades[2] = 18;
        System.out.println("edades 2 = " + edades[2]);
     //   edades[3] = 7;// Error en tiempo de ejecución
        for (int i = 0 ; i < edades.length; i++){
            System.out.println("Edad "+i+": "+edades[i]);
        }
    }
}
