import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        // Se mete en un try catch por si no existe el archivo
        try {
            // Así se toma un archivo en una ruta en específico
            FileInputStream archivo = new FileInputStream("src/config.properties");

            // Así inicializamos nuevas properties, pero asignando las que ya existían con System.getProperties()
            Properties p = new Properties(System.getProperties());
            // load() sirve para cargar un archivo de configuraciones en las properties
            // Se le pasa el archivo que cargamos anteriormente y también se mete en un try catch por si hay un error al leer el contenido
            p.load(archivo);

            // Otra forma de establecer propiedades
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

            // Para actualizar directamente las propiedades del System, debemos usar el setProperties()
            // Y como parámetro pasarle el objeto de propiedades que construimos anteriormente
            System.setProperties(p);
            Properties ps = System.getProperties();
            // Así se obtiene una propiedad desde el objeto de properties
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            // Así se obtiene una propiedad directamente del System
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("otra"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            ps.list(System.out);
        } catch (Exception e) { // Exception abarca todos los tipos de excepciones
            System.err.println("no existe el archivo = " + e); // Mostrar un mensaje con estilo de error en la consola
            System.exit(1); // termina la aplicación, el código 1 es cuando se lanza una excepción
        }
    }
}
