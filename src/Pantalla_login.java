import javax.swing.*;
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
        super("pantalla de bienvenida");
        setContentPane(panellogin);




        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String contraseña1 = "123";
                String contraseña2 = "1234";
                String contraingresada = contra.getText();

                String nombres1 = "dal1";
                String nombres2 = "dal";
                String usuarioingresado = usuario.getText();

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_bd", "root", "root");


                    // Verifica si el usuario existe en la base de datos
                    String consulta = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND contrasena = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(consulta);
                    preparedStatement.setString(1, usuario.getText());
                    preparedStatement.setString(2, contra.getText()));
                    ResultSet resultSet = preparedStatement.executeQuery();


                }

                // Cierra los recursos
                resultSet.close();
                preparedStatement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();



                if ((contraseña1.equals(contraingresada) && nombres1.equals(usuarioingresado) ||(contraseña2.equals(contraingresada) && nombres2.equals(usuarioingresado)) )){
                    Pantalla_de_Biografia ventana_bio = new Pantalla_de_Biografia();
                    ventana_bio.Iniciar();
                    dispose(); //es para llamar el formulario y ver lo que tiene


                }else {
                    JOptionPane.showMessageDialog(null,"Intente otra vez");
                    contra.setText("");
                }


            }
        });
    }

    public void  Iniciar (){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
