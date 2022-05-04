package utimateqa_com.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import utimateqa_com.pages.HomePage;
import utimateqa_com.pages.LoginPage;
import utimateqa_com.testbase.TestBase;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){

        loginPage.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = loginPage.getWelcomeBackText();
       Assert.assertEquals(actualMessage,expectedMessage,"Login page not displayed");
    }

    @Test
    public void verifyTheErrorMessage(){
        loginPage.clickOnSignInLink();
        loginPage.EnterInvalidUsername("nakranijalpa198@gmail.com");
        loginPage.EnterInvalidPassword("Jalpa123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Invalid email or password.";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( actualErrorMessage,expectedErrorMessage,"Error message not displayed");
    }

}
