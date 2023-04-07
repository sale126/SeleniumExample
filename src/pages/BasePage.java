package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;


    public BasePage(WebDriver driver){
        this.driver = driver; //ovo this se odnosi na promenljivu
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));//kreiramo novi objekat klase WebDriverWait
    }
    //samo sacekaj da element bude klikabilan
        public void waitClickable(By elementBy){
            wait.until(
                ExpectedConditions.elementToBeClickable(elementBy));
        }
        //samo sacekaj da element budevidlji
        public void waitVisible(By elementBy){
            wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
        }

    public void writeText(By elementBy, String text) {
        waitClickable(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);

    }

//prvo cemo da sacekamo da element bude klikabilan a onda klikni na njega
    public void click(By elementBy){
        waitClickable(elementBy);
        driver.findElement(elementBy).click();

    }

    //sacekaj da element bude vidljiv a onda iscitaj tekst sa njega
    public String readText(By elementBy){
    waitVisible(elementBy);
    return driver.findElement(elementBy).getText();
    }   
    //metoda koja poredi dva stringa da li su jednaka
    public void checkIfTextIsTheSame(String expectedText, String foundText){
        Assert.assertEquals(expectedText, foundText);
    }

    //metoda koja proverava da li je element vidljiv

    public void checkIfElementIsVisible(By elementBy){
        waitVisible(elementBy);
        boolean isVisible = driver.findElement(elementBy).isDisplayed();
        Assert.assertTrue(isVisible);
    }

    //metoda koja vraca broj elemenata
    public int countItems(By elementBy){
        waitVisible(elementBy);
        return driver.findElements(elementBy).size();

    }
    // int Eguals metoda koja poredi dali su dva intigeri jednaka
    public void checkIfNumberIsTheSame(int expextedint, int foundInt){
        Assert.assertEquals(expextedint, foundInt);
    }
    //metoda koja treba da iscita href parametar sa elementa
    public String readHref(By elementBy){
        waitVisible(elementBy);
        return driver.findElement(elementBy).getAttribute("href");
    }
    //metoda koja ce odabrati vrednost iz padajuce liste po vrednosti

    public void selectDropdownOptionByValue(By elementBy, String value){
        waitVisible(elementBy);
        Select select = new Select(driver.findElement(elementBy));
        select.selectByValue(value);
        
    }
    //metoda koja proverava da li su dva broja ista topa double
    public void checkIfNumberIsTheSame(double expectedNum, double foundNum){
        Assert.assertEquals(expectedNum, foundNum, 0.1);
    }
        //metoda koja ce string pokusati da pretvori u double
    public double parseStringToDouble(String stringToParse){
        return Double.parseDouble(stringToParse);

    }
    //metoda koja proverava da li element Nije vidljiv
    public void verifyElementNotDisplayed(By elementBy){
        boolean isNotVisible;

        try{
            waitVisible(elementBy);
            isNotVisible = !driver.findElement(elementBy).isDisplayed();

        }
        catch(Exception e){
            isNotVisible = true;
        }
        Assert.assertTrue(isNotVisible);

    }



} 