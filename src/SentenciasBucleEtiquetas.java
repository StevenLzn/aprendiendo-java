public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        // Así etiquetamos un bucle, en este caso el for tiene la etiqueta de 'bucle1'
        // Esta etiqueta 'bucle1' la podemos usar para lanzar un break o un continue para aplicarlo al bucle que necesitamos
        bucle1: for (int i = 0; i < 5; i++) {
            System.out.println();
            bucle2: for (int j = 0; j < 5; j++) {
                if( i == 2 ){
                    continue bucle1; // Así lanzamos el continue, pero para el bucle etiquetado como 'bucle1', que es el externo
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
        System.out.println("\n-------------------------------------------------------------------------------");
        etiqueta: for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if( i == 2 ){
                    break etiqueta; // Así lanzamos el break, pero para el bucle etiquetado como 'etiqueta', que es el externo
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        // Este etiquetado de bucle sirve para cualquier bucle: for, while, do-while

        bucle: for (int i = 1; i <= 7; i++) {
            int j = 1;
            while ( j <= 8 ){
                if( i == 6 || i == 7 ){
                    System.out.println("Día " + i + ": descanso de fin de semana" );
                    continue bucle; // Si no se pone la etiqueta, entonces aplica el continue al bucle interno
                }
                System.out.println("Día " + i + ", trabajando a las " + j + "hrs.");
                j++;
            }
        }
    }
}
