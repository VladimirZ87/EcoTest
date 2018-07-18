
package pages;

import framework.Helper;
import framework.Page;
import org.openqa.selenium.By;


public class NewUserPage extends Page {
    
    
    private void sendTextOnUsernameField(){
        sendTextOnField(By.id("username"), Helper.getRandomText());
    }
    
    private void sendTextOnFirstnameField(){
        sendTextOnField(By.id("first_name"), Helper.getRandomText());
    }
    
    private void sendTextOnLastnameField(){
        sendTextOnField(By.id("last_name"), Helper.getRandomText());
    }
    
    private void sendTextOnEmailField(){
        sendTextOnField(By.id("email"), Helper.getRandomEmail());
    }
    
    private void clickOnSaveButton(){
        clickOnElement(By.id("new_user_submit"));
    }
    
    public void createNewUser(){
        sendTextOnUsernameField();
        sendTextOnFirstnameField();
        sendTextOnLastnameField();
        sendTextOnEmailField();
        clickOnSaveButton();
    }
}
