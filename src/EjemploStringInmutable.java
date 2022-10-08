public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java"; // String no es primitivo, es un objeto y se debe instanciar la clase
        String profesor = "Andrés Guzmán";

        // No se altera el string curso, el concat retorna un nuevo objeto de tipo string
        curso.concat(profesor);
        System.out.println("curso = " + curso);

        // El nuevo string retornado se debe asignar a una variable string para luego poder utilizarlo
        String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado);

        // transform() permite modificar un string, recibiendo como parámetro una función anónima que haga la modificación y la retorne
        // El parámetro se conoce también como expresión lambda
        curso.transform( c -> {
            return c + " con " + profesor;
        });

        // transform() tampoco altera el string original, solo retorna un nuevo objeto con el nuevo valor
        System.out.println("curso = " + curso);

        String resultado2 = curso.transform( c -> {
            return c + " con " + profesor;
        });

        System.out.println("resultado2 = " + resultado2);

        // replace() cambia un carácter por otro en todas las coincidencias de la cadena
        resultado.replace("a", "A");
        // replace() tampoco altera el string original, tiene la misma funcionalidad que el resto de métodos
        System.out.println("resultado = " + resultado);

        // Se asigna el valor retornado en una nueva variable de tipo string para poder usarla
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);
    }
}
