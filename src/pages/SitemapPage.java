package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SitemapPage extends Page {

    private void clickOnChangeOrderButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/button[2]"));
    }

    private void clickOnAddSitemapPageButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/a"));
    }

    private void clickOnPreviewButton(WebElement row) {
        WebElement previewButton = row.findElement(By.cssSelector("a[title='preview']"));
        previewButton.click();
    }

    private void clickOnEditSitemapPageButton(WebElement row) {
        WebElement editButton = row.findElement(By.cssSelector("a[title='edit']"));
        editButton.click();
    }

    private void clickOnEnableButton() {
        clickOnElement(By.cssSelector("button[title='enable']"));
    }

    private void clickOnDisableButton() {
        clickOnElement(By.cssSelector("button[title='disable']"));
    }

    private void clickOnDeleteSitemapPageButton(WebElement row) {
        WebElement deleteButton = row.findElement(By.cssSelector("button[title='delete']"));
        deleteButton.click();
    }

    private void clickOnConfirmeDeleteButton() {
        clickOnElement(By.xpath("//*[@id=\"delete-warning-dialog\"]/div/div/div[3]/button[2]"));
    }

    private void clickOnSaveButton() {
        clickOnElement(By.id("new_sitemapPage_submit"));
    }

    private void chooseSitemapPageType() {
        WebElement typeRow = waitForElementVisibility(By.id("type"));
        Select rowType = new Select(typeRow);
        rowType.selectByValue("StaticPage");
    }

    private void chooseEditSitemapPageType() {
        WebElement typeRow = waitForElementVisibility(By.id("type"));
        Select rowType = new Select(typeRow);
        rowType.selectByValue("AboutPage");
    }

    private void sendTextToShortTitleField() {
        sendTextOnField(By.id("short_title"), Helper.getRandomText());
    }

    private void sendTextToUrlSlugField() {
        sendTextOnField(By.id("url_slug"), Helper.getRandomUrl());
    }

    private void sendTextOnTitleField() {
        sendTextOnField(By.id("title"), Helper.getRandomText());
    }

    private void sendTextOnDescriptionField() {
        sendTextOnField(By.id("description"), Helper.getRandomText());
    }

    private List<WebElement> getRowsFromTable() {
        WebElement tBody = waitForElementVisibility(By.xpath("//*[@id=\"rows-table\"]/tbody"));
        List<WebElement> rows = tBody.findElements(By.tagName("tr"));
        return rows;
    }

    private WebElement chooseFirstItem() {
        List<WebElement> rows = getRowsFromTable();
        WebElement firstRow = rows.get(0);
        return firstRow;
    }

    private WebElement chooseLastItem() {
        List<WebElement> rows = getRowsFromTable();
        WebElement lastRow = rows.get(rows.size() - 1);
        return lastRow;
    }

    private WebElement chooseRandomItem() {
        List<WebElement> rows = getRowsFromTable();
        WebElement randomRow = rows.get(Helper.getRandomInteger(rows.size()));
        return randomRow;
    }

    public void addSitemapPage() {
        clickOnAddSitemapPageButton();
        chooseSitemapPageType();
        sendTextToShortTitleField();
        sendTextToUrlSlugField();
        sendTextOnTitleField();
        sendTextOnDescriptionField();
        clickOnSaveButton();
    }

    public void previewRandomSitemapPage() {
        WebElement randomRow = chooseRandomItem();
        clickOnPreviewButton(randomRow);
    }

    public void editFirstSitemapPage() {
        WebElement firstRow = chooseFirstItem();
        clickOnEditSitemapPageButton(firstRow);
        chooseEditSitemapPageType();
        sendTextToShortTitleField();
        sendTextToUrlSlugField();
        sendTextOnTitleField();
        sendTextOnDescriptionField();
        clickOnSaveButton();
    }
    
     public void editLastSitemapPage() {
        WebElement lastRow = chooseLastItem();
        clickOnEditSitemapPageButton(lastRow);
        chooseEditSitemapPageType();
        sendTextToShortTitleField();
        sendTextToUrlSlugField();
        sendTextOnTitleField();
        sendTextOnDescriptionField();
        clickOnSaveButton();
    }
    
      public void editRandomSitemapPage() {
        WebElement randomRow = chooseRandomItem();
        clickOnEditSitemapPageButton(randomRow);
        chooseEditSitemapPageType();
        sendTextToShortTitleField();
        sendTextToUrlSlugField();
        sendTextOnTitleField();
        sendTextOnDescriptionField();
        clickOnSaveButton();
    }
    
      public void deleteFirstSitemapPage(){
          WebElement firstRow = chooseFirstItem();
          clickOnDeleteSitemapPageButton(firstRow);
          clickOnConfirmeDeleteButton();
      }
      
      public void deleteLastSitemapPage(){
          WebElement lastRow = chooseLastItem();
          clickOnDeleteSitemapPageButton(lastRow);
          clickOnConfirmeDeleteButton();
      }
      
      public void deleteRandomSitemapPage(){
          WebElement randomRow = chooseRandomItem();
          clickOnDeleteSitemapPageButton(randomRow);
          clickOnConfirmeDeleteButton();
      }
}
