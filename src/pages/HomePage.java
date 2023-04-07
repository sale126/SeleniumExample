package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }


    By pageTitleBy = By.xpath("//span[@class='title']");
    String expectedPageTitle = "Products";
    

    By pageHamburgerMenyBy = By.id("react-burger-menu-btn");
    By logOutLinkBy = By.id("logout_sidebar_link");
    By goToPdpLinkBy = By.xpath("//*[@id='item_4_title_link']/div");
    By allItamsLinkBy = By.xpath("//*[@id='inventory_sidebar_link']");
    By cartBy = By.className("shopping_cart_link");
    By aboutLinkBy = By.id("about_sidebar_link");
    String expectedHref = "https://saucelabs.com/";
    By productsBy = By.xpath("//div[@class='inventory_item']");
    int expectedNumbersProduct = 6;
    By sortSelectBy = By.xpath("//select[@class='product_sort_container']");
    By productTitleBy = By.xpath("//div[@class='inventory_item_name']");
    By productPriceBy = By.xpath("//div[@class='inventory_item_price']");
    By productToCartHpBy = By.id("add-to-cart-sauce-labs-backpack");
    By removeButtonBy = By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory']");
   


    public HomePage checkIfuserIsonHomePage(){
        String curentPageTitle = readText(pageTitleBy);
        checkIfTextIsTheSame(expectedPageTitle, curentPageTitle);
        return this;

    } 
    public HomePage openHamburgerMenu(){
        click(pageHamburgerMenyBy);
        return this;

    }
    public HomePage clickOnLogOut(){
        click(logOutLinkBy);
        return this;

    }
    public HomePage goToPdp (){
        click(goToPdpLinkBy);
        return this;

    }
    public HomePage clickAllItems(){
        click(allItamsLinkBy);
        return this;
    }
    public HomePage navigateToCart(){
      click(cartBy);
      return this;  
    }
    public HomePage verifyAboutLink(){
        String foundHref = readHref(aboutLinkBy);
        checkIfTextIsTheSame(expectedHref, foundHref);
        return this;
    }
    public HomePage veryfyNumberProducts(){
        int founditems = countItems(productsBy);
        checkIfNumberIsTheSame(expectedNumbersProduct, founditems);
    return this;
    }

    public HomePage selectSortOption(String option){
        selectDropdownOptionByValue(sortSelectBy, option);

        return this;

    }
    public HomePage verifyFirstProductTitlt(String expectedTitle){
        String foundTitle = readText(productTitleBy);
        checkIfTextIsTheSame(expectedTitle, foundTitle);

        return this;
    }
    public HomePage verifyFirstProductPrice(double expectedprice){
        String foundPrice = readText(productPriceBy);
        double foundPriceDouble = parseStringToDouble(foundPrice.substring(1));
        checkIfNumberIsTheSame(expectedprice, foundPriceDouble);

        return this;
    }
    public HomePage clickProducttoCartfromHomePage(){
        click(productToCartHpBy);
        return this;
    }
    public HomePage clickRemovefromHomePage(){
        click(removeButtonBy);
        return this;
    }

    

}
