package testsuitorangehrmlive2;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
        String baseurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void login() {
        //click on login link

        WebElement Username = driver.findElement(By.name("username"));
        Username.sendKeys("Admin");
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("admin123");
       driver.findElement(By.className("oxd-button")).click();
       driver.findElement(By.xpath("//h6")).click();


        WebElement CompTitle = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
        String actualText=CompTitle.getText();
        String expectedText="Dashboard";
        Assert.assertEquals(expectedText,actualText);
    }

}
