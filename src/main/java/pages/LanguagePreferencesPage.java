package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LanguagePreferencesPage extends BasePage {

    @FindBy(xpath = "//input[@value='es_US']/following-sibling::i[@class='a-icon a-icon-radio']")
    private WebElement espanolLanguageRadioButton;

    @FindBy(xpath = "//span[@id='icp-btn-save']//input[@type='submit']")
    private WebElement submitButton;

    public LanguagePreferencesPage(WebDriver driver) {
        super(driver);
    }

    public void clickEspanolLanguage() {
        espanolLanguageRadioButton.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

}
