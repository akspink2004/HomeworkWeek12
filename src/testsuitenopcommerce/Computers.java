package testsuitenopcommerce;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Computers extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void Computerstest1(){


      driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
    //    Computer.click();

        WebElement CompTitle = driver.findElement(By.className("page-title"));
        String actualText=CompTitle.getText();
        String expectedText="Computers";
        Assert.assertEquals(expectedText,actualText);

    }

    public void Electronicstest(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        //    Computer.click();

        WebElement CompTitle = driver.findElement(By.className("page-title"));
        String actualText=CompTitle.getText();
        String expectedText="Electronics";
        Assert.assertEquals(expectedText,actualText);
    }
    public void Appareltest(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        //    Computer.click();

        WebElement CompTitle = driver.findElement(By.className("page-title"));
        String actualText=CompTitle.getText();
        String expectedText="Apparel";
        Assert.assertEquals(expectedText,actualText);
    }
    public void Digitaldownloadstest(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        //    Computer.click();

        WebElement CompTitle = driver.findElement(By.className("page-title"));
        String actualText=CompTitle.getText();
        String expectedText="Digital downloads";
        Assert.assertEquals(expectedText,actualText);
    }
    public void Bookstest(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        //    Computer.click();

        WebElement CompTitle = driver.findElement(By.className("page-title"));
        String actualText=CompTitle.getText();
        String expectedText="Books";
        Assert.assertEquals(expectedText,actualText);
    }
    public void Jewelrytest(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        //    Computer.click();

        WebElement CompTitle = driver.findElement(By.className("page-title"));
        String actualText=CompTitle.getText();
        String expectedText="Jewelry";
        Assert.assertEquals(expectedText,actualText);
    }
    public void GiftCardstest(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        //    Computer.click();

        WebElement CompTitle = driver.findElement(By.className("page-title"));
        String actualText=CompTitle.getText();
        String expectedText="Gift Cards";
        Assert.assertEquals(expectedText,actualText);
    }

    @After
    public void tearDown() {

        closeBrowser();
    }
}
