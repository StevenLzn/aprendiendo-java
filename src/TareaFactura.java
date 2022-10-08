import java.util.Scanner;

public class TareaFactura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura");
        String description = scanner.nextLine();

        System.out.println("Ingrese el primer valor");
        Double priceOne = scanner.nextDouble();

        System.out.println("Ingrese el segundo valor");
        Double priceTwo = scanner.nextDouble();

        Double total = (priceOne + priceTwo );
        Double impuesto = total * 0.19;
        Double totalImpuesto = total + impuesto;

        System.out.println("La factura "+ description + " tiene un total bruto de " + total +", con un impuesto de " + impuesto +" y el monto después de impuesto es de " + totalImpuesto);
    }
}
