public class PrimitivosEnteros {
    public static void main(String[] args) {
        // Los primitivos tienen clases que las envuelven y prestan propiedades y métodos adicionales
        // Por ejemplo al primitivo byte lo envuelve la clase Byte, al primitivo short lo envuelve Short
        // Y por ejemplo al int lo envuelve Integer
        byte numeroByte = 70; // Soporta entre -128 y 127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 30000; // Soporta entre -32768 y 32767
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647; // Soporta entre -2147483648 y 2147483647
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        // Al número long se le agrega al final la letra L en mayúscula
        long numeroLong = 9223372036854775807L; // Soporta entre -9223372036854775808 y 9223372036854775807
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

        var numeroVar = 32767; // Si se asigna un número que no sobrepase la capacidad de int, entonces lo asigna por defecto. Si se pasa del límite, va a depender sin le ponemos L o F al final(long o float)


    }
}
