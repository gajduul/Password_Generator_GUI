import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuWindow extends JFrame implements ActionListener {
    JButton generatePasswordButton, passwordConstructionButton, exitButton;

    public MenuWindow() {

        setSize(400, 300);
        setTitle("Password Generator");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);




        JLabel mainStringLabel = new JLabel("Password Generator");
        mainStringLabel.setBounds(45, 10, 300, 30);
        Font font = new Font("Arial", Font.BOLD, 30);
        mainStringLabel.setFont(font);
        add(mainStringLabel);


        generatePasswordButton = new JButton("Generate Password");
        generatePasswordButton.setBounds(115, 60, 150, 50);
        generatePasswordButton.setBackground(Color.white);
        add(generatePasswordButton);

        passwordConstructionButton = new JButton("Password Construction");
        passwordConstructionButton.setBounds(95, 120, 190, 50);
        passwordConstructionButton.setBackground(Color.white);
        add(passwordConstructionButton);


        exitButton = new JButton("Exit");
        exitButton.setBounds(90, 180, 200, 50);
        exitButton.setBackground(Color.white);
        add(exitButton);

        generatePasswordButton.addActionListener(this);
        passwordConstructionButton.addActionListener(this);
        exitButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == exitButton) {
            System.exit(0);
        } else if (source == generatePasswordButton) {
            new GeneratedPasswordWindow();
        } else if (source == passwordConstructionButton) {
            new PasswordConstructionInfoWindow();

        }
    }
}
