package framework;

import org.openqa.selenium.WebDriver;


public class Helper {
    
     public static int getRandomInteger() {
        return (int) (Math.random() * 1000);
    }
    
    public static int getRandomInteger(int range) {
        return (int) (Math.random() * range);
    }
    
    public static String getRandomText() {
        return "VladaTest-" + getRandomInteger();
    }

    public static String getRandomUrl() {
        return "http://".concat(getRandomText()).concat(".rs");
    }

    public static WebDriver initWebDriver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static String getRandomEmail(){
        return getRandomText().concat("@gmail.com");
    }
    
}
