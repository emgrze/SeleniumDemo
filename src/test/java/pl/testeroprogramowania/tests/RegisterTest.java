package pl.testeroprogramowania.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;
import pl.testeroprogramowania.pages.MyAccountPage;

public class RegisterTest extends BaseTest {
    @Test
    public void registerUserTest() {
        int z = (int) Math.random();
        WebElement entryTitle = new HomePage(driver).openMyAccountPage()
                .registerUser("testdupa123" + z + "@lol.pl", "Testdupa123!@#").getEntryTitle();

        Assert.assertTrue(entryTitle.isDisplayed());
        Assert.assertEquals(entryTitle.getText(),"My account");
    }
}

//dobrą praktyką jest trzymanie asercji w testach, nie w page objectach
