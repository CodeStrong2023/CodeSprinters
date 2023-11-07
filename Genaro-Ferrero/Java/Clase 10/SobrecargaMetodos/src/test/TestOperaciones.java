
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resutado = Operaciones.sumar(7, 9);
        System.out.println("Resutado = " + resutado);
        
        var resultado2 = Operaciones.sumar(12.1, 10.5);
        System.out.println("Resultado = " + resultado2);
        
        var resultado3 = Operaciones.sumar(8,6L);
        System.out.println("Resultado = " + resultado3);
    }
    
}
