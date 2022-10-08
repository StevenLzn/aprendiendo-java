public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java"; // String no es primitivo, es un objeto y se debe instanciar la clase
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el profesor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        // Al agregar el operador + con un String y un número, se concatena.
        // Como el string está de primero y las expresiones se evalúan de izquierda a derecha, lo primero que toma es el string y concatena lo que viene después
        System.out.println(detalle + numeroA + numeroB);

        // Los paréntesis nos permiten indicar preferencia. Esto quiere decir que resuelva primero el paréntesis y luego el resto.
        System.out.println(detalle + (numeroA + numeroB));

        // Al estar primero los ints, entonces lo primero que hace es la suma y luego concatena
        System.out.println(numeroA + numeroB + detalle);

        // concat() es un método para concatenar strings
        // Los strings son inmutables, concat devuelve otra instancia de string y no modifica el original
        // Se puede usar el método concat uno dentro de otro o uno después de otro
        // Es mejor usar concat que concatenar con el operador +
        // Con el operador + se crea una clase de string builder, entonces cada que se suma se crea una instancia de string builder
        String detalle2 = curso.concat(" con ".concat(profesor)).concat(" Hola mundo");
        System.out.println("detalle2 = " + detalle2);
    }
}
