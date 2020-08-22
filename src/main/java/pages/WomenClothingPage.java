package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WomenClothingPage extends BasePage {

    @FindBy(xpath = "//div[@id='leftNav']//li//a//span[. = 'Jeans']")
    private WebElement womenJeansSectionButton;

    @FindBy(xpath = "//img[@alt='Skinny']")
    private WebElement skinnyJeansButton;

    @FindBy(xpath = "//div/img[@data-image-index='1']")
    private WebElement leviStraussJeansImage;


    public WomenClothingPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWomenJeansSectionButton() {
        return womenJeansSectionButton;
    }

    public void clickJeansSectionButton() {
        womenJeansSectionButton.click();
    }

    public WebElement getSkinnyJeansSection() {
        return skinnyJeansButton;
    }

    public void clickSkinnyJeansSection() {
        skinnyJeansButton.click();
    }

    public WebElement getLeviStraussJeansImage() {
        return leviStraussJeansImage;
    }

    public void clickLeviStraussJeansImage() {
        leviStraussJeansImage.click();
    }

}