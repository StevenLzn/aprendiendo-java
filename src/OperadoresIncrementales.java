public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        int i = 1;
        // Primero se incrementa y luego se asigna
        int j = ++i; // es igual que -> i = i + 1;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        // Primero se asigna y luego se incrementa
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Pre decremento
        i = 3;
        j = --i; // Es igual que i = i - 1 = 2;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        i = 4;
        System.out.println("inicial de i = " + i);
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j)); // Pre-incrementa a 5 e imprime 5
        System.out.println("j = " + (j++)); // Post incrementa a 6 pero en esta línea imprime 5 porque el incremento lo hace después
        System.out.println("j = " + j); // Aquí ya se tiene el post incremento, por lo que se imprime 6
    }
}
