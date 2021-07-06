package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SearchTest extends WebDrSettings{

    @Test
    public void checkCurrentUrl() {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.equals("https://www.google.com/"));
    }
    @Test
    public void checkSearchField() {
        driver.findElement(By.xpath("//input[@title=\"Поиск\"]")).sendKeys("picabu", Keys.ENTER);
        WebElement element = driver.findElement(By.xpath("//a[@href='https://pikabu.ru/']/h3"));
        String fieldtext = element.getText();
        Assert.assertEquals(fieldtext, "Пикабу: Горячее – самые интересные и обсуждаемые посты");
    }
    @Test
    public void getTitlePage() {
        Assert.assertEquals("picabu - Поиск в Google", driver.getTitle());
    }
    @Test
    public void checkLogo() {
        WebElement logo = driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']/img"));
        Assert.assertTrue(logo.isDisplayed());
    }
}

class WebDrSettings {
    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }
    @AfterTest
    public void close() {
        driver.quit();
    }
}
