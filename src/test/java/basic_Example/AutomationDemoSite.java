package basic_Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationDemoSite {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void alertTest() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Alerts.html");

        WebElement alertbutton = driver.findElement(By.xpath("//button[contains(text(),'alert box')]"));
        alertbutton.click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(2000);
        Assert.assertTrue(alertbutton.isDisplayed(), "Alert button should be visible");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
