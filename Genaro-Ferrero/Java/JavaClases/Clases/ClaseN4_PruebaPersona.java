public class ClaseN4_PruebaPersona {
public static void main(String[] args) {
    ClaseN4_Persona persona1 = new ClaseN4_Persona(); //  LLamamos al constructor
    persona1.nombre = "Genaro"; // El valor queda guardado como hexadecimal y es un objeto
    persona1.apellido = "Ferrero";
    persona1.obtenerInformacion();
    ClaseN4_Persona persona2 = new ClaseN4_Persona();
    persona2.nombre = "Matias";
    persona2.apellido= "Moyano";
    persona2.obtenerInformacion(); //  Cada objeto contiene su propia informacion solo comparten los atributos de la clase previamente cargada
}
}