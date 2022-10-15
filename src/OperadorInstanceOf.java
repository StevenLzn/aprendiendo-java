public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String... que tal!";

        // Objeto Integer, provee varios métodos para hacer operaciones
        Integer num = 7;

        Double decimal = 45.54;

        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object; // Object es la clase padre de todos los objetos en java
        System.out.println("texto es del tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number; // Integer hereda de la clase Number (Number es padre de Integer)
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        b1 = decimal instanceof Number; // Double también hereda de la clase Number, Integer y Double son clases hermanas
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);
    }
}
