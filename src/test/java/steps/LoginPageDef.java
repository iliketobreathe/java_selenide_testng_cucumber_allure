package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageDef {
    LoginPage loginPage = new LoginPage();

    @Test
    @Then("enter {string} and {string} and click Sign in button")
    public void login(String arg0, String arg1) {
        loginPage.login(arg0, arg1);
        Assert.assertEquals($(By.cssSelector("body > div:nth-child(2) > div > div > h3")).getText(), "Successfully Logged in...");
    }
}
