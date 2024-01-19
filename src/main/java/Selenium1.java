import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.navigate().to ( "https://www.google.com/");
        driver.manage().window().maximize();


        driver.get("https://www.youtube.com");

        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
        driver.navigate().back();

        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();

        driver.quit(); // sluzi za zatvaranje celog prozora
        //driver.close();  //sluzi za zatvaranje taba

    }
}
