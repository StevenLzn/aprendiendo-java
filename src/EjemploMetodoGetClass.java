import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal!";

        // Con getClass() se obtiene la estructura interna de la clase
        
        Class strClass = texto.getClass();

        // Muestra el nombre de la clase (con el package)
        System.out.println("strClass.getName() = " + strClass.getName());

        // Muestra el nombre de la clase (sin el package)
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());

        // Muestra el nombre del package donde está la clase
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());

        System.out.println("strClass = " + strClass);

        // getMethods() retorna un array con los métodos de la clase
        for (Method metodo: strClass.getMethods()) {
            // con getName() se obtiene el nombre del método
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
        Integer num = 34;
        
        Class intClass = num.getClass();
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getPackage().getName() = " + intClass.getPackage().getName());

        // getSuperclass() retorna la clase padre. En este caso muestra la superclase de Integer que es Number
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        // También se puede encadenar. En este caso primero obtiene el padre de Integer que es Number y luego el padre de Number que es Object
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());

        // Así obtenemos la clase padre
        Class objClass = intClass.getSuperclass().getSuperclass();
        // Recorremos los métodos de la clase Object
        for (Method metodo: objClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
