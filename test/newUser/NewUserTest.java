package newUser;

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
import pages.NewUserPage;

public class NewUserTest {

    private static LoginPage loginPage;
    private static NewUserPage newUserPage;
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
        loginPage.quitDriver();
    }

    @Before
    public void setUp() {
        newUserPage = dashboardPage.clickNewUserPage();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCreateNewUser() {
        newUserPage.createNewUser();
    }
}
