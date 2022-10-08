public class HelloWorld {
    public static void main(String[] args){

        String saludar = "Hola mundo desde Java";
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero = 11;
        boolean valor = true;

        if(valor){
            // Se puede usar variables de un scope superior
            System.out.println("numero = " + numero);

            // Las variables de este scope no se puede llamar igual a una de un scope superior
            // Por ejemplo si se trata de declarar una variable que se llame 'numero' nos saca error
            int numeroDos = 20;

            // Las variables de un scope solo se pueden usar dentro de el y no por fuera
            System.out.println("numeroDos = " + numeroDos);
        }

        // El var hace que una variable sea de tipo de dato dinámico, se le puede asignar un int, string, boolean, etc
        var numeroTres = "15";

        String nombre; // Se puede definir sin dar un valor
        nombre = "Andres"; // Luego se le puede asignar un valor

        if(numero > 10) {
           nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);
        // Comentario 1 línea
        /*
        * Comentario bloque
        */
    }
}