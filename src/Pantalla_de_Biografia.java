import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Pantalla_de_Biografia extends JFrame{
    private JPanel panelbio;
    private JButton regresarButton;
    private JButton siguienteButton;


    public Pantalla_de_Biografia(){
        super("Pantalla de Biografia");
        setContentPane(panelbio);


        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla_login pantalla_login=new Pantalla_login();
                pantalla_login.Iniciar();
                dispose();

            }
        });
        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla_de_hobbies pantallahobbie = new Pantalla_de_hobbies();
                pantallahobbie.Iniciar();
                dispose();



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
