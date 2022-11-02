import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        // Documentation https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        // username que tenemos en el sistema operativo
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        // Path carpeta de usuario
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        // Path espacio de trabajo (donde estamos parados actualmente)
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        // Obtener versión de java
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaV = " + javaVersion);

        // Se obtiene el carácter de salto de línea del sistema
        String lineSeparator = System.getProperty("line.separator");
        //Es lo mismo que
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator " + lineSeparator + "Una línea nueva...");
        System.out.println("lineSeparator " + lineSeparator2 + "Una línea nueva...");

        // Listar todas las propiedades del sistema
        Properties p = System.getProperties();
        // list() lista las propiedades
        p.list(System.out);
    }
}
