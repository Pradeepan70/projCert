import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
public class App
{
    @Test
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");

        driver.get("http://localhost/");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("About Us")).click();
        //Thread.sleep(5000);
        driver.quit();
    }
}
