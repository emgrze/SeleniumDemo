package pl.testeroprogramowania.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
    public static WebDriver getDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
