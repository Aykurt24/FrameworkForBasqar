package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public static String browserName;
    private static WebDriver driver;
    public static WebDriver getDriver(){

        if(driver == null){

            switch (browserName){

                default:
                    WebDriverManager.chromedriver().setup(); // this line is for System.setproperty
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup(); // this line is for System.setproperty
                    driver = new FirefoxDriver();
                    break;

            }

        }

        return driver;

    }

}
