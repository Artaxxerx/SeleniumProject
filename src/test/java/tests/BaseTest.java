package tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public abstract class BaseTest {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    public void setUp(){
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("Webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }


    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
