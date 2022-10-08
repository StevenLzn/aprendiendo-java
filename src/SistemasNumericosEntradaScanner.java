import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Instanciamos un objeto de la clase scanner, recibe como parámetro el input stream, en este caso con la propiedad in de System
        System.out.println("Ingrese un número entero");

        // Deja esperando la consola hasta que el usuario ingrese un valor, al ingresar un valor se obtiene la línea ingresada por el usuario en el terminal(tipo string) y se asigna a la variable
        // String numeroString = scanner.nextLine();

        int numeroDecimal = 0;
        try {
            // Así podemos obtener números directamente del terminal y asignarlos a variables de tipo int, sin necesidad de hacer conversiones con nextInt()
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroString);
        } catch ( Exception e ) { // La variable e, es de tipo de dato Exception. Exception es el tipo más genérico y todas las excepciones heredan del tipo Exception, por lo general se usa este tipo
            System.out.println("Error, debe ingresar un número entero");
            main(args); // Si hay error llama de nuevo el main y se reinicia el proceso desde 0
            System.exit(0); // Sirve para terminar la ejecución. Para que no ejecute las líneas de abajo. El parámetro indica el status, en este caso el status 0 es salida de forma exitosa, que todo salio bien
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        // Transforma un número a representación binaria
        String resultadoBinario = "número binario de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal);

        // Transforma un número a octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        // Transforma un número a hexadecimal
        String resultadoHexadecimal = "número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        System.out.println(mensaje);
    }
}
