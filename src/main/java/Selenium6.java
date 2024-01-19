import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6 {

        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.wordpress.com/");

            Cookie cookie = new Cookie("wordpress_logged_in","mirjanazivanovic470%7C1800043148%7CNOZvpGUPICBFJw" +
                    "0Ivpy3jaRHm6XQvrc1Nt21j9AUpqA%7C3e02894b90dd57d763739e8547065aa673afa663f4120f67e1c1ad57ffa16b5f");
            driver.manage().addCookie(cookie);
            driver.navigate().refresh();

            Thread.sleep(4000);

            driver.manage().deleteAllCookies();
            driver.navigate().refresh();

        } }
