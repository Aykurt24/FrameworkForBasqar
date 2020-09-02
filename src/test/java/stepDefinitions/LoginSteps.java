package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class LoginSteps {


    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {

        /*
            Set property - open browser and navigate to website
         */
        Driver.browserName = "chrome";
        driver = Driver.getDriver();

        driver.get("https://test.basqar.techno.study");
        driver.manage().window().maximize();

    }

    @When("^Enter the username and password and click on login button$")
    public void enter_the_username_and_password_and_click_on_login_button(){

        driver.findElement(By.id("mat-input-0")).sendKeys("daulet2030@gmail.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("TechnoStudy123@");

        driver.findElement(By.cssSelector("button[aria-label='LOGIN']")).click();
    }

}

