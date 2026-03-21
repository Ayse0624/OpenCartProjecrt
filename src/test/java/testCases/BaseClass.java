package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://ultimateqa.com/automation");
        driver.manage().window().maximize();
    }
//    @AfterClass
//    public void teardown(){
//        driver.quit();
//    }

    public String randomString(){
        String generatestring= RandomStringUtils.randomAlphabetic(5);
        return generatestring;
    }

    public String randomNumber(){
        String generatenumber=RandomStringUtils.randomNumeric(9);
        return generatenumber;
    }


    public String randomEmail(){
        String generateemail=RandomStringUtils.randomAlphabetic(3);
        return generateemail+"@gmail.com";
    }
}
