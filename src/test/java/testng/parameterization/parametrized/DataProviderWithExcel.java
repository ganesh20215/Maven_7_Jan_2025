package testng.parameterization.parametrized;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {

    @DataProvider(name = "kapil")
    public Object[][] dataFun() throws IOException {
        Object[][] arrObj = getExcelData("D:\\classes\\Test.xlsx", "TestData");
        return arrObj;
    }

    public String[][] getExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fp = new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(fp);
        XSSFSheet sheet = wb.getSheet(sheetName);

        XSSFRow row = sheet.getRow(0);
        int noOfRow = sheet.getPhysicalNumberOfRows();
        int noOfColumn = row.getLastCellNum();

        Cell cell;

        String[][] data = new String[noOfRow][noOfColumn];

        for (int i = 1; i < noOfRow - 1; i++) {
            for (int j = 0; j < noOfColumn; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i][j] = cell.getStringCellValue();
            }
        }
        return data;
    }

    @Test(dataProvider = "kapil")
    public void searchDataOnGoogle(String courseName, String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }
}
