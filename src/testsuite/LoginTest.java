package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Write down the following test in the ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully()
 *  click on the ‘Login’ link
 *  Verify the text ‘Welcome, Please Sign In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials()
 *  click on the ‘Login’ link
 *  Enter a valid username
 *  Enter a valid password
 *  Click on the ‘Login’ button
 *  Verify the ‘Welcome to our store’ text is displayed
 * 3. verifyTheErrorMessage()
 *  click on the ‘Login’ link
 *  Enter the invalid username
 *  Enter the invalid password
 *  Click on the ‘Login’ button
 *  Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

public class LoginTest extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        driver.findElement(By.className("ico-login")).click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1"));
        String actualText = welcomeText.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("greatmigrationuk@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Pk@123456");
        driver.findElement(By.className("login-button")).click();
        String expectedText = "Welcome to our store";
        String actualText = driver.findElement(By.className("topic-html-content-header")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyTheErrorMessage() {
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("123456");
        driver.findElement(By.className("login-button")).click();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.";
        String actualText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")).getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
