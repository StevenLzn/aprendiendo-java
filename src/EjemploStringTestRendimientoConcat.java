public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        // El stringBuilder es mutable, puede cambiar la propiedad original
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for( int i = 0; i < 100000; i++ ){
            //c = c.concat(a).concat(b).concat("\n"); // 500 iteraciones => se demoran 2ms, 1000 iteraciones => se demoran 3ms, 10000 iteraciones => se demoran 79ms, 100000 iteraciones => se demoran 4046ms -- Más óptimo que el operador + cuando son pocas iteraciones
            //c += a + b + "\n"; // 500 iteraciones => se demoran 11ms, 1000 iteraciones => se demoran 12ms, 10000 iteraciones => se demoran 50ms, 100000 iteraciones => se demoran 1492ms -- Más óptimo que el concat cuando crecen las iteraciones

            // el append sirve similar al concatenar, nos permite unir cadenas de String
            sb.append(a).append(b).append("\n"); // 500 iteraciones => se demoran 0ms, 1000 iteraciones => se demoran 0ms, 10000 iteraciones => se demoran 2ms, 100000 iteraciones => se demoran 10ms -- MÁS ÓPTIMO en todos los casos
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        // el toString() sirve para generar el string del stringBuilder
        System.out.println("sb.toString() = " + sb.toString());
    }
}
