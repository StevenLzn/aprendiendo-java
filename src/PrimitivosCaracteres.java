public class PrimitivosCaracteres {
    public static void main(String[] args) {
        // char trabaja también con la tabla de unicode
        // en windows se puede buscar en el buscador como mapa de caracteres
        // Cada sistema operativo tiene su tabla de unicode. En este ejemplo se usa el unicode del @ para windows
        char caracter = '\u0040'; // Para el char se debe usar comillas simples ''
        char decimal = 64; // De esta forma también se asigna el valor de @ a la variable char, esta forma se llama la forma decimal
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        
        char simbolo = '@'; // Se puede establecer el char con el valor directo
        System.out.println("simbolo = " + simbolo);

        var varCaracter = '\u0040'; // Cuando se pasa el valor como unicode, se infiere que es un char, pero si se pasa como decimal o valor directo, entonces lo pone como int o String respectivamente
        System.out.println("varCaracter = " + varCaracter);

        char espacio = '\u0020'; // Este es el unicode del espacio
        char retroceso = '\b'; // Este caracter sirve para borrar el caracter anterior(backspace)
        char tabulador = '\t'; // Este caracter realiza una tabulación
        char nuevaLinea = '\n'; // Este caracter realiza un salto de línea
        // System.lineSeparator() sirve para hacer un salto de línea con la clase System de java
        System.out.println("char corresponde en byte =" + retroceso + retroceso + nuevaLinea + Character.BYTES);
        System.out.println("char corresponde en bites = " + System.lineSeparator() + tabulador  + Character.SIZE);
        System.out.println("máximo valorpara char =" + espacio + Character.MAX_VALUE);
        System.out.println("mínimo valor para char = " + Character.MIN_VALUE);
    }
}
