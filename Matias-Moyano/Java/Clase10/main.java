package Clase10;

public class main {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(1, 2);
        System.out.println("resultado = " + resultado);

        var resultado2 = Operaciones.sumar(1.0, 2.0);
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = Operaciones.sumar(1, 6L);
        System.out.println("resultado3 = " + resultado3);

        /* Uso de la palabra final 
         * Esta palabra tiene diferentes significados dependiendo donde 
         * se aplique:
         * 1) Variables: no se puede modificar el valor de la variable
         * 2) Metodos: no se puede sobreescribir el metodo
         * 3) Clases: no se puede heredar de la clase
         * Otras caracteristicas es que normalmente, cuando trabajamos con variables
         * se combina con el modificador de acceso estatico para convertir una variable
         * en constante, es decir que no se puede modificar su valor
         * el ejemplo de esto es la clase Math en la cual todos sus atributos
         * son de tipo static y final, es por esto que la variable PI es una constante
        */
        final var numero = 10;
        //numero = 11; //error: no se puede modificar el valor de una variable final
        System.out.println("numero = " + numero);

        final Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 = " + persona1.getNombre());
        

    }
}
