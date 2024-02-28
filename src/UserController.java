import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class UserController  {
    private final RegistrationFormView registrationView;
    private final LoginFormView loginFormView;
    private final ArrayList<User> arrayList;

    public UserController(ArrayList<User> users, RegistrationFormView registrationView, LoginFormView loginFormView){
        this.arrayList = users;
        this.registrationView = registrationView;
        this.loginFormView = loginFormView;

        registrationView.getRegisterButton().addActionListener(new ActionListener(){
            @Override
            // make an action on the register button
            public void actionPerformed(ActionEvent e){
                register();
            }
        });

        registrationView.getBackButton().addActionListener(new ActionListener(){
            // go back to the login form
            @Override
            public void actionPerformed(ActionEvent e) {
                registrationView.registrationFrame.setVisible(false);
                loginFormView.loginFrame();
            }
        });
        registrationView.getShowPassword().addActionListener(new ActionListener(){
            // show password
            @Override
            public void actionPerformed(ActionEvent e){
                if (registrationView.getShowPassword().isSelected()){
                    registrationView.getUserPasswordField().setEchoChar((char)0);
                    registrationView.getConfirmPasswordField().setEchoChar((char)0);
                }
                else{
                    registrationView.getUserPasswordField().setEchoChar('\u2022');
                    registrationView.getConfirmPasswordField().setEchoChar('\u2022');
                }
            }
        });
        loginFormView.getLoginButton().addActionListener(new ActionListener(){
            // make an action on the login button
            @Override
            public void actionPerformed(ActionEvent e){
                checkCredentials();

            }
        });

        loginFormView.getRegisterButton().addActionListener(new ActionListener(){
            // go to the registration form
            @Override
            public void actionPerformed(ActionEvent e){
                loginFormView.loginFrame.setVisible(false);
                registrationView.registrationFrame();
            }
        });
        loginFormView.getShowPassword().addActionListener(new ActionListener(){
                // show password
            @Override
            public void actionPerformed(ActionEvent e){
                if(loginFormView.getShowPassword().isSelected()){
                    loginFormView.getPasswordField().setEchoChar((char)0);
                } else{
                    loginFormView.getPasswordField().setEchoChar('\u2022');

                }
            }
        });
    }
    public void register(){
        // retrieve the user input from the registration form
        String username = registrationView.getUserNameField().getText();
        String password = registrationView.getUserPasswordField().getText();
        String confirmPassword = registrationView.getConfirmPasswordField().getText();

        // validation. check if the input are not empty
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            View.errorMessageInEmptyField();
        }
        // check if the password and confirm password are the same
        else if (!password.equals(confirmPassword)){
            View.errorMessageInPasswordMismatch();
        }
        else{
            // create a new user
            arrayList.add(new User(username, password));
            View.successMessageInRegistration();

            // clear the text fields after successful registration
            registrationView.getUserNameField().setText("");
            registrationView.getUserPasswordField().setText("");
            registrationView.getConfirmPasswordField().setText("");
            registrationView.registrationFrame.setVisible(false);
            loginFormView.loginFrame();
        }
    }
    public void checkCredentials(){
        // retrieve the user input from the login form
        String username = loginFormView.getUserNameField().getText();
        String password = loginFormView.getPasswordField().getText();

        // validation check if the input are not empty
        if (username.isEmpty() || password.isEmpty()){
            View.errorMessageInEmptyField();
            return;
        }
        // iterate through the array list to check if the user input is in the array list
        for (User user : arrayList){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                // if the user input is in the array list, show a success message

                View.successMessageInLogin();
                return;
            }
        }
        loginFormView.getPasswordField().setText("");
        View.errorMessageInInvalidCredentials();
    }
    public void showLoginForm(){
        loginFormView.loginFrame();
    }
}
