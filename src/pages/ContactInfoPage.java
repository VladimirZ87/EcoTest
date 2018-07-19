package pages;

import com.sun.jndi.toolkit.ctx.HeadTail;
import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactInfoPage extends Page {

    private void clickOnAddNewContactInfo() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/a"));
    }

    private void clickOnPreviewButton(WebElement row) {
        WebElement previewButton = row.findElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[12]/div/a[1]/i"));
        previewButton.click();
    }

    private void clickOnEditButton(WebElement row) {
        WebElement editButton = row.findElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[12]/div/a[2]/i"));
        editButton.click();
    }

    private void clickOnDeleteButton(WebElement row) {
        WebElement deleteButton = row.findElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[12]/div/button[2]/i"));
        deleteButton.click();
    }
    
    private void clickOnConfirmDeleteButton() {
        clickOnElement(By.xpath("//*[@id=\"delete-warning-dialog\"]/div/div/div[3]/button[2]"));
    }

    private void sendTextToLocationField() {
        sendTextOnField(By.id("location"), Helper.getRandomText());
    }

    private void sendTextToAddressFIeld() {
        sendTextOnField(By.id("address"), Helper.getRandomText());
    }

    private void sendNumberToAddressNumberField() {
        sendTextOnField(By.id("address_number"), Helper.getRandomAddressNumber());
    }

    private void sendNumberToHoursField() {
        sendTextOnField(By.id("hours"), Helper.getWorkingHours());
    }

    private void sendNumberToLatitudeField() {
        sendTextOnField(By.id("latitude"), Helper.getRandomLatitude());
    }

    private void sendNumberToLongitudeField() {
        sendTextOnField(By.id("longitude"), Helper.getRandomLongitude());
    }

    private void sendNumberToPhonenumberField() {
        sendTextOnField(By.id("phone"), Helper.getRandomPhoneNumber());
    }

    private void sendTextToEmailField() {
        sendTextOnField(By.id("email"), Helper.getRandomEmail());
    }

    private void sendNumberToZoomField() {
        sendTextOnField(By.id("zoom"), Helper.getRandomZoomNumber());
    }

    private void clickOnSaveButton() {
        clickOnElement(By.id("new_portfolio_submit"));
    }

    private List<WebElement> getRowsFromTable() {
        WebElement tBody = waitForElementVisibility(By.xpath("//*[@id=\"rows-table\"]/tbody"));
        List<WebElement> rows = tBody.findElements(By.tagName("tr"));
        return rows;
    }

    private WebElement chooseFirstRow() {
        List<WebElement> rows = getRowsFromTable();
        WebElement firstRow = rows.get(0);
        return firstRow;
    }

    private WebElement chooseLastRow() {
        List<WebElement> rows = getRowsFromTable();
        WebElement lastRow = rows.get(rows.size() - 1);
        return lastRow;
    }

    private WebElement chooseRandomRow() {
        List<WebElement> rows = getRowsFromTable();
        WebElement randomRow = rows.get(Helper.getRandomInteger(rows.size()));
        return randomRow;
    }

    public void addNewContactInfo() {
        clickOnAddNewContactInfo();
        sendTextToLocationField();
        sendTextToAddressFIeld();
        sendNumberToAddressNumberField();
        sendNumberToHoursField();
        sendNumberToLatitudeField();
        sendNumberToLongitudeField();
        sendNumberToPhonenumberField();
        sendTextToEmailField();
        sendNumberToZoomField();
        clickOnSaveButton();
    }

    public void previewFirstContactInfo() {
        WebElement firstRow = chooseFirstRow();
        clickOnPreviewButton(firstRow);
    }

    public void previewLastContactInfo() {
        WebElement lastRow = chooseLastRow();
        clickOnPreviewButton(lastRow);
    }

    public void previewRandomContactInfo() {
        WebElement randomRow = chooseRandomRow();
        clickOnPreviewButton(randomRow);
    }

    public void editFirstContactInfo() {
        WebElement firstRow = chooseFirstRow();
        clickOnEditButton(firstRow);
        sendTextToLocationField();
        sendTextToAddressFIeld();
        sendNumberToAddressNumberField();
        sendNumberToHoursField();
        sendNumberToLatitudeField();
        sendNumberToLongitudeField();
        sendNumberToPhonenumberField();
        sendTextToEmailField();
        sendNumberToZoomField();
        clickOnSaveButton();
    }

    public void editLastContactInfo() {
        WebElement lastRow = chooseLastRow();
        clickOnEditButton(lastRow);
        sendTextToLocationField();
        sendTextToAddressFIeld();
        sendNumberToAddressNumberField();
        sendNumberToHoursField();
        sendNumberToLatitudeField();
        sendNumberToLongitudeField();
        sendNumberToPhonenumberField();
        sendTextToEmailField();
        sendNumberToZoomField();
        clickOnSaveButton();
    }

    public void editRandomContactInfo() {
        WebElement randomRow = chooseRandomRow();
        clickOnEditButton(randomRow);
        sendTextToLocationField();
        sendTextToAddressFIeld();
        sendNumberToAddressNumberField();
        sendNumberToHoursField();
        sendNumberToLatitudeField();
        sendNumberToLongitudeField();
        sendNumberToPhonenumberField();
        sendTextToEmailField();
        sendNumberToZoomField();
        clickOnSaveButton();
    }

    public void deleteFirstContactInfo() {
        WebElement firstRow = chooseFirstRow();
        clickOnDeleteButton(firstRow);
        clickOnConfirmDeleteButton();
    }
    
    public void deleteLastContactInfo() {
        WebElement lastRow = chooseLastRow();
        clickOnDeleteButton(lastRow);
        clickOnConfirmDeleteButton();
    }
    
    public void deleteRandomContactInfo() {
        WebElement randomRow = chooseRandomRow();
        clickOnDeleteButton(randomRow);
        clickOnConfirmDeleteButton();
    }
}
