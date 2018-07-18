package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PhotoGalleriesPage extends Page {

    private void clickOnChangeOrderButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/button[2]"));
    }

    private void clickOnAddPhotoGalleriesButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/a"));
    }

    private void clickOnEditPhotoGalleriesButton(WebElement row) {
        WebElement editButton = row.findElement(By.cssSelector("a[title='edit']"));
        editButton.click();
    }

    private void clickOnEnableButton() {
        clickOnElement(By.cssSelector("button[title='enable']"));
    }

    private void clickOnDisableButton() {
        clickOnElement(By.cssSelector("button[title='disable']"));
    }

    private void clickOnDeletePhotoGalleriesButton(WebElement row) {
        WebElement deleteButton = row.findElement(By.cssSelector("button[title='delete']"));
        deleteButton.click();
    }

    private void clickOnSaveButton() {
        clickOnElement(By.id("new_photoGallery_submit"));
    }
    
    private void clickToSaveChanges(){
        clickOnElement(By.id("new_photoGallery_submit"));
    }

    private void clickOnConfirmeDeleteButton() {
        clickOnElement(By.xpath("//*[@id=\"delete-warning-dialog\"]/div/div/div[3]/button[2]"));
    }

        private void clickOnPreviewButton(WebElement row) {
            WebElement previewButton = row.findElement(By.cssSelector("a[title='preview']"));
            previewButton.click();
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

    private void sendTextOnTitleField() {
        sendTextOnField(By.id("title"), Helper.getRandomText());
    }

//    private void sendTextOnTitleFieldWithClear() {
//        WebElement titleField = driver.findElement(By.id("title"));
//        titleField.clear();
//        titleField.sendKeys(Helper.getRandomText());
//    }
    private void sendTextOnDescriptionField() {
        sendTextOnField(By.id("description"), Helper.getRandomText());
    }

    private void chooseLinkType() {
        WebElement typeRow = waitForElementVisibility(By.id("link_type"));
        Select rowType = new Select(typeRow);
        rowType.selectByValue("NoLink");
    }

    private void addPhoto() {
        WebElement UploadImg = waitForElementVisibility(By.id("photo_gallery_leading_photo"));
        UploadImg.sendKeys("C:/Users/SmartPC/Desktop/Bledaooo/7.jpg");
    }

    private void editPhoto() {
        WebElement UploadingImg1 = waitForElementVisibility(By.id("photo_gallery_leading_photo"));
        UploadingImg1.sendKeys("C:/Users/SmartPC/Desktop/Bledaooo/5.jpg");
    }

    private void sentTextOnTitleFieldWithClear(WebDriver driver) {
        WebElement titleField = driver.findElement(By.id("title"));
        titleField.clear();
        titleField.sendKeys(Helper.getRandomText());
    }

    public void addPhotoGaleryItem() {
        clickOnAddPhotoGalleriesButton();
        sendTextOnTitleField();
        sendTextOnDescriptionField();
        editPhoto();
        clickOnSaveButton();
        clickToSaveChanges();
    }

    public void previewRandomImage() {
        WebElement row = chooseRandomItem();
        clickOnPreviewButton(row);
    }

    public void editFirstPhotoGaleryItem() {
        WebElement firstRow = chooseFirstItem();
        clickOnEditPhotoGalleriesButton(firstRow);
        sendTextOnField(By.id("title"));
        sendTextOnDescriptionField();
        editPhoto();
        clickOnSaveButton();

    }

    public void editLastPhotoGaleryItem() {
        WebElement lastRow = chooseLastItem();
        clickOnEditPhotoGalleriesButton(lastRow);
        sendTextOnField(By.id("title"));
        sendTextOnDescriptionField();
        editPhoto();
        clickOnSaveButton();
    }

    public void editRandomPhotoGaleryItem() {
        WebElement randomRow = chooseRandomItem();
        clickOnEditPhotoGalleriesButton(randomRow);
        sendTextOnField(By.id("title"));
        sendTextOnDescriptionField();
        editPhoto();
        clickOnSaveButton();
    }

    public void deleteFirstPhotoGaleryItem() {
        WebElement firstRow = chooseFirstItem();
        clickOnDeletePhotoGalleriesButton(firstRow);
        clickOnConfirmeDeleteButton();
    }

    public void deleteLastPhotoGaleryItem() {
        WebElement lastRow = chooseLastItem();
        clickOnDeletePhotoGalleriesButton(lastRow);
        clickOnConfirmeDeleteButton();
    }

    public void deleteRandomPhotoGaleryItem() {
        WebElement randomRow = chooseRandomItem();
        clickOnDeletePhotoGalleriesButton(randomRow);
        clickOnConfirmeDeleteButton();
    }

    public void previewRandomGalleryPhoto() {
        WebElement randomRow = chooseRandomItem();
        clickOnPreviewButton(randomRow);
    }

}
