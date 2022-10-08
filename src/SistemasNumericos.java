import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null,  "Ingrese un número entero");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch ( NumberFormatException e ) { // La variable e, es de tipo de dato NumberFormatException. La variable puede llamarse como quiera, pero que tenga sentido(e, error, etc)
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args); // Si hay error llama de nuevo el main y se reinicia el proceso desde 0
            System.exit(0); // Sirve para terminar la ejecución. Para que no ejecute las líneas de abajo. El parámetro indica el status, en este caso el status 0 es salida de forma exitosa, que todo salio bien
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        // Transforma un número a representación binaria
        String resultadoBinario = "número binario de " + numeroDecimal + " = " +Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100; // Para que java lo reconozca como un número binario, se antepone 0b
        System.out.println("numeroBinario = " + numeroBinario); // Se imprime el valor final del binario

        // Transforma un número a octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764; // Para que java lo reconozca como un número octal, se antepone el 0
        System.out.println("numeroOctal = " + numeroOctal);

        // Transforma un número a hexadecimal
        String resultadoHexadecimal = "número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);
        int numerHex = 0x1f4; // Para que java lo reconozca como un número hexadecimal, se antepone el 0x
        System.out.println("numerHex = " + numerHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
