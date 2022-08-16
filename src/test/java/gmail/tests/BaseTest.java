package gmail.tests;

import gmail.pages.AccountPage;
import gmail.pages.HomePage;
import gmail.pages.MailPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final String GOOGLE_URL = "https://google.com/";

    @BeforeAll
    public static void profileSetup() {
        chromedriver().setup();
    }

    @BeforeEach
    public void testSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(GOOGLE_URL);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }

    public MailPage getMailPage() {
        return new MailPage(getDriver());
    }

    public AccountPage getAccountPage() {
        return new AccountPage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public WebDriver getDriver() {
        return driver;
    }

}
