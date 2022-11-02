import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Este es el formato con el que debe cumplir la fecha de entrada, es decir, la fecha de tipo string
        // Si no cumple con este formato, el método devuelve valores que no tienen sentido
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        // Se debe usar dentro de un try catch porque es posible que se ingrese una fecha con un formato erróneo y puede romper la aplicación
        try {
            // Con el método parse de la clase SimpleDateFormat, podemos convertir un string a un objeto de tipo Date(que cumpla con un formato específico)
            Date fecha = format.parse(sc.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);
            // Estas comparaciones sirven tanto para objeto tipo Date, como para tipo Calendar
            // after() sirve para comparar si una fecha es mayor a otra
            // En este caso compara si fecha es mayor a fecha2
            // retorna true o false, dependiendo del resultado de la evaluación
            if( fecha.after(fecha2) ){
                System.out.println("Fecha del usuario es mayor que la fecha actual");
                // before() sirve para comparar si una fecha es menor a otra
                // En este caso comprar si fecha es menor a fecha2
                // retorna true o false, dependiendo del resultado de la evaluación
            } else if( fecha.before(fecha2) ){
                System.out.println("Fecha del usuario es menor a la fecha actual");
                // equals() sirve para comparar si dos fechas son iguales
            } else if ( fecha.equals(fecha2) ) {
                System.out.println("Las fechas son iguales");
            }

            // compareTo() es un método de la clase Date para comparar fechas
            // Devuelve un int
            // Si lo que devuelve el método es mayor que 0, entonces fecha es mayor que fecha2
            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha del usuario es mayor que la fecha actual");
                // Si lo que devuelve el método es menor que 0, entonces la fecha es menor que fecha 2
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha del usuario es menor a la fecha actual");
                // Si lo que devuelve el método es igual a 0, entonces la fecha es igual a fecha2
            } else if (fecha.compareTo(fecha2) == 0 ) {
                System.out.println("Las fechas son iguales");
            }

        } catch (ParseException e) {
            // e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            //System.exit(1); // termina la aplicación, el código 1 es cuando se lanza una excepción
            main(args); // Se puede volver a ejecutar el main, para que arranque el programa desde 0
        }
    }
}
