package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllUsersPage extends Page {

    private void clickOnAddUserButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/a"));
    }

    private void sendTextToUsernameField() {
        sendTextOnField(By.id("username"), Helper.getRandomText());
    }

    private void sendTextToFirstnameField() {
        sendTextOnField(By.id("first_name"), Helper.getRandomText());
    }

    private void sendTextToLastnameField() {
        sendTextOnField(By.id("last_name"), Helper.getRandomText());
    }

    private void sendTextToEmailField() {
        sendTextOnField(By.id("email"), Helper.getRandomEmail());
    }

    private void clickOnSaveButton() {
        clickOnElement(By.id("new_user_submit"));
    }

    private void clickOnEditAllUsersPageButton(WebElement row) {
        WebElement editButton = row.findElement(By.cssSelector("a[title='edit']"));
        editButton.click();
    }

    private void clickOnDisabledButton(WebElement row1) {
        WebElement disabledButton = row1.findElement(By.cssSelector("button[title='disabled']"));
        disabledButton.click();
    }

    private void clickOnEnableButton() {
        clickOnElement(By.cssSelector("button[title='enable']"));
    }

    private void clickOnConfirmDisabledButton() {
        clickOnElement(By.xpath("//*[@id=\"disable-warning-dialog\"]/div/div/div[3]/button[2]"));
    }

    private void clickOnDeleteAllUsersPageButton(WebElement row2) {
        WebElement deleteButton = row2.findElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[6]/div/button[2]"));
        deleteButton.click();
    }

    private void clickOnConfirmDeleteButton() {
        clickOnElement(By.xpath("//*[@id=\"delete-warning-dialog\"]/div/div/div[3]/button[2]"));
    }

    private void clickOnResetPasswordButton() {
        clickOnElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[6]/div/button[3]"));
    }

    private void clickOnConfirmResetPasswordButton() {
        clickOnElement(By.xpath("//*[@id=\"resetpassword-warning-dialog\"]/div/div/div[3]/button[2]"));
    }

    private List<WebElement> getRowsFromTable() {
        WebElement body = waitForElementVisibility(By.xpath("//*[@id=\"rows-table\"]/tbody"));
        List<WebElement> rows = body.findElements(By.tagName("tr"));
        System.out.println("Number of rows: " + rows.size());
        return rows;
    }

    private WebElement chooseFirstUser() {
        List<WebElement> rows = getRowsFromTable();
        WebElement firstRow = rows.get(0);
        return firstRow;
    }

    private WebElement chooseLastUser() {
        List<WebElement> rows = getRowsFromTable();
        WebElement lastRow = rows.get(rows.size() - 1);
        return lastRow;
    }

    private WebElement chooseRandomUser() {
        List<WebElement> rows = getRowsFromTable();
        WebElement randomRows = rows.get(Helper.getRandomInteger(rows.size()));
        return randomRows;
    }

    public void addUser() {
        clickOnAddUserButton();
        sendTextToUsernameField();
        sendTextToFirstnameField();
        sendTextToLastnameField();
        sendTextToEmailField();
        clickOnSaveButton();
    }

    public void editFirstUser() {
        WebElement firstRow = chooseFirstUser();
        clickOnEditAllUsersPageButton(firstRow);
        sendTextToUsernameField();
        sendTextToFirstnameField();
        sendTextToLastnameField();
        sendTextToEmailField();
        clickOnSaveButton();
    }

    public void editLastUser() {
        WebElement lastUser = chooseLastUser();
        clickOnEditAllUsersPageButton(lastUser);
        sendTextToUsernameField();
        sendTextToFirstnameField();
        sendTextToLastnameField();
        sendTextToEmailField();
        clickOnSaveButton();
    }

    public void editRandomUser() {
        WebElement randomUser = chooseRandomUser();
        clickOnEditAllUsersPageButton(randomUser);
        sendTextToUsernameField();
        sendTextToFirstnameField();
        sendTextToLastnameField();
        sendTextToEmailField();
        clickOnSaveButton();
    }

    public void deleteFirstUser() {
        WebElement firstRow = chooseFirstUser();
        clickOnDeleteAllUsersPageButton(firstRow);
        clickOnConfirmDeleteButton();
    }

    public void deleteLastUser() {
        WebElement lastRow = chooseLastUser();
        clickOnDeleteAllUsersPageButton(lastRow);
        clickOnConfirmDeleteButton();
    }

    public void deleteRandomUser() {
        WebElement randomRow = chooseRandomUser();
        clickOnDeleteAllUsersPageButton(randomRow);
        clickOnConfirmDeleteButton();
    }

    public void randomResetPassButton() {
        WebElement randomRow = chooseRandomUser();
        clickOnResetPasswordButton();
        clickOnConfirmResetPasswordButton();
    }

}
