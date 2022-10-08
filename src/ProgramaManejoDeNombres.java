import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre 1");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese el nombre 2");
        String nombre2 = sc.nextLine();
        System.out.println("Ingrese el nombre 3");
        String nombre3 = sc.nextLine();

        String newName1 = nombre1.substring(1, 2).toUpperCase() + "." + nombre1.substring(nombre1.length() - 2);
        String newName2 = nombre2.substring(1, 2).toUpperCase() + "." + nombre2.substring(nombre2.length() - 2);
        String newName3 = nombre3.substring(1, 2).toUpperCase() + "." + nombre3.substring(nombre3.length() - 2);

        String finalString = newName1.concat("_").concat(newName2).concat("_").concat(newName3);

        System.out.println(finalString);
    }
}
