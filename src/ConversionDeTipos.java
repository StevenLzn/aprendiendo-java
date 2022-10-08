public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroString = "50";
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println("numeroInt = " + numeroInt);
        
        String realString = "9865.43e-3"; // El string también se puede escribir con notación científica
        double realDouble = Double.parseDouble(realString);
        System.out.println("realDouble = " + realDouble);

        String logicoString = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoString);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        // Se transforma un entero a string
        String otroNumeroString = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroString = " + otroNumeroString);

        // Otra forma de transformar un entero a string, el valueOf() recibe varios tipos de datos
        otroNumeroString = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroString = " + otroNumeroString);

        double otroRealDouble = 12.3456e2;
        // Se transforma un double a string
        String otroRealString = Double.toString(otroRealDouble);
        System.out.println("otroRealString = " + otroRealString);

        // Otra forma de transformar un double a string, recibiendo otro tipo de dato
        otroRealString = String.valueOf(12.45555e3);
        System.out.println("otroRealString = " + otroRealString);

        int i = 33000;
        short s = (short) i; // Esto es un cast, quiere decir que forzamos la transformación a otro tipo de dato, en este caso a short
        // Puede haber perdida de información si el tipo de dato al que vamos a transformar soporta una cantidad inferior al tipo de dato original
        // En ese caso se pierden datos. Diferente si se hace al contrario, de uno menor se transforma a un tipo de dato que soporte una mayor cantidad, lo hace sin problema
        // Procurar que el dato al que vamos a convertir soporte la cantidad original para que no haya perdida de datos
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        float f = (float) i;
        System.out.println("f = " + f);
        
        char c = (char) i; // El char soporta el int porque los enteros representan los caracteres unicode
        System.out.println("c = " + c);
    }
}
