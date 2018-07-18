package allUser;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.AllUsersPage;
import pages.DashboardPage;
import pages.IndexSliderPage;
import pages.LoginPage;

public class AllUsersPageTest {

    private static LoginPage loginPage;
    private static AllUsersPage allUsersPage;
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
         allUsersPage = dashboardPage.clickOnAllUsersPage();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddNewUser() {
        allUsersPage.addUser();
    }
    
    @Test
    public void testEditFirstUser(){
        allUsersPage.editFirstUser();
    }
    
     @Test
    public void testEditLastUser(){
        allUsersPage.editLastUser();
    }
    
     @Test
    public void testEditRandomUser(){
        allUsersPage.editRandomUser();
    }
    
     @Test
    public void testDeleteFirstUser(){
        allUsersPage.deleteFirstUser();
    }
    
      @Test
    public void testDeleteLastUser(){
        allUsersPage.deleteLastUser();
    }
    
      @Test
    public void testDeleteRandomUser(){
        allUsersPage.deleteRandomUser();
    }
    
      @Test
    public void testResetRandomUserPassword(){
        allUsersPage.randomResetPassButton();
    }
}
