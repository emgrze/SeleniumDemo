package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class RegisterTest extends BaseTest {
    @Test
    public void registerUserTest() {
        int z = (int) (Math.random() *9000);
        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .registerUser("testdupa123" + z + "@lol.pl", "Testdupa123!@#").getDashboardLink();

//        Assert.assertTrue(dashboardLink.isDisplayed());
        Assert.assertEquals(dashboardLink.getText(),"Dashboard");
        System.out.println(z);
    }
}

//dobrą praktyką jest trzymanie asercji w testach, nie w page objectach
