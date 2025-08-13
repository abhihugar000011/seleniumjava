package basic_Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class AutomationDemoSite {
    public static void main(String[] as) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement alertbutton = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]"));
        alertbutton.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        String title = driver.getTitle();
        Assert.assertTrue(alertbutton.isDisplayed());

        driver.quit();
    }
}
