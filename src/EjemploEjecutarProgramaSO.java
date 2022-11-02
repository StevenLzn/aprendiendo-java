public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        String[] comandos = {"notepad"}; // Ahora se debe pasar un array al exec(). El array contiene el nombre o nombres de programas
        // El Runtime permite ejecutar aplicaciones
        Runtime rt = Runtime.getRuntime();
        // Cuando se ejecuta un programa retorna un objeto de tipo Process
        Process proceso;

        try {
            // Se consulta el sistema operativo en el que se está corriendo el programa
            // Es buena práctica comparar los textos en minúscula
            // Convertir el que se recibe a minúscula y compararlo con el texto en minúscula
            if( System.getProperty("os.name").toLowerCase().startsWith("windows") ){ // Windows
                // exec() es el método que ejecuta el programa
                proceso = rt.exec(comandos);
            } else if(System.getProperty("os.name").toLowerCase().startsWith("mac")) { // Mac
                proceso = rt.exec("textedit"); // textedit es un programa de mac
            } else if( System.getProperty("os.name").toLowerCase().contains("nux") ||
                       System.getProperty("os.name").toLowerCase().contains("nix")) { // nux y nix es para linux
                proceso = rt.exec("gedit"); // gedit es un programa de linux
            } else {
                proceso = rt.exec("gedit"); // gedit es un programa de linux
            }
            proceso.waitFor(); // waitFor espera a que finalice el programa que se ejecutó, para seguir el proceso del programa java.
        } catch (Exception e){
            System.err.println("El comando es desconocido " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
