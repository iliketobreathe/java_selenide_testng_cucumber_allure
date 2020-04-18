package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public void click(String cssSelector) {
        $(By.cssSelector(cssSelector)).click();
    }
}
