package tests;

import io.qameta.allure.Description;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.TheAddressPage;
import pages.TheScooterPage;
import pages.YandexPage;


public class MainTest extends BaseTest {


    @Test
    @DisplayName("Первый тест")
    @Description("Check dropdawn text")
    public void isDropdawnElementVisible() {
        MainPage mainPage = new MainPage();
        mainPage.clickOnDropdownList();
        mainPage.assertThatDropdownTextIsDisplayed();
    }

    @Test
    @Description("Check order")
    public void Order() {
        MainPage mainPage = new MainPage();//главная страница
        mainPage.clickOnOrderButton();
        TheAddressPage theAddressPage = new TheAddressPage();
        theAddressPage.inputName("Александр");
        theAddressPage.inputSurname("Белов");
        theAddressPage.inputAddress("Улица Пушкина. Дом Колотушкина");
        theAddressPage.inputMetro();
        theAddressPage.inputTelephoneNumber("89513433161");
        theAddressPage.clickNextButton();

        TheScooterPage theScooterPage = new TheScooterPage();
        theScooterPage.sendDate("19.12.1991");
        theScooterPage.clickDropdawnButton();
        theScooterPage.chooseColor();
        theScooterPage.sendComment("Коммент");
        theScooterPage.clickOrderButton();
    }

    @Test
    @Description("Check main page Yandex")
    public void IsMainPageDisplayed() {
        MainPage mainPage = new MainPage();
        mainPage.clickOnLogo();
        YandexPage yandexPage = new YandexPage();
        yandexPage.isYandexDisplayed("https://dzen.ru/?yredirect=true");
    }
}
