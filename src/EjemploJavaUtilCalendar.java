import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        // Calendar es una clase abstracta (no sé instancia con new)
        // El getInstance() por debajo llama el 'new' y crea el objeto por si solo
        Calendar calendario = Calendar.getInstance();

        // set() establece una fecha en específico en el calendario
        // En el calendario el mes siempre parte en 0. Enero = 0
        // La clase Calendar también tiene constantes para llamar el valor del mes que se requiere. Calendar.JANUARY = 0 = Enero
        // calendario.set(2022, Calendar.SEPTEMBER, 22, 0, 5, 11);

        // También se puede establecer parte por parte, primero el año
        // Como primer parámetro se pasa el campo que se va a establecer
        // Se puede pasar valores enteros (1, 2, 3, 4, etc)
        // O se puede usar las constantes estáticas de la clase Calendar, como por ejemplo Calendar.YEAR para indicar que se va a establecer el año
        // Y como segundo parámetro va el valor que se quiere establecer
        calendario.set(Calendar.YEAR, 2020);
        // Luego el mes
        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        // Luego el día
        calendario.set(Calendar.DAY_OF_MONTH, 2);
        // Luego la hora. HOUR_OF_DAY es horario militar de 00 hasta 23
        // calendario.set(Calendar.HOUR_OF_DAY, 21);
        // O también se puede usar simplemente HOUR, pero es horario de 0 a 12
        // Y se debe asignar el PM o el AM
        calendario.set(Calendar.HOUR, 7);
        // Para asignar el AM o PM al usar HOUR, se hace así con AM_PM de Calendar
        // Se pueden llamar las constantes estáticas de AM y PM para facilitar el uso
        calendario.set(Calendar.AM_PM, Calendar.PM);
        // Luego los minutos
        calendario.set(Calendar.MINUTE, 20);
        // Luego los segundos
        calendario.set(Calendar.SECOND, 11);
        // Luego milisegundos
        calendario.set(Calendar.MILLISECOND, 122);
        // El getTime() del Calendar, es como si se llamara una instancia de la clase Date(new Date())
        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = sf.format(fecha);
        System.out.println("fecha con formato = " + fechaConFormato);


    }
}
