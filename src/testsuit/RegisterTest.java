package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setupIt() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){

        //Find registration tab on the homepage and click it
        clickOnElement(By.linkText("Register"));

        //Verify the text ‘Register’
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Register')]"),"Register");

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() throws InterruptedException{

        //Find registration tab on the homepage and click it
        clickOnElement(By.linkText("Register"));
        Thread.sleep(100);

        //Select gender radio button
        clickOnElement(By.id("gender-male"));
        Thread.sleep(100);

        //Enter First name
        sendTextToElement(By.id("FirstName"),"Ron");
        Thread.sleep(100);

        //Enter Last name
        sendTextToElement(By.id("LastName"),"Jira");
        Thread.sleep(100);

        //select Date Of Birth Day
        selectByValueFromDropDown(By.name("DateOfBirthDay"),"28");
        Thread.sleep(100);

        //select Month
        selectByVisibleFromDropDown(By.name("DateOfBirthMonth"),"November");
//        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
//        selectMonth.selectByVisibleText("November");

        Thread.sleep(100);

        //select Year
        selectByValueFromDropDown(By.name("DateOfBirthYear"),"1993");
        Thread.sleep(100);

        //Enter Email address
        sendTextToElement(By.id("Email"),"rlobo@gmail.co.uk");
        Thread.sleep(100);

        //Enter Password
        sendTextToElement(By.id("Password"),"rlobo123");
        Thread.sleep(100);

        //Enter Confirm password
        sendTextToElement(By.id("ConfirmPassword"),"rlobo123");
        Thread.sleep(100);

        //Click on REGISTER button
        clickOnElement(By.id("register-button"));
        Thread.sleep(100);

        //Verify the text 'Your registration completed
        verifyExpectedAndActual(By.xpath("//div[contains(text(),'Your registration completed')]"),"Your registration completed");
        Thread.sleep(100);

        //click continue button
        clickOnElement(By.xpath("/a[contains(text(),'Continue')]"));

    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
