public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        Boolean objBoolean = false; // Se empaqueta el primitivo en la clase automáticamente(autoboxing)
        Boolean objBoolean2 = Boolean.valueOf("false");

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        // La clase de tipo Boolean no se compara como las de tipo Integer
        // El boolean independiente si es primitivo o es objeto, se compara por valor y no por instancia.
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        // También se puede hacer uso de equals() y funciona de la misma manera
        System.out.println("Comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));

        // Podemos asignar un objeto de la clase Boolean, a un tipo de dato primitivo boolean
        // Así es de forma explícita
        // outboxing
        boolean primBoolean2 = objBoolean2.booleanValue();
        // O se puede hacer de forma implícita, sin necesidad de invocar el método para transformarlo a primitivo
        // Se hace automáticamente la conversión
        boolean primBoolean3 = objBoolean2;

        System.out.println("primBoolean2 = " + primBoolean2);
        System.out.println("primBoolean3 = " + primBoolean3);
    }
}
