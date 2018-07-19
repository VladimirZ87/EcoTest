package pages;

import framework.Helper;
import framework.Page;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.util.List;
import javafx.scene.shape.MoveTo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IndexSliderPage extends Page {

    WebDriver driver;

    private void clickOnChangeOrderButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/button[2]"));
    }

    private void clickOnAddIndexSlideButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/a"));
    }

    private void clickOnEditIndexSlidesButton(WebElement row) {
        WebElement editButton = row.findElement(By.cssSelector("a[title='edit']"));
        editButton.click();
    }

    private void clickOnEnableButton() {
        clickOnElement(By.cssSelector("button[title='enable']"));
    }

    private void clickOnDisableButton() {
        clickOnElement(By.cssSelector("button[title='disable']"));
    }

    private void clickOnDeleteIndexSlideButton(WebElement row) {
        WebElement deleteButton = row.findElement(By.cssSelector("button[title='delete']"));
        deleteButton.click();
    }

    private void clickOnSaveButton() {
        clickOnElement(By.id("new_indexSlide_submit"));
    }

    private void clickOnConfirmeDeleteButton() {
        clickOnElement(By.xpath("//*[@id=\"delete-warning-dialog\"]/div/div/div[3]/button[2]"));
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

    private void dragAndDropFirstRow(WebDriver driver) {
        Actions builder = new Actions(driver);
        Actions dragAndDrop = builder.clickAndHold(chooseFirstItem());
        dragAndDrop.moveToElement(chooseRandomItem());
        dragAndDrop.release();
        dragAndDrop.build();
        dragAndDrop.perform();
    }

    private void dragAndDropLastRow(WebDriver driver) {
        Actions builder = new Actions(driver);
        Actions dragAndDrop = builder.clickAndHold(chooseFirstItem());
        dragAndDrop.moveToElement(chooseRandomItem());
        dragAndDrop.release();
        dragAndDrop.build();
        dragAndDrop.perform();
    }

    public void confirmDragAndDropFirstRow() {
        clickOnChangeOrderButton();
        dragAndDropFirstRow(driver);
    }

    public void confirmDragAndDropLastRow() {
        clickOnChangeOrderButton();
        dragAndDropLastRow(driver);
    }

    private void sendTextOnTitleField() {
        sendTextOnField(By.id("title"), Helper.getRandomText());
    }

    private void sendTextOnTitleFieldWithClear() {
        WebElement titleField = driver.findElement(By.id("title"));
        titleField.clear();
        titleField.sendKeys(Helper.getRandomText());
    }

    private void sendTextOnDescriptionField() {
        sendTextOnField(By.id("title"), Helper.getRandomText());
    }

    private void chooseLinkType() {
        WebElement typeRow = waitForElementVisibility(By.id("link_type"));
        Select rowType = new Select(typeRow);
        rowType.selectByValue("InternalLink");
    }
    
    private void createLinkLabel(){
        sendTextOnField(By.id("link_label"), Helper.getRandomText());
    }
    
    private void createExternalLinkUrl(){
        sendTextOnField(By.id("internal_link_url"), Helper.getRandomUrl());
    }

    
    private void addPhoto() {
        WebElement UploadImg = waitForElementVisibility(By.id("index_slide_photo"));
        UploadImg.sendKeys("C:/Users/SmartPC/Desktop/Bledaooo/7.jpg");
    }

    private void editPhoto() {
        WebElement UploadingImg1 = waitForElementVisibility(By.id("index_slide_photo"));
        UploadingImg1.sendKeys("C:/Users/SmartPC/Desktop/Bledaooo/13.jpg");
    }

    public void addIndexSlide() {
        clickOnAddIndexSlideButton();
        sendTextOnTitleField();
        sendTextOnDescriptionField();
        chooseLinkType();
        createLinkLabel();
        createExternalLinkUrl();
        addPhoto();
        clickOnSaveButton();
    }

    public void editFirstIndexSlide() {
        WebElement firstRow = chooseFirstItem();
        clickOnEditIndexSlidesButton(firstRow);
        sendTextOnField(By.id("title"));
        sendTextOnDescriptionField();
        editPhoto();
        clickOnSaveButton();
    }

    public void editLastIndexSlide() {
        WebElement lastRow = chooseLastItem();
        clickOnEditIndexSlidesButton(lastRow);
        sendTextOnField(By.id("title"));
        sendTextOnDescriptionField();
        editPhoto();
        clickOnSaveButton();
    }

    public void editRandomIndexSlide() {
        WebElement randomRow = chooseRandomItem();
        clickOnEditIndexSlidesButton(randomRow);
        sendTextOnField(By.id("title"));
        sendTextOnDescriptionField();
        editPhoto();
        clickOnSaveButton();
    }

    public void deleteFirstIndexSlide() {
        WebElement firstRow = chooseFirstItem();
        clickOnDeleteIndexSlideButton(firstRow);
        clickOnConfirmeDeleteButton();
    }

    public void deleteLastIndexSlide() {
        WebElement lastRow = chooseLastItem();
        clickOnDeleteIndexSlideButton(lastRow);
        clickOnConfirmeDeleteButton();
    }

    public void deleteRandomIndexSlide() {
        WebElement randomRow = chooseRandomItem();
        clickOnDeleteIndexSlideButton(randomRow);
        clickOnConfirmeDeleteButton();
    }
}
