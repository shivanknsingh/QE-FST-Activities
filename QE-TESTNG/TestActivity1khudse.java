package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1khudse {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net");
        
    }

    @Test
    public void Testing(){
        System.out.println(driver.getTitle());

        Assert.assertEquals("Training Support", driver.getTitle());

        driver.findElement(By.xpath("/html/body/div/main/div/div/main/a")).click();
        String aboutTitle = driver.getTitle();
        System.out.println("About Us Page Title: " + aboutTitle);

        Assert.assertEquals("About Training Support", aboutTitle);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
