package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LanguageAndCountryPreferenceTests extends BaseTest {
    private static final String EXPECTED_LANGUAGE_IN_URL = "language=es_US";
    private static final String EXPECTED_CHANGE_COUNTRY_NOTE = "NOTE: A new country/region website selection will open in a new tab.";
    private static final String EXPECTED_DELIVERY_COUNTRY_NAME = "Ukraine";

    @Test
    public void checkLanguageChanges() {
        getHomePage().clickUserPreferencesIcon();
        getLanguagePreferencesPage().clickEspanolLanguage();
        getLanguagePreferencesPage().clickSubmitButton();

        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_LANGUAGE_IN_URL));
    }

    @Test
    public void checkCountryChanges() {
        Actions actions = new Actions(getDriver());
        WebElement element = getHomePage().getUserPreferencesIcon();
        getBasePage().waitForElementVisibility(30, element);
        actions.moveToElement(element).perform();
        WebElement webElement = getHomePage().getChangeCountryLink();
        getBasePage().waitForElementVisibility(30, webElement);
        actions.moveToElement(webElement).click().build().perform();
        getBasePage().waitForElementIsClickable(30, getCountryPreferencesPage().getCountrySelectLink());
        getCountryPreferencesPage().clickCountrySelectLink();
        getBasePage().waitForPageReadyState(20);
        getCountryPreferencesPage().clickSelectCountryItem();
        getCountryPreferencesPage().clickSubmitCountryChangeButton();

        Assert.assertEquals(getCountryPreferencesPage().getChangeCountryNoteText(), EXPECTED_CHANGE_COUNTRY_NOTE);
    }

    @Test
    public void checkDeliveryCountryChanges() {
        getHomePage().clickChangeDeliveryCountryButton();
        getBasePage().waitForElementVisibility(30, getHomePage().getSelectShipOutsideUs());
        getHomePage().clickSelectShipOutsideUs();
        getBasePage().waitForElementVisibility(30, getHomePage().getSelectNeededCountry());
        getHomePage().clickSelectNeededCountry();
        getBasePage().waitForElementIsClickable(30, getHomePage().getSubmitButton());
        getHomePage().clickSubmitButton();
        getBasePage().implicitlyWait(20);

        Assert.assertEquals(getHomePage().getCountryNameText(), EXPECTED_DELIVERY_COUNTRY_NAME);
    }

    @AfterTest
    public void tearDown() {
        getDriver().close();
    }
}


