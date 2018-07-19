package ContactInfo;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.ContactInfoPage;
import pages.DashboardPage;
import pages.IndexSliderPage;
import pages.LoginPage;

public class ContactInfoTest {

    private static LoginPage loginPage;
    private static ContactInfoPage contactInfoPage;
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
        contactInfoPage = dashboardPage.clickOnContactInfoPage();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddNewContactInfo() {
        contactInfoPage.addNewContactInfo();
    }
    
    @Test
    public void testFirstPreviewContactInfo(){
        contactInfoPage.previewFirstContactInfo();
    }
    
    @Test
    public void testLastPreviewContactInfo(){
        contactInfoPage.previewLastContactInfo();
    }

    @Test
    public void testPreviewRandomContactInfo(){
        contactInfoPage.previewRandomContactInfo();
    }
    
    @Test
    public void testEditFirstContactInfo(){
        contactInfoPage.editFirstContactInfo();
    }

    @Test
    public void testEditLastContactInfo(){
        contactInfoPage.editLastContactInfo();
    }
    
    @Test
    public void testEditRandomContactInfo(){
        contactInfoPage.editRandomContactInfo();
    }
    
    @Test
    public void testDeleteFirstContactInfo(){
        contactInfoPage.deleteFirstContactInfo();
    }
    
    @Test
    public void testDeleteLastContactInfo(){
        contactInfoPage.deleteLastContactInfo();
    }
    
    @Test
    public void testDeleteRandomContactInfo(){
        contactInfoPage.deleteRandomContactInfo();
    }
}
