package tests;

import org.junit.Test;

import pages.ChartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProcuctDetailPage;



public class HomeTest extends BaseTest{

    String sortZtoA = "za";
    String expectedZtoAfirstProduct = "Test.allTheThings() T-Shirt (Red)";
    String sortLoToHigh = "lohi";
    String sortHighToLo = "hilo";

    String sortAtoZ = "az";
    String expectedAtoZfirstProduct= "Sauce Labs Backpack";
    double expectedLotoHighProduct = 7.99;
    double expectedHighToLoProduct = 49.99;
    
    @Test
    public void validateThatUserCanLogOut(){
       LoginPage loginPage = new LoginPage(driver);
       HomePage homePage = new HomePage(driver);

       loginPage.goToBaseUrl();
       loginPage.login(username, password);
       homePage.openHamburgerMenu();
       homePage.clickOnLogOut();
       loginPage.verifyThatUserIsLoggedOut();

       
}
@Test
public void checkItemIsloggedInAll(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    
    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.goToPdp();  
    homePage.openHamburgerMenu();
    homePage.clickAllItems();
    homePage.checkIfuserIsonHomePage();

}
@Test
public void checkIfuserOnPdP(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ProcuctDetailPage pdp = new ProcuctDetailPage(driver);
    
    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.goToPdp();  
    pdp.verifyIfUserIsOnPdp();

}
@Test
public void veryfyCardNavigation(){

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ChartPage chartPage = new ChartPage(driver);

    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.goToPdp(); 
    chartPage.verifyThatUserIsOnCartPage();

}
@Test
public void veryfyAboutNavigation(){

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.openHamburgerMenu();
    homePage.verifyAboutLink();


}
@Test
public void VerifyNumerOfProductonPDP(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.veryfyNumberProducts();

}
@Test
public void verifyProductSortinZtoA(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.selectSortOption(sortZtoA);
    homePage. verifyFirstProductTitlt(expectedZtoAfirstProduct);
    

}
@Test
public void verifyProductsSortinAtoZ(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.selectSortOption(sortZtoA);
    homePage.selectSortOption(sortAtoZ);
    homePage. verifyFirstProductTitlt(expectedAtoZfirstProduct);


}
@Test
public void verifyProductsSortLowtoHigh(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.selectSortOption(sortLoToHigh);
    homePage.verifyFirstProductPrice(expectedLotoHighProduct);


}
@Test
public void verifyProductsSortHighToLow(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.selectSortOption(sortHighToLo);
    homePage.verifyFirstProductPrice(expectedHighToLoProduct);
}
@Test
public void verifyAdProductToCart(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ChartPage cartPage = new ChartPage(driver);

    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.clickProducttoCartfromHomePage();
    homePage.navigateToCart();
    cartPage.verifyThatProductIsInChar();
  
}
@Test
public void verifyRemoveProductFromCart(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ChartPage cartPage = new ChartPage(driver);

    loginPage.goToBaseUrl();
    loginPage.login(username, password);

    homePage.clickProducttoCartfromHomePage();
    homePage.clickRemovefromHomePage();
    homePage.navigateToCart();
    cartPage.verifyThatProductIsNotCar();

}
@Test
public void verifyAdProductFromPdp(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ChartPage cartPage = new ChartPage(driver);
    ProcuctDetailPage pdp = new ProcuctDetailPage(driver);


    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.goToPdp();
    pdp.clickAddProductfromPDP();
    homePage.navigateToCart();
    cartPage.verifyThatProductIsInChar();
}
@Test
public void verifyRemoveProductFromPDP(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ChartPage cartPage = new ChartPage(driver);
    ProcuctDetailPage pdp = new ProcuctDetailPage(driver);


    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.goToPdp();
    pdp.clickAddProductfromPDP();
    pdp.clickRemovefromPDP();
    cartPage.verifyThatProductIsNotCar();




}










}