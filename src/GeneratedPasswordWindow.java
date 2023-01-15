import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneratedPasswordWindow extends JFrame implements ActionListener {
    JButton copygeneratedPasswordButton,generatePasswordAgainButton,closeWindowButton;
    JLabel generatedPasswordLabel;
    Font mainStringFont = new Font("Arial", Font.BOLD,30);
    Font secondStringFont = new Font("Arial", Font.PLAIN,20);
    public GeneratedPasswordWindow(){
        setSize(400, 300);
        setTitle("Password Generator");
        setResizable(false);
        setVisible(true);
        setLayout(null);


        JLabel mainStringLabel = new JLabel("Password Generator");
        mainStringLabel.setBounds(45,15,500,50);

        mainStringLabel.setFont(mainStringFont);
        add(mainStringLabel);

        JLabel describeStringLabel = new JLabel("Your password is:");
        describeStringLabel.setBounds(110,85,500,50);
        describeStringLabel.setFont(secondStringFont);
        add(describeStringLabel);

        generatedPasswordLabel = new JLabel(Generator.generatePassword());
        generatedPasswordLabel.setBounds(60,150,500,50);
        generatedPasswordLabel.setFont(secondStringFont);
        add(generatedPasswordLabel);

        copygeneratedPasswordButton = new JButton("Copy Password");
        copygeneratedPasswordButton.setBounds(200,160,130,30);
        add(copygeneratedPasswordButton);

        generatePasswordAgainButton = new JButton("Generate again");
        generatePasswordAgainButton.setBounds(50,220,130,30);

        add(generatePasswordAgainButton);

        closeWindowButton = new JButton("Close Window");
        closeWindowButton.setBounds(200,220,130,30);
        add(closeWindowButton);

        closeWindowButton.addActionListener(this);
        copygeneratedPasswordButton.addActionListener(this);
        generatePasswordAgainButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == copygeneratedPasswordButton){
            String labelToCopy = generatedPasswordLabel.getText();
            StringSelection selection = new StringSelection(labelToCopy);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection,null);
        } else if (source == generatePasswordAgainButton) {
            generatedPasswordLabel.setText(Generator.generatePassword());
        } else if (source==closeWindowButton) {
            this.dispose();

        }
    }
}
