import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        LoginFormView loginView = new LoginFormView();
        RegistrationFormView registrationFormView = new RegistrationFormView();
        UserController controller = new UserController(users, registrationFormView, loginView);
        controller.showLoginForm();
    }
}