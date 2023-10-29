
package test;

// Importo clase dominio
import dominio.TareaPersona;

public class PruebaTarea {
    public static void main(String[] args) {
      // Creamos el primero objeto 
      TareaPersona atributo = new TareaPersona("Genaro",86,1.80);
      // Imprimimos 
      System.out.println("Primer Objeto- " + atributo);
      // Modificamos sus valores 
      atributo.setNombre("Joel");
      atributo.setPeso(95);
      atributo.setAltura(1.95);
      // Imprimimos el objeto modificado
        System.out.println("Objeto Modificado-"+ atributo);
    }
}
