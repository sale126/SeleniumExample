package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {
        String emptyUserNameError = "Epic sadface: Username is required";
        String emptyPasswordNameError = "Epic sadface: Password is required";
        String invalidUserError = "Username and password do not match any user in this service";
        String lockedUserError = "Epic sadface: Sorry, this user has been locked out.";
        String lockedUser = "locked_out_user";
        String invalidUser = "bilosta";
    @Test
    public void checkIfuserIsonHomePage(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(username, password);
        homePage.checkIfuserIsonHomePage();
    }
    @Test
    public void validateThatUserCannotLoginWitoutUsername(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", password);
        loginPage.checkLoginErrorMesage(emptyUserNameError);
    }
    @Test
    public void validThatUsercannotLoginWithoutPassword(){

    LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, "");
        loginPage.checkLoginErrorMesage(emptyPasswordNameError);   
     }
     @Test
     public void validateThatLockedUserCannotLogIn(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.goToBaseUrl();
        loginPage.login(lockedUser, password);
        loginPage.checkLoginErrorMesage(lockedUserError);

     }
     @Test
     public void validateThatWrongUsernameCannotLogIn(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToBaseUrl();
        loginPage.login(invalidUser, password);
        loginPage.checkLoginErrorMesage(invalidUserError);

     }
     


     }



