public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if( args.length != 3){
            System.err.println("Por favor ingresar una operación (suma, resta, multiplicacion o division) y dos enteros");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = 0, b = 0;
        double resultado = 0.00;

        try{
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            System.err.println("Cuidado a y b deben ser enteros, vuelve a intentar!");
            System.exit(-1);
        }

        switch (operacion){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "division":
                if( b == 0 ){
                    System.err.println("No se puede dividir por 0");
                    System.exit(-1);
                }
                resultado = (double) a / b; // Se debe convertir uno de los dos valores en un tipo de dato decimal para que el resultado sea decimal
                break;
            default:
                resultado = a + b;
        }

        System.out.println("Resultado de la operacion '" + operacion + "' es: " + resultado);
    }
}
