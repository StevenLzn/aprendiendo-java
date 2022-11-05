import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "rojo", "amarillo", "verde", "blanco", "negro"};
        // Número aleatorio entre 0 y 1, pero se excluye el 1
        double random = Math.random();
        System.out.println("random = " + random);
        
        // Número aleatorio entre 0 y el tamaño del array que es 6, pero sin incluir el número 6
        // Ya que en índices el array va de 0 a 5
        random *= colores.length;
        System.out.println("random = " + random);

        // Se redondea hacia abajo porque para arriba puede llegar al 6 y ese índice no existe
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores[(int)random] = " + colores[(int)random]);

        Random randomObj = new Random(); // Es más flexible, da más variedad para generar números enteros o decimales aleatorios
        // Devuelve un número random entre las posibilidades de capacidad del tipo de dato int, es decir 2 a la 32. Esto es cuando no se envía ningún parámetro
        // Como parámetro puede recibir un número que será el límite, por ejemplo en este caso genera un número aleatorio del 0 a l 7 sin incluir el 7(no incluye el valor que se pasa como parámetro)
        // Para poner un valor mínimo se debe sumar el resultado y restar el parámetro con ese mismo número, en este caso el aleatorio lo genera entre 15 y 25
        int randomInt = 15 + randomObj.nextInt(25-15);

        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length); // Mismo ejemplo de arriba pero con la clase Random
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
