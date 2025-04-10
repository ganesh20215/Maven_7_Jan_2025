package testng.parameterization.parametrized;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleDataProvider {

    @DataProvider(name = "kapil")
    public Object[][] dataFun(){
        return new Object[][]{
                {"Delhi", "Selenium"}, {"Mumbai", "Java"}, {"Pune", "python"}
        };
    }

    @Test(dataProvider = "kapil")
    public void searchDataOnGoogle(String courseName, String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName+ " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }
}
