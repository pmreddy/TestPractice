import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        // Create a new instance of the Firefox driver

        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.southalltravel.co.uk/");

        driver.get("https://www.southalltravel.co.uk//");
        driver.findElement(By.id("DestinationFrom1")).sendKeys("London");
        driver.findElement(By.id("DestinationTo")).sendKeys("BOM");
        driver.findElement(By.id("deptdt")).click();
        driver.findElement(By.id("rtndt")).click();
        Select s = new Select(driver.findElement(By.id("AdultCnt")));
        s.selectByIndex(1);
        Select s1 = new Select(driver.findElement(By.id("Childcnt")));
        s1.selectByIndex(1);
        Select s2 = new Select(driver.findElement(By.id("InfantCnt")));
        s2.selectByIndex(1);
        Select s3 = new Select(driver.findElement(By.id("AirLineCode1")));
        //s3.selectByValue("Air India");
        s3.selectByVisibleText("Air India");
        Select s4 = new Select(driver.findElement(By.id("Flightclass")));
        //Thread.sleep(5000);
        driver.findElement(By.id("button_flight_search")).submit();
        s4.selectByVisibleText("Business");

    }
}
