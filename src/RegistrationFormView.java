import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class RegistrationFormView {
    final JFrame registrationFrame = new JFrame("Registration Form");
    private final JPanel panel = new JPanel();
    private final JTextField userNameField = new JTextField(20);
    private final JPasswordField passwordField = new JPasswordField(20);
    private final JPasswordField confirmPasswordField = new JPasswordField(20);
    private final JButton registerButton = new JButton("Register");
    private final JButton jBackButton = new JButton("Back");
    private final JCheckBox jShowPassword = new JCheckBox("Show Password");
    JLabel userNameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel confirmPasswordLabel = new JLabel("Confirm Pass:");
    public JCheckBox getShowPassword() {
        return jShowPassword;
    }
    public JButton getRegisterButton() {
        return registerButton;
    }
    public JButton getBackButton() {
        return jBackButton;
    }
    public JPasswordField getConfirmPasswordField() {
        return confirmPasswordField;
    }
    public JPasswordField getUserPasswordField() {
        return passwordField;
    }
    public JTextField getUserNameField() {
        return userNameField;
    }

    public void addComponentsToPanel() {

        userNameLabel.setBounds(10, 20, 80, 25);
        panel.add(userNameLabel);

        userNameField.setBounds(100, 20, 165, 25);
        panel.add(userNameField);

        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        confirmPasswordLabel.setBounds(10, 80, 80, 25);
        panel.add(confirmPasswordLabel);

        confirmPasswordField.setBounds(100, 80, 165, 25);
        panel.add(confirmPasswordField);

        jShowPassword.setBounds(6, 110, 150, 25);
        panel.add(jShowPassword);

        registerButton.setBounds(10, 140, 100, 25);
        panel.add(registerButton);

        jBackButton.setBounds(166, 140, 100, 25);
        panel.add(jBackButton);
    }
    public void registrationFrame(){
        registrationFrame.setSize(300, 210);
        registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registrationFrame.add(panel);
        panel.setLayout(null);
        registrationFrame.setLocationRelativeTo(null);
        registrationFrame.setVisible(true);
        addComponentsToPanel();
    }
}
