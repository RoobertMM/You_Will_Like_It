import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends PageObject{
    //Class constructor
    public MainPage(WebDriver driver){ super(driver); }
    private final String Music_Name = "Astronaut in the ocean";
    //private final String VALID_URL = "";

    @FindBy(xpath = "//*[@id=\"search\"]")
    private WebElement search;
    @FindBy(xpath = "//*[@id=\"video-title\"]/yt-formatted-string")
    private WebElement clickMeldoi;
    @FindBy(xpath = "//*[@id=\"movie_player\"]/div[25]/div[2]/div[2]/button[10]")
    private WebElement full;
    @FindBy(xpath = "//*[@id=\"search-icon-legacy\"]/yt-icon")
    private WebElement searchIcon;
    @FindBy(xpath = "//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[1]/div[4]/form/div[1]/div/button/span")
    private WebElement span;

    public void Span(){this.span.click();}
    public void SearchIcon(){this.searchIcon.click();}
    public void Full(){this.full.click();}
    public void ClickMelodi(){this.clickMeldoi.click();}
    public void Search(){this.search.sendKeys(Music_Name);}


}
