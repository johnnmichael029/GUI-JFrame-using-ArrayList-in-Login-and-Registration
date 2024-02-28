import javax.swing.JOptionPane;

public class View {
    public static void errorMessageInEmptyField(){
        JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public static void errorMessageInPasswordMismatch(){
        JOptionPane.showMessageDialog(null, "Password and Confirm Password do not match", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public static void errorMessageInInvalidCredentials(){
        JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public static void successMessageInRegistration(){
        JOptionPane.showMessageDialog(null, "Registration Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void successMessageInLogin(){
        JOptionPane.showMessageDialog(null, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
