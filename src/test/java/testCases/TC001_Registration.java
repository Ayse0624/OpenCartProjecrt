package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;


public class TC001_Registration extends BaseClass{
    //public WebDriver driver;

    @Test(priority = 1)
    public void clickRegistration() {
        HomePage homePage=new HomePage(driver);
        homePage.clickRegister();
    }
    @Test(priority = 2)
    public void verification () throws InterruptedException {
        RegistrationPage registrationPage=new RegistrationPage(driver);
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        registrationPage.setName(randomString());
        registrationPage.setEmail(randomEmail());
        registrationPage.setRole();
        js.executeScript("window.scrollBy(0,400)");
        registrationPage.setCompanyName();
        registrationPage.setQA();
        registrationPage.setMassage();
        registrationPage.clickSubmit();
        String confmsg= registrationPage.getConfirmMsg();
        Assert.assertEquals(confmsg,"Failed to validate Captcha. Please try again.");

    }
}
