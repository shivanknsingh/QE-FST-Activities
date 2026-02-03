package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
    }

    @Test
    public void Testing1() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Selenium: Target Practice");
    }

    @Test
    public void Testing2() {
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[6]")).click();
        Assert.assertTrue(false, "Failing this test intentionally");
    }

    @Test(enabled = false)
    public void hiddenTest() {
        System.out.println("You will never see this");
    }

    @Test
    public void skippedUsingException() {
        System.out.println("About to skip this test...");
        throw new SkipException("Skipping this test using SkipException");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
