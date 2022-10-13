public class OperadoresRelacionales {
    public static void main(String[] args) {
        // Estos operadores de relaciones se usan para comparar valores de tipo primitivo
        // Lo operadores relacionales tienen prioridad. Es decir, primero se resuelven las comparaciones y luego se asignan los valores a las variables
        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;
        
        boolean b1 = i == j; // Operador de relación: Es igual que?
        System.out.println("b1 = " + b1);
        
        boolean b2 = !b1; // Operador de relación: Invierte el valor del boolean
        System.out.println("b2 = " + b2);

        boolean b3 = i != j; // Operador de relación: Es distinto que?
        System.out.println("b3 = " + b3);

        boolean b4 = m == true;
        System.out.println("b4 = " + b4);
        
        boolean b5 = m != true;
        System.out.println("b5 = " + b5);

        boolean b6 = i > j; // Operador de relación: Es mayor que?
        System.out.println("b6 = " + b6);
        
        boolean b7 = i < j; // Operador de relación: Es menor que?
        System.out.println("b7 = " + b7);

        boolean b8 = l >= k; // Operador de relación: Es mayor o igual que?
        System.out.println("b8 = " + b8);

        boolean b9 = l <= k; // Operador de relación: Es menor o igual que?
        System.out.println("b9 = " + b9);
    }
}
