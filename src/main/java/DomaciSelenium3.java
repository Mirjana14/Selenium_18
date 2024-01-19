import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DomaciSelenium3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://practicetestautomation.com/");
        WebElement practiceLink = driver.findElement(By.id("menu-item-20"));
        practiceLink.click();

        WebElement testLoginPageButton = driver.findElement(By.linkText("Test Login Page"));
        testLoginPageButton.click();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");


        WebElement submitB = driver.findElement(By.id("submit"));
        submitB.click();

        WebElement errorTitle = driver.findElement(By.className("show"));
        String actualTitle = errorTitle.getText();
        String expectedTitle = "Your username is invalid!";

       Thread.sleep(2000);
        Assert.assertEquals(errorTitle.getText(), "Your username is invalid!");
        Assert.assertEquals(actualTitle, expectedTitle);

        WebElement username1 = driver.findElement(By.id("username"));
        username1.sendKeys("student");

        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys("");

        WebElement submitB1 = driver.findElement(By.id("submit"));
        submitB1.click();

        WebElement errorTitle1 = driver.findElement(By.className("show"));
        String actualTitle1 = errorTitle1.getText();
        String expectedTitle1 = "Your password is invalid!";

        Thread.sleep(2000);
        Assert.assertEquals(errorTitle1.getText(), "Your password is invalid!");
        Assert.assertEquals(actualTitle1, expectedTitle1);


        WebElement username2 = driver.findElement(By.id("username"));
        username2.sendKeys("");

        WebElement password2 = driver.findElement(By.id("password"));
        password2.sendKeys("");

        WebElement submitB2 = driver.findElement(By.id("submit"));
        submitB2.click();

        WebElement errorTitle2 = driver.findElement(By.className("show"));
        String actualTitle2 = errorTitle2.getText();
        String expectedTitle2 = "Your username is invalid!";

        Thread.sleep(2000);
        Assert.assertEquals(errorTitle2.getText(), "Your username is invalid!");
        Assert.assertEquals(actualTitle2, expectedTitle2);


        WebElement username3 = driver.findElement(By.id("username"));
        username3.sendKeys("12345!!!3*student");

        WebElement password3 = driver.findElement(By.id("password"));
        password3.sendKeys("36869874");

        WebElement submitB3 = driver.findElement(By.id("submit"));
        submitB3.click();

        WebElement errorTitle3 = driver.findElement(By.className("show"));
        String actualTitle3 = errorTitle3.getText();
        String expectedTitle3 = "Your username is invalid!";

        Thread.sleep(2000);
        Assert.assertEquals(errorTitle3.getText(), "Your username is invalid!");
        Assert.assertEquals(actualTitle3, expectedTitle3);


        WebElement username4 = driver.findElement(By.id("username"));
        username4.sendKeys("STUDENT");

        WebElement password4 = driver.findElement(By.id("password"));
        password4.sendKeys("PASSWORD123");

        WebElement submitB4 = driver.findElement(By.id("submit"));
        submitB4.click();


        WebElement errorTitle4 = driver.findElement(By.className("show"));
        String actualTitle4 = errorTitle4.getText();
        String expectedTitle4 = "Your username is invalid!";

        Thread.sleep(2000);
        Assert.assertEquals(errorTitle4.getText(), "Your username is invalid!");
        Assert.assertEquals(actualTitle4, expectedTitle4);

























    }
}
