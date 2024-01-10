package service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.MyDriverManager;

public abstract class BaseService {
    protected final Logger logger;
    protected  final WebDriver driver;

    public BaseService(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
        this.driver = MyDriverManager.getDriver();
    }
}
