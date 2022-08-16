package gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailPage extends BasePage{


    private static final String NAV = "//div[@role='navigation']";
    private static final String COMPOSE = "//div[@role='button' and contains(text(),'Написать')]";
    private static final String SEND_TO = "//textarea[@name='to']";
    private static final String SUBJECT_BOX = "//input[@name='subjectbox']";
    private static final String TEXT = "//div[@role='textbox']";
    private static final String SEND_BUTTON = "//div[@role='button' and contains(@data-tooltip,'Отправить')]";
    private static final String NEW_MESSAGE_AREA = "//div[@role='region']";

    public WebElement getNavigation() {
        return driver.findElement(By.xpath(NAV));
    }

    public WebElement getMessageArea() {
      return driver.findElement(By.xpath(NEW_MESSAGE_AREA));
    }

    public void clickSendButton() {
        driver.findElement(By.xpath(SEND_BUTTON)).click();
    }

    public void enterLetterText(String text) {
        driver.findElement(By.xpath(TEXT)).sendKeys(text, Keys.ENTER);
    }

    public void enterSubject(String subject) {
        driver.findElement(By.xpath(SUBJECT_BOX)).sendKeys(subject, Keys.ENTER);
    }

    public void enterSendToEmail(String sendTo) {
        driver.findElement(By.xpath(SEND_TO)).sendKeys(sendTo, Keys.ENTER);
    }

    public void clickOnComposeButton() {
        driver.findElement(By.xpath(COMPOSE)).click();
    }

    public MailPage(WebDriver driver) {
        super(driver);
    }
}
