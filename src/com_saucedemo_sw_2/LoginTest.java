package com_saucedemo_sw_2;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {
    String baseurl = "https://www.saucedemo.com/";
    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void Login(){
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        List<WebElement>links= driver.findElements(By.id("inventory_container"));
        int numberOfLinks = links.size();
        System.out.println(numberOfLinks);


        List<WebElement> product= driver.findElements(By.className("inventory_item_name"));
        System.out.println(product.size());


    }
}
