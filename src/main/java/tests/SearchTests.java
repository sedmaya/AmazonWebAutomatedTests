package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {
    public static final String SEARCH_KEYWORD_INCORRECT = "мамалилараму";
    public static final String SEARCH_KEYWORD = "buckwheat";
    public static final String SEARCH_KEYWORD_CYRILLIC = "гречка";
    public static final String EXPECTED_MESSAGE_FOR_INCORRECT_REQUEST = "No results for " + SEARCH_KEYWORD_INCORRECT + ".";
    public static final int EXPECTED_PRODUCTS_AMOUNT = 3;

    @Test
    public void checkIncorrectSearchRequest() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD_INCORRECT);
        getBasePage().waitForElementVisibility(30, getSearchResultsPage().getIncorrectSearchResultsRespond());

        Assert.assertEquals(getSearchResultsPage().getIncorrectSearchResultsRespondText(), EXPECTED_MESSAGE_FOR_INCORRECT_REQUEST);
    }

    @Test
    public void checkThatSearchResultsContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getBasePage().implicitlyWait(20);

        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_KEYWORD));
    }

    @Test
    public void checkElementsAmountOnSearchPage() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD_CYRILLIC);
        getBasePage().implicitlyWait(30);
        getSearchResultsPage().clickNutritionProteinFilterCheckBox();
        getBasePage().implicitlyWait(30);

        Assert.assertEquals(getSearchResultsPage().getSearchResultsItemsCount(), EXPECTED_PRODUCTS_AMOUNT);
    }

    @AfterTest
    public void tearDown() {
        getDriver().close();
    }
}
