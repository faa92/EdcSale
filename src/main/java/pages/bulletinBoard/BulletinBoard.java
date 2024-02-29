package pages.bulletinBoard;

import elements.impl.EdcButton;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.bulletinBoard.elements.BlockListAds;
import pages.bulletinBoard.elements.BlockTopHeader;
import pages.bulletinBoard.elements.BulletinBordBlockSearchPanel;
import pages.bulletinBoard.elements.MainBlock;

public class BulletinBoard extends BasePage {

    private final By dropDownListAds = By.xpath("//div[@class='fl-search-h-results']"); //выпадающий блок при вводе в поисковую строку
    private final By searchPanel = By.xpath("//div[@class='wb-f-panel-body']");
    private final By mainBlock = By.xpath("//div[@class='in-cat-box in-cat-box-list j-collapse-list-box']");
    private final By loginButton = By.xpath("//span[@class='ml-2 d-none d-md-inline']");
    private final By topHeader = By.xpath("//div[@class='h-header-in']");

    public BlockTopHeader getTopHeader() {
        return new BlockTopHeader(driver.findElement(topHeader));
    }

    public EdcButton getLoginButton() {
        return new EdcButton(driver.findElement(loginButton));
    }

    public BulletinBordBlockSearchPanel getSearchPanel() {
        return new BulletinBordBlockSearchPanel(driver.findElement(searchPanel));
    }

    public BlockListAds getDropDownListAds() {
        return new BlockListAds(driver.findElement(dropDownListAds));
    }

    public MainBlock getMainBlock() {
        return new MainBlock(driver.findElement(mainBlock));
    }

}
