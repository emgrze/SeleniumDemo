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
                .registerUserValidData("testdupa123" + z + "@lol.pl", "Testdupa123!@#"+z).getDashboardLink();

//        Assert.assertTrue(dashboardLink.isDisplayed());
        Assert.assertEquals(dashboardLink.getText(),"Dashboard");
        System.out.println(z);
    }

    @Test
    public void registerUserWithSameEmailTest() {
        WebElement error = new HomePage(driver).openMyAccountPage()
                .registerUserInvalidData("testdupa123@lol.pl", "Testdupa123!@#").getError();


        Assert.assertTrue(error.isDisplayed());
        Assert.assertTrue(error.getText().contains("An account is"));
    }
}




//dobrą praktyką jest trzymanie asercji w testach, nie w page objectach
