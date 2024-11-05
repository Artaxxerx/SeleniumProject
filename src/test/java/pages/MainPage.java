package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MainPage extends BasePage {


    public MainPage() {
        super();
    }

    @FindBy(css = "#accordion__heading-0")
    private WebElement accordionElement;

    @FindBy(xpath = ".//p[contains(text(),'Сутки — 400 рублей. Оплата курьеру — наличными или')]")
    private WebElement dropDawnText;

    @FindBy(xpath = ".//button[@class='Button_Button__ra12g']")
    private WebElement orderButton;

    @FindBy(xpath = ".//img[@alt='Yandex']")
    private WebElement yandexButton;

    public void clickOnDropdownList() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", accordionElement);
        accordionElement.click();
    }

    public void assertThatDropdownTextIsDisplayed() {
        Assertions.assertTrue(dropDawnText.isEnabled());
    }

    public void clickOnOrderButton() {
        orderButton.click();
    }

    public void clickOnLogo() {
        yandexButton.click();
    }
}
