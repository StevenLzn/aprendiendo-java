public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        // Con toCharArray() convertimos un string a Array, donde cada char es un elemento del array
        // Se imprime el hash del array, es necesario un for para imprimir los elementos
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();

        // Con los array es .length como atributo y en los string es .length() como método
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }

        // con split() se divide un string por medio de un patrón que se pasa como parámetro
        // En este ejemplo separamos el string cada que se encuentra una letra "a"
        // La "a" es el patrón separador
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        for(int j = 0; j < arreglo2.length; j++){
            System.out.println("arreglo2[" + j + "] = " + arreglo2[j]);
        }

        String archivo = "alguna.imagen.jpg";
        // Se separa el string por el patrón '.'
        // Se debe escapar porque el . es un caracter reservado de las expresiones regulares
        // También se puede agregar entre corchetes: [.]
        String[] archivoArray = archivo.split("\\.");
        for(int j = 0; j < archivoArray.length; j++){
            System.out.println("archivoArray[" + j + "] = " + archivoArray[j]);
        }

        System.out.println("extensión = " + archivoArray[archivoArray.length - 1]);
    }
}
