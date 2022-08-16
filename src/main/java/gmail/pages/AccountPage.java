package gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage{

    private static final String MAIL_INPUT = "identifierId";
    private static final String PASSWORD_INPUT = "password";

    public void enterEMail(String email) {
        driver.findElement(By.id(MAIL_INPUT)).sendKeys(email, Keys.ENTER);
    }

        public void enterPassword(String password) {
        driver.findElement(By.name(PASSWORD_INPUT)).sendKeys(password, Keys.ENTER);
    }

    public AccountPage(WebDriver driver) {
        super(driver);
    }
}
