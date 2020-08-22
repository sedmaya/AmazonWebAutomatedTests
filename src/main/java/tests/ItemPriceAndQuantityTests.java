package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ItemPriceAndQuantityTests extends BaseTest {
    private static final String EXPECTED_SIZE = "6";
    private static final String EXPECTED_SAVINGS = "$1.66";

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
    }

    @Test
    public void checkCorrectSizeIsSelected() {
        generalSteps();
        getBasePage().waitForElementVisibility(30, getLeviStraussJeansPage().getPickedSizeSelection());

        Assert.assertEquals(getLeviStraussJeansPage().getPickedSizeSelectionText(), EXPECTED_SIZE);
    }

    @Test
    public void checkDiscountIsCorrect() {
        generalSteps();
        getBasePage().waitForElementVisibility(30, getLeviStraussJeansPage().getListPriceField());

        Assert.assertEquals(getLeviStraussJeansPage().getYouSaveFieldText(), EXPECTED_SAVINGS);
    }

    @AfterTest
    public void tearDown() {
        getDriver().close();
    }
}
