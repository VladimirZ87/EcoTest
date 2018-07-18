package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewPortfoliosPage extends Page {

    private void sendTextToFirstnameField() {
        sendTextOnField(By.id("title"), Helper.getRandomText());
    }

    private void clickOnDataCagtegoriesButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[2]/form/fieldset/div[2]/div[1]/span/div/button/span"));
    }
    
    private void clickOnSaveButton(){
        clickOnElement(By.id("new_portfolio_submit"));
    }
    
      private List<WebElement> getRowsFromTable() {
        WebElement body = waitForElementVisibility(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[2]/form/fieldset/div[2]/div[1]/span/div/ul"));
        List<WebElement> rows = body.findElements(By.tagName("li"));
        return rows;
    }

    private void chooseRandomDataCategories() {
        List<WebElement> rows = getRowsFromTable();
        WebElement randomRow = rows.get(Helper.getRandomInteger(rows.size()));
        randomRow.click();
    }
    
     private void sendTextToCharacteristic1Field() {
        sendTextOnField(By.xpath("//*[@id=\"characteristic1\"]"), Helper.getRandomText());
    }

    private void sendTextToCharacterostic2Field() {
        sendTextOnField(By.id("characteristic2"), Helper.getRandomText());
    }
    
     private void sendTextToDescriptionField() {
        sendTextOnField(By.id("description"), Helper.getRandomText());
    }

    private void addPhoto() {
        WebElement UploadImg = waitForElementVisibility(By.id("portfolio_photo"));
        UploadImg.sendKeys("C:/Users/SmartPC/Desktop/Bledaooo/7.jpg");
    }
    
    public void createNewPortfolio(){
        sendTextToFirstnameField();
        clickOnDataCagtegoriesButton();
        chooseRandomDataCategories();
        sendTextToCharacteristic1Field();
        sendTextToCharacterostic2Field();
        sendTextToDescriptionField();
        addPhoto();
        clickOnSaveButton();
    }

}
