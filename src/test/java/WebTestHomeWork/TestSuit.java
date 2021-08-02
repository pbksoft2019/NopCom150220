package WebTestHomeWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends BaseTest
{


    @Test
    public void userShouldBeAbleToRegisterSuccessfullu()
    {
        //driver.findElement(By.linkText("Log in")).click();
        clickOnElement(By.linkText("Computers"));
        clickOnElement(By.xpath("//img[@alt='Picture for category Desktops']"));
        //driver.findElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));

        driver.findElements(By.xpath("button-2 product-box-add-to-cart-button")).get(0).click();



    }

//    @Test
//    public void printPriceOfProducts(){
//        List<WebElement> productList = driver.findElement( By.className("price actual-price") );
//
//        for (WebElement we: productList){
//            System.out.println(we.getText());
//        }
//
//    }

}
