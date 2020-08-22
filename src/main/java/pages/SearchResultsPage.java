package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='a-row']")
    private WebElement incorrectSearchResultsRespond;

    @FindBy(xpath = "//li[@aria-label='Protein (>10g)']")
    private WebElement filterNutritionProteinCheckBox;

    @FindBy(xpath = "//span[@data-cel-widget='MAIN-SEARCH_RESULTS']")
    public List<WebElement> searchResultsItemsListText;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getIncorrectSearchResultsRespond() {
        return incorrectSearchResultsRespond;
    }

    public String getIncorrectSearchResultsRespondText() {
        return incorrectSearchResultsRespond.getText();
    }

    public void clickNutritionProteinFilterCheckBox() {
        filterNutritionProteinCheckBox.click();
    }

    public List<WebElement> getSearchResultsItemsList() {
        return searchResultsItemsListText;
    }

    public int getSearchResultsItemsCount() {
        return getSearchResultsItemsList().size();
    }

}
