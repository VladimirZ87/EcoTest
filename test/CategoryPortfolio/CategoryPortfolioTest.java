package CategoryPortfolio;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.CategoriesPortfolioPage;
import pages.DashboardPage;
import pages.IndexSliderPage;
import pages.LoginPage;

public class CategoryPortfolioTest {

    private static LoginPage loginPage;
    private static CategoriesPortfolioPage categoriesPortfolioPage;
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
        categoriesPortfolioPage = dashboardPage.clickOnCategoriesPortfolioPage();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void TestCreateCategory() {
        categoriesPortfolioPage.createNewPortfolio();
    }
    
    @Test 
    public void editFirstCategory(){
        categoriesPortfolioPage.editFirstPortfolio();
    }
    
      @Test 
    public void editLastCategory(){
        categoriesPortfolioPage.editLastPortfolio();
    }
    
      @Test 
    public void editRandomCategory(){
        categoriesPortfolioPage.editRandomPortfolio();
    }
    
       @Test 
    public void deleteFirstCategory(){
        categoriesPortfolioPage.deleteFirstPortfolio();
    }
    
       @Test 
    public void deleteLastCategory(){
        categoriesPortfolioPage.deleteLastPortfolio();
    }
    
       @Test 
    public void deleteRandomCategory(){
        categoriesPortfolioPage.deleteRandomPortfolio();
    }
}
