package com_utimateqa_sw_2;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://courses.ultimateqa.com/";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void Login(){
        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();

        WebElement CompTitle = driver.findElement(By.xpath("//h2[@class='page__heading']"));
        String actualText=CompTitle.getText();
        String expectedText="Welcome Back!";
        Assert.assertEquals(expectedText,actualText);

        WebElement username = driver.findElement(By.id("user[email]"));
        username.sendKeys("akspink200@googlemail.com");
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("123456789");
        driver.findElement(By.xpath("//button[@class='button button-primary g-recaptcha']")).click();


//        WebElement CompTitle = driver.findElement(By.xpath("//h2"));
//        String actualText=CompTitle.getText();
//        String expectedText="Secure Area";
//        Assert.assertEquals(expectedText,actualText);

    }
}
