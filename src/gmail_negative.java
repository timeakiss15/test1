import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Asusik-PC on 27.07.2016.
 */
public class gmail_negative {


    @Test

    public void Test1() {
        System.setProperty("webdriver.chrome.driver", "C://Users//PC//IdeaProjects//gmail//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://accounts.google.com/");
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("timeaemail2");
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("wimea194");
        driver.findElement(By.id("signIn")).click();

        driver.close();
    }
}
