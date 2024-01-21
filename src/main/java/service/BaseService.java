package service;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.MyDriverManager;

public abstract class BaseService {
    protected final Logger logger;
    protected final WebDriver driver;

    public BaseService() {
        this.logger = LoggerFactory.getLogger(this.getClass());
        this.driver = MyDriverManager.getDriver();
    }
}
