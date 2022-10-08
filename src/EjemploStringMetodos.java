public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Steven";

        // En los strings también sirve el .length() para medir el largo de la cadena.
        System.out.println("nombre.length() = " + nombre.length());

        // Método para pasar todo un string a mayúsculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // Método para pasar un string todo a minúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // Método para comparar dos strings por valor, compara el valor de ambos
        System.out.println("nombre.equals(\"Steven\") = " + nombre.equals("Steven"));
        // El equals() es sensible a las mayúsculas y minúsculas, si no coinciden así sea el mismo texto, retorna false
        System.out.println("nombre.equals(\"steven\") = " + nombre.equals("steven"));

        // Método para comprar strings por valor, ignorando las mayúsculas y minúsculas
        System.out.println("nombre.equalsIgnoreCase(\"steven\") = " + nombre.equalsIgnoreCase("steven"));

        // Otro método para comparar cadenas, este método retorna 0 si son exactamente iguales
        // La comparación es de forma lexicográfica
        System.out.println("nombre.compareTo(\"Steven\") = " + nombre.compareTo("Steven"));
        System.out.println("nombre.compareTo(\"Esteban\") = " + nombre.compareTo("Esteban"));

        // Método para obtener un char de un string, en un índice en específico
        System.out.println("nombre.charAt() = " + nombre.charAt(0));
        System.out.println("nombre.charAt() = " + nombre.charAt(3));
        System.out.println("nombre.charAt() = " + nombre.charAt(nombre.length() - 1)); // Con nombre.length() - 1 obtenemos el último caracter

        // Dividir un string desde un índice dado, si es solo un parámetro retorna el string desde la posición dada
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        // Si son dos parámetros, entonces el segundo indica hasta donde se quiere dividir sin incluir ese índice, en este ejemplo no se incluye el caracter en la posición 3
        System.out.println("nombre.substring(1) = " + nombre.substring(1, 3));
        System.out.println("nombre.substring(4, 6) = " + nombre.substring(4, 6)); // Se obtiene los dos últimos caracteres. Se pone 6 porque como no se incluye así mismo, entonces se llega hasta 5
        System.out.println("nombre.substring(nombre.length() - 1) = " + nombre.substring(nombre.length() - 1)); // Otra forma para obtener el último caracter

        String trabalenguas = "trabalenguas";

        // Método para reemplazar un caracter en toda la cadena, por otro en específico. En este ejemplo reemplaza todas las "a" por "."
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));

        // Método para saber si se encuentra un caracter dentro del string, retorna el índice de la primera coincidencia. Recibe como parámetro un caracter o un string(cadena de caracteres)
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('a'));
        // Por el contrario, este método retorna el índice de la última coincidencia
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        // Si no hay coincidencias retorna -1, o sea que el caracter o cadena no se encuentra en el string
        System.out.println("trabalenguas.indexOf(\"x\") = " + trabalenguas.indexOf("x"));

        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));
        // contains() busca un string dentro de otro string. Solo recibe un string, este método no recibe caracteres
        // Retorna true o false, si encuentra o no el string
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));

        // Método para saber sin un string comienza con alguna secuencia en específico. Recibe una secuencia de caracteres como parámetro.
        // Retorna true o false, si comienza o no comienza con el string pasado por parámetro
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));

        // Así mismo está el método endsWith(), que sirve para saber si un string termina con cierta secuencia e igualmente recibe una secuencia de caracteres como parámetro
        // También retorna true o false
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"traba\") = " + trabalenguas.endsWith("traba"));

        System.out.println("   trabalenguas  ");
        // trim() sirve para quitar todos los espacios en blanco al principio y al final del string
        System.out.println("  trabalenguas ".trim());
    }
}
