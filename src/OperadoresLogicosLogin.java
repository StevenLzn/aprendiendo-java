import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "steven";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "123456";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/

        String[] usernames = { "steven", "admin", "pepe" }; // Forma resumida para inicializar los valores de un array
        String[] passwords = { "1234", "12345", "123456" };

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String usuarioIngresado = sc.nextLine();

        System.out.println("Ingrese el password");
        String passwordIngresado = sc.nextLine();

        boolean esAutenticado = false;

        for( int i = 0; i < usernames.length; i++ ){
            // Ejemplo con ternario
            // No se puede usar el break, por lo que recorre todos los elementos del array
            // No es recomendable usarlo para recorrer muchos elementos, si son muchos elementos, usar la forma comentada que está abajo de este código
            esAutenticado = (usernames[i].equals(usuarioIngresado) && passwords[i].equals(passwordIngresado)) ? true : esAutenticado;

            /*boolean usernameCorrecto = usernames[i].equals(usuarioIngresado);
            boolean passwordCorrecto = passwords[i].equals(passwordIngresado);
            esAutenticado = usernameCorrecto && passwordCorrecto;

            if( esAutenticado ) break;*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(usuarioIngresado).concat("!") :
                "Username o password incorrecto! \nLo sentimos, requiere autenticación";
        System.out.println(mensaje);
        /*if( esAutenticado ) {
            System.out.println("Bienvenido usuario ".concat(usuarioIngresado).concat("!"));
        } else {
            System.out.println("Username o password incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }*/
    }
}
