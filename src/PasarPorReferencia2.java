class Persona {
    private String nombre;

    public void modificarNombre( String nuevoNombre ) {
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        // Las clases personalizadas que creamos, se pasan por referencia
        // Es decir, si un método recibe un objeto y lo modifica internamente
        // Lo que hace es modificar directamente el objeto que está en memoria
        // Entonces donde sea que usemos el objeto va a estar con el valor actualizado
        // Esto mismo aplica para los arrays
        Persona persona = new Persona();
        persona.modificarNombre("Steven");

        System.out.println("iniciamos el método main");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("antes de llamar el método test");
        test(persona);
        System.out.println("después de llamar el método test");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        System.out.println("finaliza el método main con los datos de la persona modificados");
    }

    public static void test(Persona persona){
        System.out.println("iniciamos el método test");
        persona.modificarNombre("Pepito");
        System.out.println("finaliza el método test ");
    }
}
