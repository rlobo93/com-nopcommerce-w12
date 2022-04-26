package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class TopMenuTest extends Utility {

    //base Url
    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //‘Computers’ Tab

        //Find Computers tab link and click it
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));

        //Verify the text ‘Computers’
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Computers')]"),"Computers");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully (){
        //‘Electronics’ Tab

        //Find Electronics tab link and click it
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));

        //Verify the text ‘Electronics’
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Electronics')]"),"Electronics");
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully (){
        //‘Apparel’ Tab

        //Find Apparel tab link and click it
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));

        //Verify the text ‘Apparel’
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Apparel')]"),"Apparel");
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully (){
        //‘Digital downloads’ Tab

        //Find Digital downloads tab link and click it
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));

        //Verify the text ‘Digital downloads’
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Digital downloads')]"),"Digital downloads");
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully (){
        //‘Books’ Tab

        //Find Digital downloads tab link and click it
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));

        // Verify the text ‘Books’
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Books')]"),"Books");
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //‘Jewelry’ Tab

        //Find Jewelry tab link and click it
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));

        // Verify the text ‘Jewelry’
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Jewelry')]"),"Jewelry");
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully (){
        //‘Gift Cards’ Tab

        //Find Gift Cards tab link and click it
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));

        // Verify the text ‘Gift Cards’
        verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Gift Cards')]"),"Gift Cards");
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
