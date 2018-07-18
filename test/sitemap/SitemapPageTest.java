package sitemap;

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
import pages.SitemapPage;

public class SitemapPageTest {

    private static LoginPage loginPage;
    private static SitemapPage sitemapPage;
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
        sitemapPage = dashboardPage.clickOnSitemapPage();
    }

    @After
    public void tearDown() {
    }

   
    @Test
    public void testAddSitemapPage(){
    sitemapPage.addSitemapPage();
    }
    
     @Test
    public void testEditFirstSitemapPage(){
    sitemapPage.editFirstSitemapPage();
    } 
    
    @Test
    public void testEditLastSitemapPage(){
    sitemapPage.editLastSitemapPage();
    } 
    
    @Test
    public void testEditRandomSitemapPage(){
    sitemapPage.editRandomSitemapPage();
    } 
    
    @Test
    public void testDefleteFirstSitemapPage(){
    sitemapPage.deleteFirstSitemapPage();
    } 
    
    @Test
    public void testDefleteLastSitemapPage(){
    sitemapPage.deleteLastSitemapPage();
    } 
    
    @Test
    public void testDefleteRandomSitemapPage(){
    sitemapPage.deleteRandomSitemapPage();
    } 
}
