
package pages;

import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Page{
    
    public void clickOnNewCommentsCategory(){
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/a/div"));
    }
    
     public void clickOnNewTasksCategory(){
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div/a/div"));
    }
     
      public void clickOnNewOrdersCategory(){
        clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[3]/div/a/div"));
    }
      
      public void clickOnSupportTicketsCategory(){
          clickOnElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[4]/div/a/div"));
      }
      
      public void clickOnCubesSchoolAdminHomePage(){
          clickOnElement(By.xpath("//*[@id=\"wrapper\"]/nav/div[1]/a"));
      }
      
      public IndexSliderPage clickOnIndexSlider(){
          clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/a"));
          return PageFactory.initElements(getDriver(), IndexSliderPage.class);
      }
}
