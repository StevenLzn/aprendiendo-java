public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String... que tal!";
        Number num = Integer.valueOf("7"); // 7;
        Number decimal = 45.54; // Si se le agrega la f al final, lo tomaría como tipo Float, sino lo toma como Double

        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object; // Object es la clase padre de todos los objetos en java
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer; // Al usar el genérico Object, podemos comparar con cualquier tipo de dato que no herede (Integer, Double, Boolean, etc)
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        b1 = num instanceof Long; // Al usar el genérico Object, podemos comparar con cualquier tipo de dato que no herede (Integer, Double, Boolean, etc)
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Double; // Al usar el genérico Object, podemos comparar con cualquier tipo de dato que no herede (Integer, Double, Boolean, etc)
        System.out.println("num es del tipo Double = " + b1);

        b1 = decimal instanceof Double; // Al usar el genérico Object, podemos comparar con cualquier tipo de dato que no herede (Integer, Double, Boolean, etc)
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float; // Al usar el genérico Object, podemos comparar con cualquier tipo de dato que no herede (Integer, Double, Boolean, etc)
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);
    }
}
