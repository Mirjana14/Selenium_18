import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zadatak1 {

    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();


    driver.manage().window().maximize();

    driver.get("https://www.linkedin.com");
    driver.navigate().refresh();

    driver.get("https://www.joberty.com/");

    driver.navigate().back();

        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }





}
