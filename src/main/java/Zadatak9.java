import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
        Thread.sleep(10000);



        WebElement cartBeforeAdding = driver.findElement(By.id("nav-cart-count"));
        String cartNumber = cartBeforeAdding.getText();

        //Assert.assertEquals((driver.,  "0");

        WebElement cartButton = driver.findElement(By.id("add-to-cart-button"));
        cartButton.click();

        WebElement sucessfullMessage = driver.findElement(By.id("NATC_SMART_WAGON_CNOF_"));

    }
}
