package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChartPage extends BasePage{
    public ChartPage(WebDriver driver){
    super(driver);
    }
By productinCartBy = By.xpath("//div[@class='cart_quantity']");
String expectedCartTitle = "1";
By continuShopBy = By.xpath("//*[@id='continue-shopping']");
By productTitleLinkBy = By.xpath("//*[@id='item_4_title_link']/div");
By removeButonBy = By.xpath("//*[@id='remove-sauce-labs-backpack']");
By checkoutButonBy = By.xpath("//*[@id='checkout']");



By carPageTitleBy = By.className("title");
String expectedTitle = "Your Cart";

public ChartPage verifyThatUserIsOnCartPage(){
    String curentPageTitle = readText(carPageTitleBy);
    checkIfTextIsTheSame(expectedTitle, curentPageTitle);
    return this;
       
}
public ChartPage verifyThatProductIsInCart(){
    String CartroductTitle = readText(productinCartBy);
    checkIfTextIsTheSame(expectedCartTitle, CartroductTitle);
    return this;
}
public ChartPage verifyThatProductIsNotInCart(){
    verifyElementNotDisplayed(productinCartBy);
    return this;
}
public ChartPage navigteToHPfromCart(){
    click(continuShopBy);
    return this;
}

public ChartPage navigateToPDPfromCart(){
    click(productTitleLinkBy);
    return this;
}
public ChartPage removefromCart(){
    click(removeButonBy);
    return this;
}
public ChartPage clickonCheckout(){
    click(checkoutButonBy);
    return this;
}


}