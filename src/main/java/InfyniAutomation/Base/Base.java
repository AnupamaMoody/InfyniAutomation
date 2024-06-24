package InfyniAutomation.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Base {

    public static WebDriver driver;

    @BeforeSuite
    @Parameters({"browsername"})
    public static void launchApplication(String browser) {

        if( browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        }else if (browser.equals("Edge")){

            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();

        }else if (browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else {
            System.out.println("invalid browser");
        }

        driver.get("https://infyni.com/login");
        driver.manage().window().maximize();
    }


    public static void implicitTime(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

    }
    @AfterSuite
    public static void closeBrowser() {
        driver.close();
    }
}
