package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class YandexPage extends BasePage {
    public YandexPage() {
        super();
    }

    @FindBy(xpath = ".//input[@role='combobox']")
    private WebElement yandexIsDisplayed;


    public void isYandexDisplayed(String url) {
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        new WebDriverWait(driver, Duration.ofSeconds(10));
        String yandexIsDisplayed = driver.getWindowHandle();
        yandexIsDisplayed.equals(url);
    }
}
