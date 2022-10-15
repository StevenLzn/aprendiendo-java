public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;
        
        double promedio = (i + j + k) / 3d; // Se agrega la d al final para que lo tome como tipo double
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10;
        System.out.println("promedio = " + promedio);
        
        promedio = ++i + j-- + k / 3d * 10; // (15 + 8) + 6.6 * 10
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j); // El post decremento no se hace en la operación, pero si se hace luego
    }
}
