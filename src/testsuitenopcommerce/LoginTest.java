package testsuitenopcommerce;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void login(){
        //click on login link
        WebElement loginInLink=driver.findElement(By.className("ico-login"));
        loginInLink.click();
        //verify welcome message
        WebElement welcomeMsg=driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText=welcomeMsg.getText();
        String expectedText="Welcome, Please Sign In!";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials(){
        //click on login link
        WebElement loginInLink=driver.findElement(By.className("ico-login"));
        loginInLink.click();

        //enter email id in to email field
        WebElement emailIdField=driver.findElement(By.id("Email"));
        emailIdField.sendKeys("akspink200@yahoo.co.uk");

        //enter password into password field
        WebElement passwordField=driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");

        //click on login button
        WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        WebElement logOutLink=driver.findElement(By.className("ico-logout"));
        //WebElement logOutLink = driver.findElement(By.className("ico-logout"));
        String actualText=logOutLink.getText();
        String expectedText="Log out";
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void InvalidCredentials(){
        //click on login link
        WebElement loginInLink=driver.findElement(By.className("ico-login"));
        loginInLink.click();
        //enter email id in to email field
        WebElement emailIdField=driver.findElement(By.id("Email"));
        emailIdField.sendKeys("akspink2004@yahoo.co.uk");

        //enter password into password field
        WebElement passwordField=driver.findElement(By.name("Password"));
        passwordField.sendKeys("1234567");

        //click on login button
        WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
    }

    @After
    public void tearDown() {

       closeBrowser();
    }
}
