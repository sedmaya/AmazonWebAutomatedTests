package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ActionsWithCartTests extends BaseTest {
    private static final String EXPECTED_TOTAL_TO_PAY = "$78.99";
    private static final String EXPECTED_EMPTY_CART_MESSAGE = "Your Amazon Cart is empty";

    private void generalSteps() {
        getHomePage().clickHamburgerMenuButton();
        getBasePage().waitForElementVisibility(30, getHomePage().getCatalogueClothingSection());
        getHomePage().clickCatalogueClothingSection();
        getBasePage().waitForElementVisibility(30, getHomePage().getCatalogueWomenSectionButton());
        getHomePage().clickCatalogueWomenSectionButton();
        getBasePage().waitForElementVisibility(30, getWomenPage().getWomenClothingSectionButton());
        getWomenPage().clickWomenClothingSectionButton();
        getBasePage().waitForElementVisibility(30, getWomenClothingPage().getWomenJeansSectionButton());
        getWomenClothingPage().clickJeansSectionButton();
        getBasePage().waitForElementVisibility(30, getWomenClothingPage().getSkinnyJeansSection());
        getWomenClothingPage().clickSkinnyJeansSection();
        getBasePage().waitForElementVisibility(30, getWomenClothingPage().getLeviStraussJeansImage());
        getWomenClothingPage().clickLeviStraussJeansImage();
        getBasePage().waitForElementVisibility(30, getLeviStraussJeansPage().getSizeSelect());
        getLeviStraussJeansPage().clickSizeSelect();
        getLeviStraussJeansPage().clickPickSizeItem();
        getBasePage().waitForElementIsClickable(30, getLeviStraussJeansPage().getItemQuantityButton());
        getLeviStraussJeansPage().clickItemQuantityButton();
        getBasePage().waitForElementVisibility(30, getLeviStraussJeansPage().getSelectThreeItems());
        getLeviStraussJeansPage().clickSelectThreeItems();
        getLeviStraussJeansPage().clickAddToCartButton();
        getLeviStraussJeansPage().clickCartButton();
    }

    @Test
    public void checkAmountInCart() {
        generalSteps();
        getBasePage().waitForPageReadyState(20);

        Assert.assertEquals(getCartPage().getTotalAmountInCartText(), EXPECTED_TOTAL_TO_PAY);
    }

    @Test
    public void checkCartIsEmpty() {
        generalSteps();
        getBasePage().implicitlyWait(10);
        getCartPage().clickDeleteItemFromCartButton();
        getBasePage().waitForElementVisibility(30, getCartPage().getYourCartIsEmptyMessage());

        Assert.assertEquals(getCartPage().getYourCartIsEmptyMessageText(), EXPECTED_EMPTY_CART_MESSAGE);
    }

    @AfterTest
    public void tearDown() {
        getDriver().close();
    }
}
