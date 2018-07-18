package AllPortfolios;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.AllPortfolios;
import pages.DashboardPage;
import pages.IndexSliderPage;
import pages.LoginPage;

public class AllPortfoliosTest {

    private static LoginPage loginPage;
    private static AllPortfolios allPortfolios;
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
        allPortfolios = dashboardPage.clickOnAllPortfoliosPage();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddNewPortfolio() {
        allPortfolios.addNewPortfolio();
    }

    @Test
    public void testPreviewFirstPortfolio() {
        allPortfolios.previewFistPortfolio();
    }

    @Test
    public void testPreviewLastPortfolio() {
        allPortfolios.previewLastPortfolio();
    }

    @Test
    public void testPreviewRanodmPortfolio() {
        allPortfolios.previewRandomPortfolio();
    }

    @Test
    public void testEditFirstPortfolio() {
        allPortfolios.editFirstPortfolio();
    }

    @Test
    public void testEditLastPortfolio() {
        allPortfolios.editLastPortfolio();
    }

    @Test
    public void testEditRandomPortfolio() {
        allPortfolios.editRandomPortfolio();
    }

    @Test
    public void testDeleteFirstPortfolio() {
        allPortfolios.deleteFirstPortfolio();
    }

    @Test
    public void testDeleteLastPortfolio() {
        allPortfolios.deleteLastPortfolio();
    }

    @Test
    public void testDeleteRandomPortfolio() {
        allPortfolios.deleteRandomPortfolio();
    }
}
