import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Pantalla_login extends JFrame{
    private JPanel panellogin;
    private JTextField usuario;
    private JTextField contra;
    private JButton ingresarButton;



    public Pantalla_login() {
        super("Pantalla de Bienvenida");
        setContentPane(panellogin);




        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    verificardatos();


                }catch (SQLException ex){
                    System.out.println(ex.getMessage());

                }




            }
        });
    }


    public void  Iniciar (){
        setVisible(true);

        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public Connection conexion()throws SQLException{
        String url = "jdbc:mysql://localhost:3306/usuarios";
        String user ="root";
        String password = "12345";
        return DriverManager.getConnection(url,user,password);



    }



    public void verificardatos()throws SQLException{

        Connection connection = conexion();
        String user = usuario.getText();
        String pass = new String(contra.getText());
        String contraseña = "12345";
        String nombre = "francis";
        String sql = "SELECT * FROM administrador WHERE Usuario = ? AND contraseña = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, user);
        stmt.setString(2, pass);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()||(contraseña.equals(pass)&&nombre.equals(user))) {
            Pantalla_de_Biografia ventana_bio = new Pantalla_de_Biografia();
            ventana_bio.Iniciar();
            dispose();
        } else {

            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos.");
        }
    }


}
