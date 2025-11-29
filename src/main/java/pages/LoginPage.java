package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");

    public void login(String user, String pass) {
        type(username, user);
        type(password, pass);
        click(loginBtn);
    }
}
