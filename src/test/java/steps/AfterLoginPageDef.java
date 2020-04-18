package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class AfterLoginPageDef {
    BasePage basePage = new BasePage();

    @Test
    @Then("click on Guru99 image to open homepage")
    public void clickOnGuruImageToOpenHomepage() {
        basePage.click("body > div:nth-child(2) > div > div > a > img");
        Assert.assertEquals($(By.cssSelector("#g-showcase > div > div > div > div > div > div > h1")).getText(), "Tutorials Library");
    }
}
