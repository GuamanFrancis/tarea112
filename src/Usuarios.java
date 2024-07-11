import java.sql.*;

public class Usuarios {

    public static void main(String[] args) {
        Connection con;
        PreparedStatement pst;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root", "12345");
            pst = con.prepareStatement("insert into student values(?,?,?)");

            // Aquí falta parte del código

            System.out.println("Éxito");

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Excepción");
            ex.printStackTrace();
        }
    }
}
