package gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private static final By mailButton = By.xpath("//a[contains(text(),'Почта')]");
    private static final String SIGN_IN = "a.button[data-action='sign in']";

    public void clickOnSignInButton() {
        driver.findElement(By.cssSelector(SIGN_IN)).click();
    }

    public void clickMailButton() {
        driver.findElement(mailButton).click();
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
