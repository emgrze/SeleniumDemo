package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class LogInTest extends BaseTest {
    @Test
    public void logInTest() {
        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .logInValidData("testdupa1234@lol.pl", "Testdupa123!@#")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }
}


//dobrą praktyką jest trzymanie asercji w testach, nie w page objectach
