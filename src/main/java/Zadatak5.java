import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Zadatak5 {
    public static void main(String[] args) {
        /*
        Testirati log in stranice https://practicetestautomation.com/
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/");

        WebElement practiceLink = driver.findElement(By.id("menu-item-20"));
practiceLink.click();

WebElement testLoginPageButton = driver.findElement(By.linkText("Test Login Page"));
testLoginPageButton.click();

        //List<WebElement> username =driver.findElements(By.id("username"));
        //System.out.println("Lista: " username.size());


WebElement username = driver.findElement(By.id("username"));
username.sendKeys("student");

WebElement password = driver.findElement(By.id("password"));
password.sendKeys("Password123");

WebElement submitB = driver.findElement(By.id("submit"));
submitB.click();

//---------------------

        String expectedUrl = ("https://practicetestautomation.com/logged-in-successfully/");
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

        WebElement title = driver.findElement(By.className("post-title"));
        String actualTitle = title.getText();
        String expectedTitle = "Logged in Successfuly";

        Assert.assertEquals(title.getText(), "Logged in Successfuly");
        Assert.assertEquals(actualTitle, expectedTitle);






    }
}
