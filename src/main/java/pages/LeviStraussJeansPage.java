package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeviStraussJeansPage extends BasePage {

    @FindBy(id = "dropdown_selected_size_name")
    private WebElement jeansSizeSelect;

    @FindBy(id = "native_dropdown_selected_size_name_3")
    private WebElement jeansPickSizeItem;

    @FindBy(xpath = "//div[@id='variation_size_name']//span[@class='a-dropdown-prompt']")
    private WebElement jeansPikedSizeSelection;

    @FindBy(xpath = "//span[@class='priceBlockStrikePriceString a-text-strike']")
    private WebElement listPriceField;

    @FindBy(id = "priceblock_ourprice")
    private WebElement salePriceField;

    @FindBy(xpath = "//td[@class='a-span12 a-color-price a-size-base priceBlockSavingsString']")
    private WebElement youSaveField;

    @FindBy(xpath = "//div[@id='selectQuantity']//span[@role='button']")
    private WebElement itemQuantityButton;

    @FindBy(xpath = "//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//a[@data-value='{\"stringVal\":\"3\"}']")
    private WebElement selectThreeItems;

    @FindBy(xpath = "//span[@id='submit.add-to-cart']//input")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='nav-right']//a[@id='nav-cart']")
    private WebElement cartButton;

    public LeviStraussJeansPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSizeSelect() {
        return jeansSizeSelect;
    }

    public void clickSizeSelect() {
        jeansSizeSelect.click();
    }

    public void clickPickSizeItem() {
        jeansPickSizeItem.click();
    }

    public WebElement getPickedSizeSelection() {
        return jeansPikedSizeSelection;
    }

    public String getPickedSizeSelectionText() {
        return jeansPikedSizeSelection.getText();
    }

    public WebElement getListPriceField() {
        return listPriceField;
    }

    public String getYouSaveFieldText() {
        return youSaveField.getText().substring(0, 5);
    }

    public WebElement getItemQuantityButton() {
        return itemQuantityButton;
    }

    public void clickItemQuantityButton() {
        itemQuantityButton.click();
    }

    public WebElement getSelectThreeItems() {
        return selectThreeItems;
    }

    public void clickSelectThreeItems() {
        selectThreeItems.click();
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }
}
