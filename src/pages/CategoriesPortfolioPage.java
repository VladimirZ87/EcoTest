package pages;

import framework.Helper;
import framework.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesPortfolioPage extends Page {

    private void clickOnAddPortfolioButton() {
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div/div[1]/div/a"));
    }

    private void sendTextToNameField() {
        sendTextOnField(By.id("name"), Helper.getRandomText());
    }

    private void sendTextToResumeField() {
        sendTextOnField(By.id("description"), Helper.getRandomText());
    }

    private void clickOnSaveButton() {
        clickOnElement(By.id("new_category_submit"));
    }

    private void clickOnEditButton(WebElement rows) {
        WebElement editButton = rows.findElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[5]/div/a"));
        editButton.click();
    }

    private void clickOnDeleteButton(WebElement rows) {
        WebElement deleteButton = rows.findElement(By.xpath("//*[@id=\"rows-table\"]/tbody/tr[1]/td[5]/div/button[2]"));
        deleteButton.click();
    }

    private void clickToConfirmDelete() {
        clickOnElement(By.xpath("//*[@id=\"delete-warning-dialog\"]/div/div/div[3]/button[2]"));
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

    public void createNewPortfolio() {
        clickOnAddPortfolioButton();
        sendTextToNameField();
        sendTextToResumeField();
        clickOnSaveButton();
    }

    public void editFirstPortfolio() {
        WebElement firstRow = chooseFirstRow();
        clickOnEditButton(firstRow);
        sendTextToNameField();
        sendTextToResumeField();
        clickOnSaveButton();
    }

    public void editLastPortfolio() {
        WebElement lastRow = chooseLastRow();
        clickOnEditButton(lastRow);
        sendTextToNameField();
        sendTextToResumeField();
        clickOnSaveButton();
    }

    public void editRandomPortfolio() {
        WebElement randomRow = chooseRandomRow();
        clickOnEditButton(randomRow);
        sendTextToNameField();
        sendTextToResumeField();
        clickOnSaveButton();
    }

    public void deleteFirstPortfolio() {
        WebElement firstRow = chooseFirstRow();
        clickOnDeleteButton(firstRow);
        clickToConfirmDelete();
    }

    public void deleteLastPortfolio() {
        WebElement lastRow = chooseLastRow();
        clickOnDeleteButton(lastRow);
        clickToConfirmDelete();
    }

    public void deleteRandomPortfolio() {
        WebElement randomRow = chooseRandomRow();
        clickOnDeleteButton(randomRow);
        clickToConfirmDelete();
    }
}
