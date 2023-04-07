package tests;

import org.junit.Test;

import pages.ChartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProcuctDetailPage;

public class CartTest extends BaseTest{
    


@Test
public void validatenNavigateFromCartToHP(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ChartPage cartPage = new ChartPage(driver);
    ProcuctDetailPage pdp = new ProcuctDetailPage(driver);


    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.goToPdp();
    pdp.clickAddProductfromPDP();
    homePage.navigateToCart();
    cartPage.navigteToHPfromCart();
    homePage.checkIfuserIsonHomePage();

}
@Test
public void validateNavigateFromCartToPLP(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ChartPage cartPage = new ChartPage(driver);
    ProcuctDetailPage pdp = new ProcuctDetailPage(driver);


    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.goToPdp();
    pdp.clickAddProductfromPDP();
    homePage.navigateToCart();
    cartPage.navigateToPDPfromCart();
    pdp.verifyIfUserIsOnPdp();
    }

@Test
public void checkRemoveFromCart(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ChartPage cartPage = new ChartPage(driver);
    ProcuctDetailPage pdp = new ProcuctDetailPage(driver);


    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.goToPdp();
    pdp.clickAddProductfromPDP();
    homePage.navigateToCart();
    cartPage.removefromCart();
    cartPage.verifyThatProductIsNotInCart();

    }
    @Test
    public void goToCheckout(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ChartPage cartPage = new ChartPage(driver);
    ProcuctDetailPage pdp = new ProcuctDetailPage(driver);


    loginPage.goToBaseUrl();
    loginPage.login(username, password);
    homePage.goToPdp();
    pdp.clickAddProductfromPDP();
    homePage.navigateToCart();
    cartPage.clickonCheckout();


    }


}
