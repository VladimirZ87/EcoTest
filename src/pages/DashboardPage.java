
package pages;

import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Page{
    
    public IndexSliderPage goToIndexSlider(){
        clickOnElement(By.xpath("//*[@id=\"side-menu\"]/li[2]/a"));
        return PageFactory.initElements(getDriver(), IndexSliderPage.class);
    }
    
    
}
