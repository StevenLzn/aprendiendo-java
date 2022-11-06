// El bytecode se genera automáticamente cuando se corre el programa
// Se puede generar manualmente ejecutando el comando "javac NombreArchivo.java" en la terminal, situándose en la carpeta donde está el archivo
// Este comando genera el bytecode
// Para ejecutar en terminal se usa el comando java NombreClase. En este caso va sin extensión, solo el nombre de la clase
// Cada que hay un cambio en el archivo, se debe compilar
public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if( args.length == 0 ){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1); // -1 es cuando ocurre un error
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento # " + i + ": " + args[i]);
        }
    }
}
