public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if( esNulo ) {
          curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        // isEmpty() también sirve para validar si un string está vacío, retorna true o false
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        // isBlank() es más estricto que isEmpty(), con isBlank() se valida que no sea null, no esté vacío, no sea solamente espacios en blanco.
        // Esta es la forma más segura y estricta de validar un string;
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        // Se valida que no esté vacío porque al concatenar o usar un método en un string vacío, retorna el mismo string vacío
        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }


        //System.out.println(curso.toUpperCase()); // Cuando usamos un método en un null, nos tira el error NullPointerException

    }
}
