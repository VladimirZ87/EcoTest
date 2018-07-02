
package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AbstractPage {
    
    private static WebDriver driver = null;
    private static WebDriverWait wait = null;
    
    protected WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "C:/Users/SmartPC/Downloads/Chrome Driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();        
        }
        return driver;
    }
    
    protected WebDriverWait getWait(WebDriver driver){
        if(wait == null){
            wait = new WebDriverWait(getDriver(), 10);
        }
        return wait;
    }
    
    public void quitDriver(){
        getDriver().quit();
    }
}
