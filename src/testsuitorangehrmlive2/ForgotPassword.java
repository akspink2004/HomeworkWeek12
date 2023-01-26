package testsuitorangehrmlive2;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPassword extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void forgotpassword(){
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin12334");
        driver.findElement(By.className("oxd-button")).click();
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();


        WebElement CompTitle = driver.findElement(By.xpath("//h6[text()='Reset Password']"));
        String actualText=CompTitle.getText();
        String expectedText="Reset Password";
        Assert.assertEquals(expectedText,actualText);
    }
}
