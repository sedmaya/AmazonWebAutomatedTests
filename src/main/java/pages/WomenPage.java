package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WomenPage extends BasePage {

    @FindBy(xpath = "//div[@id='sobe_d_b_4_1']/a")
    private WebElement womenClothingSectionButton;

    public WomenPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWomenClothingSectionButton() {
        return womenClothingSectionButton;
    }

    public void clickWomenClothingSectionButton() {
        womenClothingSectionButton.click();
    }

}
