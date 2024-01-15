package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BulletinBoard extends BasePage {

    private final By allCategoriesBoard = By.xpath("//div[@class='in-cat-box in-cat-box-list j-collapse-list-box']");
    private final By realEstateButton = By.xpath("//a[contains(text(),\"Недвижимость\")]");
    private final By сhildsWorldButton = By.xpath("//a[contains(text(),\"Детский мир\")]");
    private final By animalsButton = By.xpath("//a[contains(text(),\"Животные\")]");
    private final By personalItemsButton = By.xpath("//a[contains(text(),\"Личные вещи\")]");
    private final By businessButton = By.xpath("//a[contains(text(),\"Бизнес\")]");
    private final By sportsAndTravelButton = By.xpath("//a[contains(text(),\"Спорт и путешествия\")]");
    private final By transportButton = By.xpath("//a[contains(text(),\"Транспорт\")]");
    private final By electronicsButton = By.xpath("//a[contains(text(),\"Электроника\")]");
    private final By houseAndCottageButton = By.xpath("//a[contains(text(),\"Дом и дача\")]");
    private final By servicesButton = By.xpath("//a[contains(text(),\"Услуги\")]");
    private final By jobButton = By.xpath("//a[contains(text(),\"Работа\")]");
    private final By hobbyMusicArtButton = By.xpath("//a[contains(text(),\"Хобби, музыка, искусство\")]");

    public WebElement getAllCategoriesBoard() {
        return driver.findElement(allCategoriesBoard);
    }

    public WebElement getTransportButton() {
        return driver.findElement(transportButton);
    }
    public WebElement getElectronicsButton() {
        return driver.findElement(electronicsButton);
    }
    public WebElement getHouseAndCottageButton() {
        return driver.findElement(houseAndCottageButton);
    }
    public WebElement getServicesButton() {
        return driver.findElement(servicesButton);
    }
    public WebElement getJobButton() {
        return driver.findElement(jobButton);
    }
    public WebElement getHobbyMusicArtButton() {
        return driver.findElement(hobbyMusicArtButton);
    }
    public WebElement getRealEstateButton() {
        return driver.findElement(realEstateButton);
    }

    public WebElement getChildsWorldButton() {
        return driver.findElement(сhildsWorldButton);
    }

    public WebElement getAnimalsButton() {
        return driver.findElement(animalsButton);
    }
    public WebElement getPersonalItemsButton() {
        return driver.findElement(personalItemsButton);
    }
    public WebElement getBusinessButton() {
        return driver.findElement(businessButton);
    }
    public WebElement getSportsAndTravelButton() {
        return driver.findElement(sportsAndTravelButton);
    }

}
