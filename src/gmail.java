import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Asusik-PC on 27.07.2016.
 */
public class gmail {



    @Test

    public void Test2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//PC//IdeaProjects//gmail//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/");
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("timeaemail2");
        driver.findElement(By.id("next")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("timea1994");
        driver.findElement(By.id("signIn")).click();

    }

    @Test

    public void Test3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//PC//IdeaProjects//gmail//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://accounts.google.com/");
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("timeaemail2");
        driver.findElement(By.id("next")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("timea1994");
        driver.findElement(By.id("signIn")).click();
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.findElement(By.id("gbqfq")).clear();
        driver.findElement(By.id("gbqfq")).sendKeys("test");
        driver.findElement(By.id("gbqfb")).click();

    }

    @Test

    public void Test4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//PC//IdeaProjects//gmail//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://accounts.google.com/");
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("timeaemail2");
        driver.findElement(By.id("next")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("timea1994");
        driver.findElement(By.id("signIn")).click();
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.findElement(By.linkText("Із зірочкою")).click();
        driver.findElement(By.linkText("Надіслані")).click();
        driver.findElement(By.linkText("Чернетки (1)")).click();
        driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/span/div")).click();
        driver.findElement(By.xpath("//div[4]/div/div/table/tbody/tr/td[3]/span")).click();
        driver.findElement(By.xpath("//div[4]/div/div/div/div/div[6]/div/span")).click();
        driver.findElement(By.linkText("Із зірочкою")).click();


    }

    @Test

    public void Test5() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//PC//IdeaProjects//gmail//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/");
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("timeaemail2");
        driver.findElement(By.id("next")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys("timea1994");
        driver.findElement(By.id("signIn")).click();
        driver.get("https://mail.google.com/mail/u/0/#settings/general");
        driver.findElement(By.linkText("Пересилання та POP/IMAP")).click();
        driver.findElement(By.xpath("//td[2]/div/table/tbody/tr/td/input")).click();
        driver.findElement(By.xpath("//tr[4]/td/div/button")).click();


    }
}
