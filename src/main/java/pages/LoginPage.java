package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private SelenideElement login = $(By.id("email"));
    private SelenideElement password = $(By.id("passwd"));
    private SelenideElement submitButton = $(By.id("SubmitLogin"));

    public void login(String login, String password) {
        this.login.sendKeys(login);
        this.password.sendKeys(password);
        submitButton.submit();
    }
}
