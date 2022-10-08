public class PrimitivosFloat {

    // En las propiedades de la clase no es necesario inicializar, java pone el valor por defecto, por ejemplo para los decimales es 0.0
    static float varFlotante;


    public static void main(String[] args) {
        // Se debe agregar al final la letra F para indicar que el número corresponde al tipo de dato float
        // Se puede escribir con notación científica
        float realFloat = 0.00000000015F; // 1.5e-10F;
        // Número decimal que están entre 1.4E-45 y 3.4028235E38
        System.out.println("realFloat = " + realFloat); // Se convierte el entero a float(le agrega la parte decimal)
        System.out.println("float corresponde en byte a =" + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38; // No es necesario ponerle al final la letra d, ya que por defecto cuando el número tiene punto, lo toma como double
        // Número decimal que comprenden entre 4.9E-324 y 1.7976931348623157E308 - tiene más capacidad que float el exponente llega hasta 308 mientras que en float llega a 38
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a =" + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

        // var varFlotante = 3.1416; // Al tener punto se infiere que es un double, si se quiere especificar que es un float, se pone f al final

        // float varFlotante; // Cuando la variable es local en el main, se debe inicializar con un valor, porque no aplica el valor por defecto
        System.out.println("varFlotante = " + varFlotante);
    }
}
