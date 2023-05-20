package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class LogInTest extends BaseTest {
    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .logInValidData("testdupa123@lol.pl", "Testdupa123!@#").getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(),"Dashboard");
    }

    @Test
    public void logInWithInvalidPasswordTest() {
        WebElement error = new HomePage(driver).openMyAccountPage()
                .logInInvalidData("testdupa123@lol.pl", "Testdupa123!@#123").getError();


        Assert.assertTrue(error.isDisplayed());
        Assert.assertTrue(error.getText().contains("Incorrect username"),"Expected error text doesn't match");
    }
}




//dobrą praktyką jest trzymanie asercji w testach, nie w page objectach
