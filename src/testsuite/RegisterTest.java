package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

/**
 * Write down the following test in the ‘RegisterTest’ class
 * 1. userShouldNavigateToRegisterPageSuccessfully()
 *  click on the ‘Register’ link
 *  Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully
 *  click on the ‘Register’ link
 *  Select the gender radio button
 *  Enter the First name
 *  Enter the Last name
 *  Enter Email address
 *  Enter Password
 *  Enter Confirm password
 *  Click on the ‘Register’ button
 *  Verify the text 'Your registration completed’
 */
public class RegisterTest extends BaseTest {


    String baseUrl = "https://demowebshop.tricentis.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.className("ico-register")).click();
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        String expectedText = "Register";
        Assert.assertEquals(actualText, expectedText);
    }


    @Test
    public void userSholdRegisterAccountSuccessfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Prashant");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.name("Email")).sendKeys("Patel765@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        driver.findElement(By.name("register-button")).click();
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}





