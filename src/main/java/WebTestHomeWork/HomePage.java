package WebTestHomeWork;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerLink = By.linkText( "Register" );
    private By _compareFirstProduct = By.xpath( "//div/div[2]/div/div[2]/div[3]/div[2]/input[@value='Add to compare list']" );
    private By _compareSecondProduct = By.xpath( "//div/div[3]/div/div[2]/div[3]/div[2]/input[@value='Add to compare list']" );
    private By _compareProduct = By.linkText( "product comparison" );
    private By _displayBarField = By.cssSelector( "div.bar-notification.success" );
    private By _productClick = By.linkText( "Apple MacBook Pro 13-inch" );
    private By _email = By.className( "button-2 email-a-friend-button" );
    private By _clickOnBook = By.linkText( "Books" );

    public void clickOnRegisterButton() {
        clickOnElement( _registerLink );
    }
}


