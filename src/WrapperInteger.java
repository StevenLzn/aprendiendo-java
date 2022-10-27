public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32770;
        // Convertimos el primitivo a uno objeto de la clase Integer
        Integer intObjeto = Integer.valueOf(intPrimitivo); // Es mejor práctica usar Integer.valueOf(), que usar el new Integer(). Al hacerlo con valueOf estamos haciendo un 'boxing'
        Integer intObjeto2 = intPrimitivo; // Esta forma también es válida y se le denomina 'auto-boxing'

        // Convertimos un objeto de la clase Integer a primitivo
        int num = intObjeto; // Es lo mismo que la forma de abajo. Por detrás hace el mismo proceso
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); // Así se hace de forma explicita
        System.out.println("num2 = " + num2);
        
        String valorTvLcd = "670000";
        Integer valor = Integer.valueOf(valorTvLcd); // Así se puede convertir un string a entero
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue(); // Se convierte un int a short. Tener cuidado, si el tipo de dato tiene menor capacidad que el original, puede haber perdida de datos si se pasa ese límite
        // Por ejemplo en este caso el int a convertir, sobrepasa la capacidad del short, entonces no se asigna el valor real
        System.out.println("shortObjeto = " + shortObjeto);

        // Así se convierte un int a tipo byte, también hay que tener cuidado de no pasar los límites
        // Ver el ejemplo del short donde se explica porque
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        // Así se convierte un int a long
        // En este caso no presenta el mismo problema de capacidad porque el nuevo tipo de dato tiene una capacidad mayor que el tipo original
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
