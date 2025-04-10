package testng.basicsoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFirstExample {

    public static WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void closedBrowser(){
        driver.close();
    }

    @Test(groups = "smoke")
    public void verifyEdsoServices() throws InterruptedException {
        driver.get("https://edso.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void verifyTcs() throws InterruptedException {
        driver.get("https://tcs.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void verifyCamposCoffee() throws InterruptedException {
        driver.get("https://camposcoffee.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
}
