import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma =  i + j; // Forma de declarar varias variables de un mismo tipo en una misma línea

        System.out.println("suma = " + suma);

        // Se da prioridad a la suma, encerrando en paréntesis la operación
        // Si no se da prioridad al tener un string, lo que hace java es tomar el signo + como operador de concatenación y no de suma
        System.out.println("i + j = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicación = " + multi);

        int div = i / j;
        // Para que tome la parte decimal se debe asignar a un tipo float o double
        // Y también se deben castear los enteros a float
        float div2 = (float) i / j;
        // La división da un número decimal, pero al ser la propiedad de tipo int, entonces solo toma la parte entera
        System.out.println("división = " + div);
        System.out.println("div2 = " + div2);

        // Resto de la división
        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}
