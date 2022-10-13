public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Operador de asignación combinado +=
        i += 2;  // es igual que -> i = i + 2;
        System.out.println("i = " + i);

        i += 5; // es igual que -> i = i + 5;
        System.out.println("i = " + i);
        
        j -= 4; // es igual que -> j = j - 4;
        System.out.println("j = " + j);

        j *= 3; // es igual que -> j = j * 3;
        System.out.println("j = " + j);

        String sqlString = "SELECT * FROM clientes AS c";
        // El operador combinado también sirve para concatenar strings
        sqlString += " WHERE c.nombre='Steven'";
        sqlString += " AND c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
