public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; // String no es primitivo, es un objeto y se debe instanciar la clase
        String curso2 = new String("Programación Java"); // Otra forma de instancia una clase de tipo string
        // Al ser dos objetos que apuntan a un espacio de memoria diferente, la igualdad retorna false pese a que tienen el mismo texto
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        // Para comparar valores de strings lo recomendable es usar equals() o equalsIgnoreCase()
        esIgual = curso.equals(curso2); // Forma correcta de comparar dos strings, para saber si tienen el mismo valor. Compara valor
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "programación java";
        esIgual = curso.equalsIgnoreCase(curso3); // Compara valores omitiendo mayúsculas y minúsculas
        System.out.println("curso.equalsIgnoreCase(curso3) = " + esIgual);

        // Cuando se crea un objeto string con un valor de un objeto que ya existe, no crea uno nuevo sino que reutiliza el que ya existe. Asigna la referencia del objeto que existe a esta nueva variable
        // Esto funciona cuando se asigna el valor directamente y no cuando se usa el new String()
        String curso4 = "Programación Java";
        esIgual = curso == curso4;
        System.out.println("curso == curso4 = " + esIgual);
    }
}
