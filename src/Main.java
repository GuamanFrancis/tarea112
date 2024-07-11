import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/usuarios";
        String user="root";
        String password="12345";

        try (Connection connection= DriverManager.getConnection(url,user,password)){
            System.out.println("Conectado a la base de datos");
            String query="select * from administrador";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println(resultSet.getString("Contraseña"));
            }
        }
        catch (SQLException e){
            System.out.println("hola");
            System.out.println(e.getMessage());
        }



       // Pantalla_login ingreso = new Pantalla_login();
       // ingreso.Iniciar();


    }


}