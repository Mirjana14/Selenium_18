import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak8 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get("https://wordpress.com/");

        WebElement logInButton = driver.findElement(By.linkText("Log In"));
        logInButton.click();

        WebElement emailUsername = driver.findElement(By.id("usernameOrEmail"));
                emailUsername.sendKeys("mirjanazivanovic470");

                WebElement continueButton = driver.findElement(By.cssSelector("button[type='submit']"));
                continueButton.click();

                WebElement password =  driver.findElement(By.id("password"));
                password.sendKeys("zlatousti123");

            continueButton.click();

           wait.until(ExpectedConditions.urlToBe("https://wordpress.com/home/mima4702.wordpress.com"));
        Assert.assertEquals(driver.getCurrentUrl(),  "https://wordpress.com/home/mima4702.wordpress.com");




    }
}
