public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = 1000;
        Integer num2 = num1; // a num2 se le asigna el mismo objeto y espacio de memoria ocupado por num1

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Cuando se usa el == con objetos, se comparan las instancias de los objetos (si ocupan el mismo espacio de memoria)
        // Si se usa el == con tipos primitivos, si se compara el valor
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        // Aquí le pasamos el valor, ya no es la referencia a otro objeto
        // Por lo que ya no serían iguales en cuanto a referencia
        // Si el valor es 127 o menor, las comparaciones siempre se hacen por valor(java lo hace por defecto) y no por instancia del objeto
        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        // Con el equals() podemos comprar el valor de dos objetos, ya no se compara la instancia sino el valor directamente
        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));

        // Se puede convertir el objeto a tipo primitivo y así compararlos con == y saber si ambos valores son iguales
        // Al ser primitivos si se compara el valor
        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        // Cuando son operadores diferentes al ==, como por ejemplo >, <, >= u operaciones aritméticas
        // No es necesario la conversión a primitivo, ya que siempre realiza el outboxing
        // Es decir, no importa si es un objeto de tipo Integer, al usar estos operadores, java trata los valores y no las instancias
        num2 = 500;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        // Esta es una forma de hacerlo más explícito, pero java hace automáticamente la conversión por nosotros
        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
