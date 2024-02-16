package service;

import elements.IPageElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.MyDriverManager;

import java.time.Duration;

public abstract class BaseService {
    protected final Logger logger;
    protected final WebDriver driver;
    protected WebDriverWait wait;


    public BaseService() {
        this.logger = LoggerFactory.getLogger(this.getClass());
        this.driver = MyDriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    protected boolean waitDisplayedAdsBlock(IPageElement webElement) {
        logger.info("Waiting for ad dropdown list");
        return wait.until((driver) -> webElement.isDisplayed());
    }
}
