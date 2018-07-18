package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllPortfolios extends Page {

    private void clickOnAddPortfolioButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/a"));
    }

    private void clickOnPreviewButton(WebElement rows) {
        WebElement previewButton = rows.findElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[8]/div/a[1]"));
        previewButton.click();
    }

    private void clickOnEditButton(WebElement rows) {
        WebElement editButton = rows.findElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[8]/div/a[2]"));
        editButton.click();
    }

    private void clickOnDeleteButton(WebElement rows) {
        WebElement deleteButton = rows.findElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[8]/div/button[2]"));
        deleteButton.click();
    }

    private void clickOnSaveButton() {
        clickOnElement(By.id("new_portfolio_submit"));
    }

    private void clickOnDataCagtegoriesButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[2]/form/fieldset/div[2]/div[1]/span/div/button/span"));
    }

    private void sendTextToTitleField() {
        sendTextOnField(By.id("title"), Helper.getRandomText());
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

    private void sendTextOnEditTitleField() {
        sendTextOnField(By.xpath("//*[@id=\"title\"]"), Helper.getRandomText());
    }

    private void confirmDeleteButton() {
        waitForElementVisibility(By.xpath("//*[@id=\"delete-warning-dialog\"]/div/div/div[3]/button[2]")).click();
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

    private List<WebElement> getRowsFromTbodyTable() {
        WebElement tBody = waitForElementVisibility(By.xpath("//*[@id=\"rows-table\"]/tbody"));
        List<WebElement> rows = tBody.findElements(By.tagName("tr"));
        return rows;
    }

    private WebElement chooseFirstRow() {
        List<WebElement> rows = getRowsFromTbodyTable();
        WebElement firstRow = rows.get(0);
        return firstRow;
    }

    private WebElement chooseLastRow() {
        List<WebElement> rows = getRowsFromTbodyTable();
        WebElement lastRow = rows.get(rows.size() - 1);
        return lastRow;
    }

    private WebElement chooseRandomRow() {
        List<WebElement> rows = getRowsFromTbodyTable();
        WebElement randomRow = rows.get(Helper.getRandomInteger(rows.size()));
        return randomRow;
    }

    public void addNewPortfolio() {
        clickOnAddPortfolioButton();
        sendTextToTitleField();
        clickOnDataCagtegoriesButton();
        chooseRandomDataCategories();
        sendTextToCharacteristic1Field();
        sendTextToCharacterostic2Field();
        sendTextToDescriptionField();
        addPhoto();
        clickOnSaveButton();
    }

    public void previewFistPortfolio() {
        WebElement firstRow = chooseFirstRow();
        clickOnPreviewButton(firstRow);
    }

    public void previewLastPortfolio() {
        WebElement lastRow = chooseLastRow();
        clickOnPreviewButton(lastRow);
    }

    public void previewRandomPortfolio() {
        WebElement randomRow = chooseRandomRow();
        clickOnPreviewButton(randomRow);
    }

    public void editFirstPortfolio() {
        WebElement firstRow = chooseFirstRow();
        clickOnEditButton(firstRow);
        sendTextOnEditTitleField();
        clickOnDataCagtegoriesButton();
        chooseRandomDataCategories();
        sendTextToCharacteristic1Field();
        sendTextToCharacterostic2Field();
        sendTextToDescriptionField();
        addPhoto();
        clickOnSaveButton();
    }
    
      public void editLastPortfolio() {
        WebElement lastRow = chooseLastRow();
        clickOnEditButton(lastRow);
        sendTextOnEditTitleField();
        clickOnDataCagtegoriesButton();
        chooseRandomDataCategories();
        sendTextToCharacteristic1Field();
        sendTextToCharacterostic2Field();
        sendTextToDescriptionField();
        addPhoto();
        clickOnSaveButton();
    }
      
        public void editRandomPortfolio() {
        WebElement randomRow = chooseRandomRow();
        clickOnEditButton(randomRow);
        sendTextOnEditTitleField();
        clickOnDataCagtegoriesButton();
        chooseRandomDataCategories();
        sendTextToCharacteristic1Field();
        sendTextToCharacterostic2Field();
        sendTextToDescriptionField();
        addPhoto();
        clickOnSaveButton();
    }
        
        public void deleteFirstPortfolio(){
            WebElement firstRow = chooseFirstRow();
            clickOnDeleteButton(firstRow);
            confirmDeleteButton();
        }
        
         public void deleteLastPortfolio(){
            WebElement lastRow = chooseLastRow();
            clickOnDeleteButton(lastRow);
            confirmDeleteButton();
        }
         
          public void deleteRandomPortfolio(){
            WebElement randomRow = chooseRandomRow();
            clickOnDeleteButton(randomRow);
            confirmDeleteButton();
        }
}
