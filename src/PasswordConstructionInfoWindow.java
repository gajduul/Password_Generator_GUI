import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordConstructionInfoWindow extends JFrame implements ActionListener {
    JButton closeWindowButton;

    public PasswordConstructionInfoWindow() {
        Font mainStringFont = new Font("Arial", Font.BOLD, 30);
        Font secondStringFont = new Font("Arial", Font.PLAIN, 20);
        Font constructionFont = new Font("Arial", Font.PLAIN, 15);

        setSize(400, 300);
        setTitle("Password Generator");
        setResizable(false);
        setVisible(true);
        setLayout(null);


        JLabel mainStringLabel = new JLabel("Password Generator");
        mainStringLabel.setBounds(45, 15, 500, 50);
        mainStringLabel.setFont(mainStringFont);
        add(mainStringLabel);

        JLabel secondStringLabel = new JLabel("Password Construction:");
        secondStringLabel.setFont(secondStringFont);
        secondStringLabel.setBounds(85, 65, 300, 30);
        add(secondStringLabel);

        JLabel constructionInfoLabel = new JLabel("<html>-10 Letters Long<br> -Upper Case <br/-Lower Case <br>-Numbers <br>-Special Sings</html>");
        constructionInfoLabel.setFont(constructionFont);
        constructionInfoLabel.setBounds(130, 100, 300, 90);
        add(constructionInfoLabel);

        closeWindowButton = new JButton("Close Window");
        closeWindowButton.setBounds(120, 220, 130, 30);
        add(closeWindowButton);
        closeWindowButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == closeWindowButton)
            this.dispose();

    }
}
