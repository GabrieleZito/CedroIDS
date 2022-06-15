package Autenticazione;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{

    String titolo = "Login";
    int width = 1280;
    int heigth = 720;
    private JTextField username;
    private JPasswordField password;
    private JLabel errore = new JLabel();
    private JButton accedi;
    public LoginForm(){
        this.setTitle(titolo);
        this.setSize(width, heigth);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initItems();
        this.setVisible(true);
    }

    private void initItems(){
        Container container = this.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        //Logo
        JLabel logo = new JLabel("ETICHETTA");
        logo.setBackground(Color.BLACK);
        logo.setOpaque(true);

        panel.add(logo);

        //Input Username e password
        JLabel usernamelbl = new JLabel("Username:");
        username = new JTextField(20);
        usernamelbl.setBounds(500, 300, 100, 20);
        username.setBounds(570, 300, 150, 20);

        JLabel passwordlbl = new JLabel("Password: ");
        password = new JPasswordField(20);
        passwordlbl.setBounds(500, 330, 100, 20);
        password.setBounds(570, 330, 150, 20);

        //Bottone Accedi
        accedi = new JButton("Accedi");
        accedi.setBackground(Color.LIGHT_GRAY);
        accedi.setOpaque(true);
        accedi.setBounds(570, 360,100,30);

        errore.setText("Username o Password ERRATI");
        errore.setForeground(Color.red);
        errore.setBounds(520, 280, 200, 20);
        errore.setVisible(false);

        panel.add(errore);
        panel.add(usernamelbl);
        panel.add(username);
        panel.add(password);
        panel.add(passwordlbl);
        panel.add(accedi);
        container.add(panel);
    }

    public JButton getAccedi(){return accedi;}
    public JLabel getErrore(){return errore;}
    public JTextField getUsername(){return username;}
    public JTextField getPassword(){return password;}


}
