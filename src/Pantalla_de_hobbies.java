import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla_de_hobbies extends JFrame{


    private JPanel pantallahobbie;
    private JButton botonderegresar;
    private JLabel imagen;

    public Pantalla_de_hobbies() {
        super("Pantalla de hobbie");
        setContentPane(pantallahobbie);

        botonderegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla_de_Biografia pantallaDeBiografia = new Pantalla_de_Biografia();
                pantallaDeBiografia.Iniciar();
                dispose();

            }
        });






    }

    public void  Iniciar (){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }



}
