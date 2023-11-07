package Clase9;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Matias", 5000);
        System.out.println("empleado1: " + empleado1);
        empleado1.setNombre("Juan");
        System.out.println("empleado1: " + empleado1);
        empleado1.setGenero('F');
        System.out.println("empleado1: " + empleado1);
        empleado1.setEdad(25);
        System.out.println("empleado1: " + empleado1);
        empleado1.setDireccion("Calle 456");
        System.out.println("empleado1: " + empleado1);
        System.out.println("empleado1.getNombre(): " + empleado1.getNombre());
        System.out.println("empleado1.getGenero(): " + empleado1.getGenero());
        System.out.println("empleado1.getEdad(): " + empleado1.getEdad());
        System.out.println("empleado1.getDireccion(): " + empleado1.getDireccion());


        //Cliente
        Cliente cliente1 = new Cliente("Karla", 'F', 28, "Calle 123", new java.util.Date(), true);
        System.out.println("cliente1: " + cliente1);
        System.out.println("cliente1.getIdCliente(): " + cliente1.getIdCliente());
        System.out.println("cliente1.getFechaRegistro(): " + cliente1.getFechaRegistro());
        System.out.println("cliente1.isVip(): " + cliente1.isVip());
        System.out.println("cliente1.getNombre(): " + cliente1.getNombre());

        //Cliente2
        Cliente cliente2 = new Cliente(new java.util.Date(), false);
        System.out.println("cliente2: " + cliente2);
        System.out.println("cliente2.getIdCliente(): " + cliente2.getIdCliente());
        System.out.println("cliente2.getFechaRegistro(): " + cliente2.getFechaRegistro());
        System.out.println("cliente2.isVip(): " + cliente2.isVip());
    }
}
