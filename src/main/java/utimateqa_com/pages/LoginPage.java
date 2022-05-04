package utimateqa_com.pages;


import org.openqa.selenium.By;
import utimateqa_com.utility.Utility;


public class LoginPage extends Utility {

    By WelcomeBackText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By EnterInvalidUsername = By.id("user[email]");
    By EnterInvalidPassword = By.id("user[password]");
    By loginButton = By.className("button button-primary g-recaptcha");
    By geterrorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");
    By SignInLink = By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]");

    public String getWelcomeBackText(){
        return getTextFromElement(WelcomeBackText);
    }

    public void EnterInvalidUsername(String email){

        sendTextToElement(EnterInvalidUsername,email);
    }

    public void EnterInvalidPassword(String password){
        sendTextToElement(EnterInvalidPassword,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(geterrorMessage);
    }

    public void clickOnSignInLink(){ clickOnElement(SignInLink);

    }}
