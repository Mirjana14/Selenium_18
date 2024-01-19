import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Zadatak10 {
    public static void main(String[] args) throws InterruptedException {


        /*
        Otici na stranicu https://imgflip.com/memegenerator
//Uploadovati sliku od koje treba napraviti mim
//Mim mora biti vezan za IT, QA ili kurs
//Sliku rucno skinuti i ubaciti na Slack thread poruku
//Autor mima sa najvise lajkova dobija pivo na druzenju
//
//Napomena: Izazov zadatka je
kod lokatora, assertove ne treba dodavati i ne treba raditi sa anotacijama
         */


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get("https://imgflip.com/memegenerator");
        String imageLocation = "C:/User/Necha/Desktop/mandark.png";

        WebElement uploud = driver.findElement(By.id("mm-show-upload"));
                uploud.click();



          WebElement uploudImageFromDevice = driver.findElement(By.id("mm-upload-file"));
          uploudImageFromDevice.sendKeys(imageLocation);



        WebElement uploudButton = driver.findElement(By.id("mm-upload-btn"));
          uploudButton.sendKeys(imageLocation);

        List<WebElement> textbox = driver.findElements(By.className("mm-text"));
        textbox.get(0).sendKeys("Trenutak kada treba da serujes ekran i vidis" +
                " da su Milos Manojlovic i Dusan Djordjevic napisali" +
                " vec 10 linija koda, a ti nisi ni procitao zadatak");

        WebElement meme = driver.findElement(By.cssSelector("mm-generate.b.but"));
        meme.click();
    }
}
