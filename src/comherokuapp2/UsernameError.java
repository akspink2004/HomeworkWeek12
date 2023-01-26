package comherokuapp2;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UsernameError extends BaseTest {
    String baseurl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void Login() {
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("tomsmith1");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();


        WebElement CompTitle = driver.findElement(By.id("flash"));
        String actualText = CompTitle.getText().substring(0,25);
        String expectedText = "Your username is invalid!";
        Assert.assertEquals(expectedText, actualText);
    }
}