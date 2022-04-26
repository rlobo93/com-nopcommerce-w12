package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {

    //base Url
    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setupIt() {
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find log in link and click log in
        clickOnElement(By.linkText("Log in"));


        // verification of the message
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"), "Welcome, Please Sign In!");

    }


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find log in link and click log in
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));


        //find email field and enter email address
        sendTextToElement(By.id("Email"),"rlobo@gmail.co.uk");

        //find password field amd enter password
        sendTextToElement(By.id("Password"),"rlobo123");


        //find login button and click it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        // * Verify the ‘Log out’ text is display
        verifyExpectedAndActual(By.linkText("Log out"),"Log out");
    }


    @Test
    public void verifyTheErrorMessage() {
        //Find log in link and click log in
        clickOnElement(By.xpath("//a[contains(text(),'Log in')]"));


        //find email field and enter email address
        sendTextToElement(By.id("Email"),"rlobo@gmail.co.uk");

        //find password field amd enter password
        sendTextToElement(By.id("Password"),"rlobo123?");

        //find login button and click it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));


        // Expcted error message

//        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
//                "No customer account found";




        verifyExpectedAndActual(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"), "Login was unsuccessful. Please correct the errors and try again.\n" +
                                "No customer account found");


    }


    @After
    public void tearDown() {
        closeBrowser();
    }


}
