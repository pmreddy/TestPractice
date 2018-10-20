import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class Loginstepdef {
    public static WebDriver driver;
    @Given("^User is on southhallHome Page$")
    public void user_is_on_Home_Page() throws Throwable {
        driver = new FirefoxDriver();
         driver.get("https://www.southalltravel.co.uk/");
    }

    @When("^User enter details$")
    public void user_details() throws Throwable {
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
        Select s3= new Select(driver.findElement(By.id("AirLineCode1")));
        //s3.selectByValue("Air India");
        s3.selectByVisibleText("Air India");
        Select s4= new Select(driver.findElement(By.id("Flightclass")));
    }

    @And("^click on search flights$")
    public void search() throws Throwable {
       driver.findElement(By.id("button_flight_search")).submit();
    }

    @Then("^list of flights will available$")
    public void avaialbe_flights() throws Throwable {

        driver.close();

    }


}