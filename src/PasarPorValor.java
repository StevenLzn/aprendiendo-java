public class PasarPorValor {
    public static void main(String[] args) {

        // Toda variable primitiva siempre se pasa por valor
        // Las clases Integer, Double, Long, etc, son inmutables, por lo que tampoco cambiaría el objeto original
        Integer i = 10;

        System.out.println("iniciamos el método main con i = " + i);

        test(i);

        // No cambia el valor porque el primitivo no se cambia por referencia
        // Llega y cambia por valor
        // Y las clases de tipo Integer, Double, etc son inmutables, siempre retorna una instancia nueva(no se usa la misma que se pasa como parámetro)
        System.out.println("finaliza el método main con el valor de i = " + i);
    }

    public static void test(Integer i){
        System.out.println("iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("finaliza el método test con i = " + i);
    }
}
