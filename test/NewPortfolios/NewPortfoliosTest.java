
package NewPortfolios;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.DashboardPage;
import pages.IndexSliderPage;
import pages.LoginPage;
import pages.NewPortfoliosPage;


public class NewPortfoliosTest {
    
     private static LoginPage loginPage;
    private static NewPortfoliosPage newPortfoliosPage;
    private static DashboardPage dashboardPage;
   
    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login();
    }
    
    @AfterClass
    public static void tearDownClass() throws InterruptedException {
        Thread.sleep(3000);
//        loginPage.quitDriver();
    }
    
    @Before
    public void setUp() {
        newPortfoliosPage = dashboardPage.clickOnNewPortfoliosPage();
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void tesCreateNewPortfolio() {
    newPortfoliosPage.createNewPortfolio();
    }
}
