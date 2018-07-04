
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

public class IndexSliderTest {
    
    private static LoginPage loginPage;
    private static IndexSliderPage indexSliderPage;
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
        indexSliderPage = dashboardPage.clickOnIndexSlider();
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testAddNewIndexSlide() {
        for(int i = 0; i < 5; i++){
        indexSliderPage.addIndexSlide();
        }
    }
    
    @Test
    public void testDragAndDropFirstRow(){
        indexSliderPage.confirmDragAndDropFirstRow();
    }
    
    @Test
    public void testEditFirstSlide(){
        indexSliderPage.editFirstIndexSlide();
    }
    
    @Test
    public void testEditLastSlide(){
        indexSliderPage.editLastIndexSlide();
    }
    
    @Test
    public void testEditRandomSlide(){
        indexSliderPage.editRandomIndexSlide();
    }
    
     @Test
    public void testDeleteFirstSlide(){
        indexSliderPage.deleteFirstIndexSlide();
    }
    
     @Test
    public void testDeleteLastSlide(){
        indexSliderPage.deleteLastIndexSlide();
    }
    
     @Test
    public void testDeleteRandomSlide(){
        indexSliderPage.deleteRandomIndexSlide();
    }
}
