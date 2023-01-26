package comherokuapp2;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "http://the-internet.herokuapp.com/login";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void Login(){
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();


        WebElement CompTitle = driver.findElement(By.xpath("//h2"));
        String actualText=CompTitle.getText();
        String expectedText="Secure Area";
        Assert.assertEquals(expectedText,actualText);

    }
}
