package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChartPage extends BasePage{
    public ChartPage(WebDriver driver){
    super(driver);
    }
By productinCartBy = By.xpath("//div[@class='cart_quantity']");
String expectedCartTitle = "1";



By carPageTitleBy = By.className("title");
String expectedTitle = "Your Cart";

public ChartPage verifyThatUserIsOnCartPage(){
    String curentPageTitle = readText(carPageTitleBy);
    checkIfTextIsTheSame(expectedTitle, curentPageTitle);
    return this;
       
}
public ChartPage verifyThatProductIsInChar(){
    String CartroductTitle = readText(productinCartBy);
    checkIfTextIsTheSame(expectedCartTitle, CartroductTitle);
    return this;
}
public ChartPage verifyThatProductIsNotCar(){
    verifyElementNotDisplayed(productinCartBy);
    return this;
}


}