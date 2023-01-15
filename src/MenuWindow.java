import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuWindow extends JFrame implements ActionListener {
    JButton generatePasswordButton, passwordConstructionButton, exitButton;
    public MenuWindow() {

        setSize(700, 400);
        setTitle("Password Generator");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        JLabel mainStringLabel = new JLabel("Password Generator");
        mainStringLabel.setBounds(90,30,500,100);
        Font font = new Font("Arial", Font.BOLD,50);
        mainStringLabel.setFont(font);
        add(mainStringLabel);


        generatePasswordButton = new JButton("Generate Password");
        generatePasswordButton.setBounds(35,150,300,100);
        add(generatePasswordButton);

        passwordConstructionButton = new JButton("Password Construction Info");
        passwordConstructionButton.setBounds(345,150,300,100);
        add(passwordConstructionButton);


        exitButton = new JButton("Exit");
        exitButton.setBounds(90,270,500,80);
        add(exitButton);

        generatePasswordButton.addActionListener(this);
        passwordConstructionButton.addActionListener(this);
        exitButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == exitButton){
            System.exit(0);
        }
        else if (source == generatePasswordButton) {
            new GeneratedPasswordWindow();
        } else if (source == passwordConstructionButton ) {
            new PasswordConstructionInfoWindow();

        }
    }
}
