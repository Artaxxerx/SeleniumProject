package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;


public class TheAddressPage extends BasePage {
    public TheAddressPage() {
        super();
    }

    @FindBy(xpath = ".//input[@placeholder='* Имя']")
    private WebElement name;

    @FindBy(xpath = ".//input[@placeholder='* Фамилия']")
    private WebElement surname;

    @FindBy(xpath = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private WebElement address;

    @FindBy(xpath = ".//input[@placeholder='* Станция метро']")
    private WebElement metro;

    @FindBy(xpath = ".//li[@data-index=100]")
    private WebElement metroStationList;

    @FindBy(xpath = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private WebElement telephoneNumber;

    @FindBy(xpath = ".//button[contains(text(),'Далее')]")
    private WebElement nextButton;

    //private By name = xpath(".//input[@placeholder='* Имя']");  //Страница с адресом
    //private By surname = xpath(".//input[@placeholder='* Фамилия']");
    //private By address = xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //private By metro = xpath(".//input[@placeholder='* Станция метро']");
    //private By metroStationList =xpath(".//li[@data-index=100]");
    //private By telephoneNumber = xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //private By nextButton = xpath(".//button[contains(text(),'Далее')]");

    public void inputName(String firstName) {
        name.sendKeys(firstName);
    }

    public void inputSurname(String secondName) {
        surname.sendKeys(secondName);
    }

    public void inputAddress(String userAddress) {
        address.sendKeys(userAddress);
    }

    public void inputMetro() {
        metro.click();
        metroStationList.click();
    }

    public void inputTelephoneNumber(String number) {
        telephoneNumber.sendKeys(number);
    }

    public void clickNextButton() {
        nextButton.click();
    }
}
