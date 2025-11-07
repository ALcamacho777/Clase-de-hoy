import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Test::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Formulario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(6, 6, 6, 6);
        c.anchor = GridBagConstraints.WEST;

        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JButton submitButton = new JButton("Enviar");
        submitButton.addActionListener(e -> {
            String nombre = nameField.getText().trim();
            String email = emailField.getText().trim();
            JOptionPane.showMessageDialog(frame,
                    "Nombre: " + nombre + "\nEmail: " + email,
                    "Datos enviados",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        c.gridx = 0; c.gridy = 0;
        panel.add(nameLabel, c);
        c.gridx = 1; c.gridy = 0;
        panel.add(nameField, c);

        c.gridx = 0; c.gridy = 1;
        panel.add(emailLabel, c);
        c.gridx = 1; c.gridy = 1;
        panel.add(emailField, c);

        c.gridx = 0; c.gridy = 2; c.gridwidth = 2; c.anchor = GridBagConstraints.CENTER;
        panel.add(submitButton, c);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}