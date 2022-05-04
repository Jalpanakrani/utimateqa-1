package utimateqa_com.pages;



import org.openqa.selenium.By;
import utimateqa_com.utility.Utility;

public class HomePage extends Utility {

     By SignInLink = By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]");


    public void clickOnSignInLink(){
      clickOnElement(SignInLink);
    }

}
