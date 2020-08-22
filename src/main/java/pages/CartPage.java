package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends BasePage {

    @FindBy(xpath = "//span[@id='sc-subtotal-amount-activecart']/span")
    private WebElement totalAmountInCartField;

    @FindBy(xpath = "//div[@class='a-row sc-action-links']//input[@value='Delete']")
    private WebElement deleteItemFromCartButton;

    @FindBy(xpath = "//div[@class='a-row sc-your-amazon-cart-is-empty']")
    private WebElement yourCartIsEmptyMessage;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getTotalAmountInCartText() {
        return totalAmountInCartField.getText();
    }

    public void clickDeleteItemFromCartButton() {
        deleteItemFromCartButton.click();
    }

    public WebElement getYourCartIsEmptyMessage() {
        return yourCartIsEmptyMessage;
    }

    public String getYourCartIsEmptyMessageText() {
        return yourCartIsEmptyMessage.getText();
    }

}
