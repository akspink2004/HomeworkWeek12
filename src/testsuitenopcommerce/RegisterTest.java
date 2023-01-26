package testsuitenopcommerce;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Month;

public class RegisterTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void Register(){
        // click on Register Button
        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        // Click on Gender Button
        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-male']"));
        gender.click();
        // Click on frist name
        WebElement Fristname = driver.findElement(By.id("FirstName"));
        Fristname.sendKeys("Akshit");
        //Last Name
        WebElement Lastname = driver.findElement(By.id("LastName"));
        Lastname.sendKeys("Patel");
        //WebElement dropDown0 = driver.findElement(By.xpath("//label[text()='Date of birth:']"));

        WebElement Day =driver.findElement(By.name("DateOfBirthDay"));
        Select select=new Select(Day);
        select.selectByIndex(23);// select by index value

        WebElement Month=driver.findElement(By.name("DateOfBirthMonth"));
        Select select1=new Select(Month);
        select1.selectByIndex(3);// select by index value

        WebElement Year=driver.findElement(By.name("DateOfBirthYear"));
        Select select2=new Select(Year);
        select2.selectByIndex(65);// select by index value
        WebElement Emailid = driver.findElement(By.id("Email"));
        Emailid.sendKeys("akspink200@yahoo.co.uk");
        WebElement Password =driver.findElement(By.id("Password"));
        Password.sendKeys("123456");
        WebElement ConfirmPassword =driver.findElement(By.id("ConfirmPassword"));
        ConfirmPassword.sendKeys("123456");
        WebElement ClickRegister = driver.findElement(By.id("register-button"));
        ClickRegister.click();
        WebElement Continu = driver.findElement(By.xpath("//a[text()='Continue']"));
        Continu.click();
    }
    @After
    public void tearDown() {

         closeBrowser();
    }
}
