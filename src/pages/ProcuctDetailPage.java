package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProcuctDetailPage extends BasePage {
    public ProcuctDetailPage(WebDriver driver) {
        super(driver);
    }

    By pageTitlPDP = By.xpath("//*[@id='back-to-products']");
    String expectedPDPTitle = "Back to products";
    By addProductFromPDP = By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']");
    String expectedPDPAddTitle = "Add to cart";
    By removeFromPDP = By.xpath("//*[@id='remove-sauce-labs-backpack']");

    public ProcuctDetailPage verifyIfUserIsOnPdp (){
        String curentPageTitle = readText(pageTitlPDP);
        checkIfTextIsTheSame(expectedPDPTitle, curentPageTitle);
        return this;

    }
    public ProcuctDetailPage clickAddProductfromPDP(){
        click(addProductFromPDP);
        return this;
    }
    public ProcuctDetailPage clickRemovefromPDP(){
        click(removeFromPDP);
        return this;
    }
    

   
}
