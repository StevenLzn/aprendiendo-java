public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;

        int j = +i; // Es lo mismo que multiplicar por 1 positivo -> j = (1) * i = -5;
        System.out.println("j = " + j);

        int k = -i; // Es lo mismo que multiplicar por 1 negativo -> j = (-1) * i = 5;
        System.out.println("k = " + k);
        
        i = 6;
        j = +i;
        System.out.println("j = " + j);
        
        k = -1;
        System.out.println("k = " + k);
    }
}
