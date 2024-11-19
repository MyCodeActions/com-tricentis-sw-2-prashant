package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

/**
 * Write down the following test in the ‘TopMenuTest’ class
 * 1. userShouldNavigateToComputerPageSuccessfully()
 *  click on the ‘COMPUTERS’ Tab
 *  Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully()
 *  click on the ‘ELECTRONICS’ Tab
 *  Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelAndShoesPageSuccessfully()
 *  click on the ‘APPAREL & SHOES’ Tab
 *  Verify the text ‘Apparel & Shoes’
 * 4. userShouldNavigateToDigitalDownloadsPageSuccessfully()
 *  click on the ‘DIGITAL DOWNLOADS’ Tab
 *  Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully()
 *  click on the ‘BOOKS’ Tab
 *  Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully()
 *  click on the ‘JEWELRY’ Tab
 *  Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully()
 *  click on the ‘GIFT CARDS’ Tab
 *  Verify the text ‘Gift Cards’
 */

public class TopMenuTest extends BaseTest {


    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")).click();
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")).getText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);
    }


    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")).click();
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")).getText();
        String expectedText = "Electronics";
        Assert.assertEquals(actualText, expectedText);
    }


    @Test
    public void userShouldNavigateToApparelAndShoesPageSuccessfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")).click();
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")).getText();
        String expectedText = "Apparel & Shoes";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")).click();
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")).getText();
        String expectedText = "Digital downloads";
        Assert.assertEquals(actualText, expectedText);
    }


    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")).getText();
        String expectedText = "Books";
        Assert.assertEquals(actualText, expectedText);
    }


    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")).click();
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")).getText();
        String expectedText = "Jewelry";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")).click();
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")).getText();
        String expectedText = "Gift Cards";
        Assert.assertEquals(actualText, expectedText);
    }

    @After
    public void tearDown() {
        closeBrowser();

    }


}
