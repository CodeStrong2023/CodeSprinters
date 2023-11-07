/*
Uso de la palabra final 
Esta palabra tiene diferentes significados
se aplique:
    varible:Evita cambiar valores que almacena la variable
    metodos : Evita que se modifique la deficion o el comportamiento de un metodo
desde una subclase hija 
    clases; Evita que se creen clases hijas
Opras caractericticas: Cuando trabajamos con variables se conbica con el modificador
de acceso estatico para convertir una variable en una constante.
*/
package test;

import domain.Persona;
import static domain.Persona.CONSTANTE_AQUI;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 40561976;
        System.out.println("miDni = " + miDni);
       // miDni = 123124124; no se puede cambiar
         System.out.println("Constante "+ CONSTANTE_AQUI);
         
         final Persona persona1 = new Persona();
        // persona1 = new Persona(); No se puede asignar una nueva referencia
        persona1.setNombre("Genaro");
        System.out.println("Persona1= " + persona1.getNombre());
        persona1.setNombre("Matias");
        System.out.println("Persona1= " + persona1.getNombre());
        // Osea que se pueden modificar los valores modificados al objeto
    }
}
