package WebTestHomeWork;

import org.openqa.selenium.By;

public class Utils extends BasePage {
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }


}
