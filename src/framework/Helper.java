package framework;

import org.openqa.selenium.WebDriver;


public class Helper {
    
     public static int getRandomInteger() {
        return (int) (Math.random()* 1000);
    }
    
    public static int getRandomInteger(int range) {
        return (int) (Math.random() * range);
    }
    
    public static String getRandomText() {
        return "VTest-" + getRandomInteger();
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
    
    public static String getRandomLatitude(){
        return "44." + getRandomInteger(100000000);
    }
    
    public static String getRandomLongitude(){
        return "20." + getRandomInteger(100000000);
    }
    
    public static String getRandomPhoneNumber(){
        return "+381" + getRandomInteger(100000000);
    }
    
    public static String getWorkingHours(){
        return "08 - 19";
    }
    
     public static String getRandomAddressNumber(){
        return "" + getRandomInteger(100);
    }
     
      public static String getRandomZoomNumber(){
        return "" + getRandomInteger(10);
    }
}
