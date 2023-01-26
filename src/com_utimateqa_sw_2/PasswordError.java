package com_utimateqa_sw_2;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PasswordError extends BaseTest {
    String baseurl = "https://courses.ultimateqa.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void Login() {
        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();


        WebElement username = driver.findElement(By.id("user[email]"));
        username.sendKeys("akspink200@googlemail.com");
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("12345678");
        driver.findElement(By.xpath("//button[@class='button button-primary g-recaptcha']")).click();

        WebElement CompTitle = driver.findElement(By.xpath("//li[@class='form-error__list-item']"));
        String actualText = CompTitle.getText();
        String expectedText = "Invalid email or password.";
        Assert.assertEquals(expectedText, actualText);

    }
}