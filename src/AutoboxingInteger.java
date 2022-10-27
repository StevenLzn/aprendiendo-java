public class AutoboxingInteger {
    public static void main(String[] args) {
        // Convierte automáticamente el tipo de dato primitivo al de la clase, en este caso la clase Integer
        Integer[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int suma = 0;

        for (Integer i: enteros) {
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }

        System.out.println("suma = " + suma);

        suma = 0;
        // Así se hace de forma implícita el outboxing. No es necesario usar en intValue()
        // Se hace la conversión a primitivo de forma automática
        for (Integer i: enteros) {
            if(i % 2 == 0){
                suma += i;
            }
        }

        System.out.println("suma = " + suma);
    }
}
