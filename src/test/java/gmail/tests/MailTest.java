package gmail.tests;

import org.junit.jupiter.api.Test;

public class MailTest extends BaseTest{

    private static final String LOGIN = "my.testing.AQA@gmail.com";
    private static final String PASSWORD = "Testinggmail";
    private static final String MAIL_ADDRESS = "ar7nic@gmail.com";
    private static final String SUBJECT = "test";
    private static final String TEXT = "Hello Alex.";
    private static final long DEFAULT_TIMEOUT = 30;

    @Test
    void sendMail() throws InterruptedException {
        getHomePage().clickMailButton();
        getHomePage().clickOnSignInButton();
        getAccountPage().enterEMail(LOGIN);
        Thread.sleep(3000);
        getAccountPage().enterPassword(PASSWORD);

        int waiting = 0;
        while(waiting < 10) {
            try {
                getMailPage().waitUntilElementIsVisible(DEFAULT_TIMEOUT,getMailPage().getNavigation());
                waiting=0;
                break;
            } catch (Exception e) {
                Thread.sleep(1000);
                waiting++;
            }
        }
        getMailPage().clickOnComposeButton();
        while(waiting < 10) {
            try {
                getMailPage().waitUntilElementIsVisible(DEFAULT_TIMEOUT,getMailPage().getMessageArea());
                break;
            } catch (Exception e) {
                Thread.sleep(1000);
                waiting++;
            }
        }
            getMailPage().enterSendToEmail(MAIL_ADDRESS);
            getMailPage().enterSubject(SUBJECT);
            getMailPage().enterLetterText(TEXT);
            getMailPage().clickSendButton();
            Thread.sleep(2000);
    }
}
