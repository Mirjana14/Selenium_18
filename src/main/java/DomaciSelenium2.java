import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DomaciSelenium2 {
    public static void main(String[] args) throws InterruptedException {
        //https://demoqa.com/text-box napisati test case za dati text box

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mirjana Zivanovic");

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("mima@yopmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("adresa 1");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("adresa  2");

    Thread.sleep(2000);

       WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        String expectedResult = ("https://demoqa.com/text-box");
        Assert.assertEquals(driver.getCurrentUrl(), expectedResult);


    }
}
