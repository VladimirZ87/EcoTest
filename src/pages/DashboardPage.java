
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
      
      public PhotoGalleriesPage clickOnPhotoGalleries(){
          clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a"));
          return PageFactory.initElements(getDriver(), PhotoGalleriesPage.class);
      }
      
      public SitemapPage clickOnSitemapPage(){
          clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a"));
          return PageFactory.initElements(getDriver(), SitemapPage.class);
      }
      
      public AllUsersPage clickOnAllUsersPage(){
          clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/ul/li[1]/a"));
          return PageFactory.initElements(getDriver(), AllUsersPage.class);
      }
      
      public NewUserPage clickNewUserPage(){
          clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/ul/li[2]/a"));
          return PageFactory.initElements(getDriver(), NewUserPage.class);
      }
      
      public ContactInfoPage clickOnContactInfoPage(){
          clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/a"));
          return PageFactory.initElements(getDriver(), ContactInfoPage.class);
      }
      
      public AllPortfolios clickOnAllPortfoliosPage(){
          clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/ul/li[1]/a"));
          return PageFactory.initElements(getDriver(), AllPortfolios.class);
      }
      
      public NewPortfoliosPage clickOnNewPortfoliosPage(){
          clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/ul/li[2]/a"));
          return PageFactory.initElements(getDriver(), NewPortfoliosPage.class);
      }
      
       public CategoriesPortfolioPage clickOnCategoriesPortfolioPage(){
          clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/ul/li[3]/a"));
          return PageFactory.initElements(getDriver(), CategoriesPortfolioPage.class);
      }
}
