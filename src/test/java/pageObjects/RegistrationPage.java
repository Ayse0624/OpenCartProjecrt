package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@name='0-1/firstname']")
    WebElement name;

    @FindBy(xpath = "//*[@name='0-1/email']")
    WebElement email;

    @FindBy(xpath = "//*[@name='0-1/role']")
    WebElement role;

    @FindBy(xpath = "//*[@name='0-2/name']")
    WebElement companyName;

    @FindBy(xpath = "//*[@name='0-1/message']")
    WebElement massage;

    @FindBy(xpath = "//*[@value='Test automation optimization']")
    WebElement QA;

    @FindBy(xpath = "//*[text()='Submit']")
    WebElement submit;

    @FindBy(xpath = "//*[text()='Failed to validate Captcha. Please try again.']")
    WebElement confirmMsg;


    public void setName(String Name){
        name.sendKeys(Name);
    }

    public void setEmail(String Email){
        email.sendKeys(Email);
    }

    public void setRole()
    {
        role.sendKeys("test engineer");
    }
    public void setCompanyName(){
        companyName.sendKeys("TGS");
    }
    public void setMassage(){
        massage.sendKeys("this is a tets automation project");
    }
    public void setQA(){
//        Select select=new Select(QA);
//        select.selectByIndex(3);
        QA.sendKeys("One-on-one consultation");
    }
    public void clickSubmit(){
        submit.click();
    }
    public String getConfirmMsg(){
        try {
            return (confirmMsg.getText());
        } catch (Exception e) {
            return (e.getMessage());
        }

    }









}
