import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        //WebElement searchBox =driver.findElement()


        //LOKATORI
        //ID- prvo po hijerarhiji, u idealnoj situaciji je jedinstven(ne mora biti jedinstven)
        WebElement searchBoxID = driver.findElement(By.id("APjFqb"));

        //Name
        WebElement searchBoxByName = driver.findElement(By.name("q"));

        //Class
        WebElement searchBoxByClass = driver.findElement(By.className("gLFyf"));

        //CSS Selector
        WebElement searchBoxByCSS = driver.findElement(By.cssSelector("textarea[type='search']"));

        // Primer kada koristimo CSS Selector preko klase koja unutar vrednosti ima 'space'
        WebElement searchBoxByFakeClass = driver.findElement(By.className("search box google"));
        WebElement searchBoxByFakeCSS = driver.findElement(By.cssSelector(".search.box.google"));

        //Relative Xpath
        WebElement searchBoxRelativeXpath = driver.findElement(By.xpath("//div[2]/div/textarea"));

        //Absolute Xpath -poslednji po hijerarhiji, najnestabilniji,
        // moze se koristiti na pocetku dok se kreiraju testovi ali zahteva azuriranje
        // (to je ono sto smo na prethodnom casu, kod koji kopiramo iz inspekta)
        WebElement searchBoxAbsoluteXpath = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea"));

    }
}
