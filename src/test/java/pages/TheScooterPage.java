package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TheScooterPage extends BasePage {
    public TheScooterPage() {
        super();
    }

    @FindBy(xpath = ".//input[@placeholder='* Когда привезти самокат']")
    private WebElement date;

    @FindBy(xpath = ".//span[@class='Dropdown-arrow']")
    private WebElement dropDownPeriod;

    @FindBy(xpath = ".//div[text()='сутки']")
    private WebElement period;

    @FindBy(xpath = ".//input[@id='black']")
    private WebElement color;

    @FindBy(xpath = ".//input[@placeholder='Комментарий для курьера']")
    private WebElement comment;

    @FindBy(xpath = ".//button[contains(text(),'Назад')]/following-sibling::*")
    private WebElement finalOrderButton;


    public void sendDate(String inputDate) {
        date.sendKeys(inputDate);
    }

    public void clickDropdawnButton() {
        dropDownPeriod.click();
        period.click();
    }

    public void chooseColor() {
        color.click();
    }

    public void sendComment(String inputComment) {
        comment.sendKeys(inputComment);
    }

    public void clickOrderButton() {
        finalOrderButton.click();
    }
}
