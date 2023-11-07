package contextoEstatico;

public class PersonaPrueba {
    private int contadorPersonas;

    public static void main(String[] args) {
        Persona persona1 = new Persona("Matias");
        System.out.println("persona1: " + persona1);
        Persona persona2 = new Persona("Juan");
        System.out.println("persona2: " + persona2);
        Persona persona3 = new Persona("Pedro");
        System.out.println("persona3: " + persona3);
        imprimir(persona1);
        PersonaPrueba personaPrueba = new PersonaPrueba();
        //this.contadorPersonas = 10; //no se puede usar el this en un contexto estatico
        System.out.println("contadorPersonas: " + personaPrueba.getContadorPersonas());
    }
    public static void imprimir(Persona persona) {
        System.out.println("persona: " + persona);
    }

    public int getContadorPersonas() {
        imprimir(new Persona("Carlos"));
        return this.contadorPersonas;
    }
}
