public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        // En el and si se encuentra una expresión que da false, no sigue evaluando el resto de expresiones
        boolean b1 = i == j && k < l;
        System.out.println("b1 = " + b1);

        // En el or si encuentra una expresión en true, no sigue evaluando el resto de expresiones
        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        // Las expresiones se evalúan de izquierda a derecha
        // El paréntesis específica prioridad para que se ejecute antes de
        boolean b3 = i == j && (k > j || m == false);
        System.out.println("b3 = " + b3);

        // En los operadores lógicos, el AND tiene prioridad en el orden 
        // Es decir, primero evalúa el AND y luego el OR
        // Es buena práctica poner paréntesis para especificar prioridad en las operaciones o comparaciones
        boolean b4 = i == j || k < l && m == true;
        System.out.println("b4 = " + b4);

        // Ejemplo explícito donde se muestra que evalúa primero el AND
        boolean b5 = true || true && false;
        System.out.println("b5 = " + b5);

        // Ejemplo explícito donde se muestra que evalúa primero el AND
        boolean b6 = true || false && false || false;
        System.out.println("b6 = " + b6);

        // Con los paréntesis especificamos otra prioridad en las comparaciones
        // Primero se evalúa el true || false, luego ese resultado lo compara con el && false
        // Y por último lo compara con el || false
        boolean b7 = ((true || false) && false) || false;
        System.out.println("b7 = " + b7);

    }
}
