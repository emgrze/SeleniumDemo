package pl.testeroprogramowania.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pl.testeroprogramowania.utils.DriverFactory;

public class BaseTest {
    protected WebDriver driver; // przypisujemy drivera do zmiennej
    @BeforeMethod               //będziemy uruchamiać metodę setup przed każdą metodą w klasach testowych
    public void setup() {
        driver = DriverFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
