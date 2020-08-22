package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='nav-tools']/a[@id='icp-nav-flyout']")
    private WebElement userPreferencesIcon;

    @FindBy(xpath = "//div[@id='nav-flyout-icp']//div[@class='icp-mkt-change-lnk']")
    private WebElement countryChangeLink;

    @FindBy(xpath = "//div[@id='nav-global-location-slot']//a")
    private WebElement countryDeliveryButton;

    @FindBy(xpath = "//span[@data-action='a-dropdown-button']")
    private WebElement outsideUsShipmentSelector;

    @FindBy(xpath = "//a[@data-value='{\"stringVal\":\"UA\"}']")
    private WebElement countryNeededSelector;

    @FindBy(xpath = "//span//button[@name='glowDoneButton']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@id='nav-global-location-slot']//span[@id='glow-ingress-line2']")
    private WebElement countryNameDescription;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement searchRequestSubmitButton;

    @FindBy(id = "nav-hamburger-menu")
    private WebElement hamburgerMenuButton;

    @FindBy(xpath = "//div[@id='hmenu-content']//div[. = 'Clothing, Shoes, Jewelry & Watches']")
    private WebElement catalogueClothingSection;

    @FindBy(xpath = "//div[@id='hmenu-content']//a[. = 'Women']")
    private WebElement catalogueWomenSectionButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickUserPreferencesIcon() {
        userPreferencesIcon.click();
    }

    public WebElement getUserPreferencesIcon() {
        return userPreferencesIcon;
    }

    public WebElement getChangeCountryLink() {
        return countryChangeLink;
    }

    public void clickChangeDeliveryCountryButton() {
        countryDeliveryButton.click();
    }

    public WebElement getSelectShipOutsideUs() {
        return outsideUsShipmentSelector;
    }

    public void clickSelectShipOutsideUs() {
        outsideUsShipmentSelector.click();
    }

    public WebElement getSelectNeededCountry() {
        return countryNeededSelector;
    }

    public void clickSelectNeededCountry() {
        countryNeededSelector.click();
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getCountryNameText() {
        return countryNameDescription.getText();
    }

    public void searchByKeyword(String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public void clickHamburgerMenuButton() {
        hamburgerMenuButton.click();
    }

    public WebElement getCatalogueClothingSection() {
        return catalogueClothingSection;
    }

    public void clickCatalogueClothingSection() {
        catalogueClothingSection.click();
    }

    public WebElement getCatalogueWomenSectionButton() {
        return catalogueWomenSectionButton;
    }

    public void clickCatalogueWomenSectionButton() {
        catalogueWomenSectionButton.click();
    }

}
