package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountryPreferencesPage extends BasePage {

    @FindBy(xpath = "//span[@data-action='a-dropdown-button']")
    private WebElement countrySelectLink;

    @FindBy(id = "icp-selected-country_2")
    private WebElement countrySelectItem;

    @FindBy(xpath = "//input[@class='a-button-input']")
    private WebElement countryChangeSubmitButton;

    @FindBy(xpath = "//div[@class='a-column a-span6 a-text-center']/span")
    private WebElement countryNoteText;

    public CountryPreferencesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCountrySelectLink() {
        return countrySelectLink;
    }

    public void clickCountrySelectLink() {
        countrySelectLink.click();
    }

    public void clickSelectCountryItem() {
        countrySelectItem.click();
    }

    public void clickSubmitCountryChangeButton() {
        countryChangeSubmitButton.click();
    }

    public String getChangeCountryNoteText() {
        return countryNoteText.getText();
    }

}
