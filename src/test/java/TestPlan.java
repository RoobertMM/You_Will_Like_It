import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdrive.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName="Search URL")
    public static void searchForProduct() {
        driver.get(Utils.BASE_URL);
        MainPage webForm = new MainPage(driver);
        webForm.Span();
        Utils.waitForElementsToLoad(2);
        webForm.Search();
        Utils.waitForElementsToLoad(5);
        webForm.SearchIcon();
        Utils.waitForElementsToLoad(5);
        webForm.ClickMelodi();
        Utils.waitForElementsToLoad(5);
        webForm.Full();
        Utils.waitForElementsToLoad(12);
    }



    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
