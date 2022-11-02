import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        // Obtener todas las variables del sistema
        Map<String, String> varEnv = System.getenv();
        System.out.println("variables de ambiente del sistema = " + varEnv);

        System.out.println("-------- Listando variables de entrono del sistema ---------");
        // keySet devuelve un set con el nombre de las llaves
        for (String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }
        // Obtener una variable en específico
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        // Se puede obtener la variable directamente del diccionario que obtuvimos al principio
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);
    }
}
