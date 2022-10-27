public class PasarPorReferencia {
    public static void main(String[] args) {

        // Los arrays si se pasan por referencia
        // Es decir que pueden ser modificados desde un método, solamente pasándolo como parámetro
        // El método que lo recibe como parámetro, modifica directamente el array que está en memoria
        int[] edades = {10, 11, 12};

        System.out.println("iniciamos el método main");
        for (int edad: edades) {
            System.out.println("edad = " + edad);
        }
        System.out.println("antes de llamar el método test");
        test(edades);
        System.out.println("después de llamar el método test");

        for (int edad: edades) {
            System.out.println("edad = " + edad);
        }

        System.out.println("finaliza el método main con los datos del arreglo modificados");
    }

    public static void test(int[] edadesArray){
        System.out.println("iniciamos el método test");
        for (int i = 0; i < edadesArray.length; i++) {
            edadesArray[i] += 20;
        }
        System.out.println("finaliza el método test ");
    }
}
