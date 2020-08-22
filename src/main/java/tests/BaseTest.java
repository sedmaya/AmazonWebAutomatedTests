package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {
    private WebDriver driver;
    private static final String AMAZON_URL = "https://www.amazon.com/";

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AMAZON_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public LanguagePreferencesPage getLanguagePreferencesPage() {
        return new LanguagePreferencesPage(getDriver());
    }

    public CountryPreferencesPage getCountryPreferencesPage() {
        return new CountryPreferencesPage(getDriver());
    }

    public WomenPage getWomenPage() {
        return new WomenPage(getDriver());
    }

    public WomenClothingPage getWomenClothingPage() {
        return new WomenClothingPage(getDriver());
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }

    public LeviStraussJeansPage getLeviStraussJeansPage() {
        return new LeviStraussJeansPage(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }
}
