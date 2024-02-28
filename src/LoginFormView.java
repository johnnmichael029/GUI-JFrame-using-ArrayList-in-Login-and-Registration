import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
public class LoginFormView{
    private final JLabel userNameLabel = new JLabel("Username: ");
    private final JLabel passwordLabel = new JLabel("Password: ");
    private final JTextField userNameField = new JTextField(20);
    private final JPasswordField passwordField = new JPasswordField(20);
    private final JButton jLoginButton = new JButton("Login");
    private final JButton jRegisterButton = new JButton("Register");
    private final JCheckBox jShowPassword = new JCheckBox("Show Password");
    JFrame loginFrame = new JFrame("Login Form");
    JPanel panel = new JPanel();
    public JCheckBox getShowPassword() {
        return jShowPassword;
    }
    public JButton getRegisterButton() {
        return jRegisterButton;
    }
    public JButton getLoginButton() {
        return jLoginButton;
    }
    public JTextField getUserNameField() {
        return userNameField;
    }
    public JPasswordField getPasswordField() {
        return passwordField;
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

        jShowPassword.setBounds(6, 80, 150, 25);
        panel.add(jShowPassword);

        jLoginButton.setBounds(10, 110, 100, 25);
        panel.add(jLoginButton);

        jRegisterButton.setBounds(166, 110, 100, 25);
        panel.add(jRegisterButton);
    }
    public void loginFrame(){
        loginFrame.setSize(300, 180);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.add(panel);
        panel.setLayout(null);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        addComponentsToPanel();
    }
}