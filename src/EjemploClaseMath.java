public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5, 1.2); // Máximo entre dos números
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2); // Mínimo entre dos números
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); // Redondea hacia arriba
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5); // Redondea hacia abajo
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI); // redondea un decimal
        System.out.println("entero = " + entero);

        double exp = Math.exp(2); // constante e(2,71828...) elevada a la 2
        System.out.println("exp = " + exp);

        double log = Math.log(10); // Logaritmo natural, en este caso de 10
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3); // Potencia, en este caso 10 elevado a la 3
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5); // Raíz cuadrada, en este caso raíz cuadrada de 5
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57); // Transforma de radianes a grados, en este caso transforma 1.57 radianes a grados
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00); // Transforma de grados a radianes, en este caso transforma 90 grados a radianes
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes)); // las funciones trigonométricas reciben como parámetro el valor en radianes
        System.out.println("cos(90): " + Math.cos(radianes)); // las funciones trigonométricas reciben como parámetro el valor en radianes

        radianes = Math.toRadians(180.00);
        System.out.println("sin(180): " + Math.sin(radianes));
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("sin(0): " + Math.sin(radianes));
        System.out.println("cos(0): " + Math.cos(radianes));
    }
}
