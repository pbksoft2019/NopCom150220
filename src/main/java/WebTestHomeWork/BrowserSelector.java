package WebTestHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils
{


    public  void setUpBrowser()
    {
//        LoadProp loadProp = new LoadProp();
//        String BrowserName = loadProp.getProperty("chrome");
        //System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        driver.quit();
    }
}
