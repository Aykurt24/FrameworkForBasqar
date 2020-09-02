package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.Random;

public class BaseClass {

    WebDriver driver;
    WebDriverWait wait;

    public BaseClass() {

        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);

    }

    public void click(WebElement elementName) {
        waitUntilVisible(elementName);
        waitUntilClickable(elementName);
        elementName.click();
    }

    public void waitUntilVisible(WebElement elementName) {

        wait.until(ExpectedConditions.visibilityOf(elementName));

    }

    public void waitUntilClickable(WebElement elementName) {

        wait.until(ExpectedConditions.elementToBeClickable(elementName));

    }

    public void sendKeys(WebElement elementName, String text) {

        waitUntilVisible(elementName);
        elementName.clear();
        elementName.sendKeys(text);

    }

    public void verifyMessage(WebElement elementName, String message) {

        Assert.assertEquals(elementName.getText(), message);

    }

    public void scrollToElement(WebElement elementName) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView();", elementName);

    }

    public void waiting(int howLong) {
        try {
            Thread.sleep(howLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void containsText(WebElement elementName, String text) {

        waitUntilVisible(elementName);
        Assert.assertTrue(elementName.getText().contains(text));

    }

    public int randomNumber(int max) {

        Random  rnd = new Random();
        return rnd.nextInt(max-1)+1;
    }


}
