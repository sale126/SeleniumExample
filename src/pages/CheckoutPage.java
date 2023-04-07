package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{
    public CheckoutPage (WebDriver driver){
        super (driver);
    }

    By checkoutTitleBy = By.className("title");
    String expectedChTitle = "Checkout: Your Information";


    public CheckoutPage verifyThatUserIsOnCheckoutPage(){
        String curentPageTitle = readText(checkoutTitleBy);
        checkIfTextIsTheSame(expectedChTitle, curentPageTitle);
        return this;

    }







    
}
