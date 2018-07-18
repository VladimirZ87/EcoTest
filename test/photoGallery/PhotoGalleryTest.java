package photoGallery;

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
import pages.PhotoGalleriesPage;

public class PhotoGalleryTest {

    private static LoginPage loginPage;
    private static PhotoGalleriesPage photoGalleriesPage;
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
          photoGalleriesPage = dashboardPage.clickOnPhotoGalleries();
    }

    @After
    public void tearDown() {
    }

    
     @Test
     public void testAddNewPhotoGallery() {
         photoGalleriesPage.addPhotoGaleryItem();
     }
     
     @Test 
     public void testEditFirstPhotoGalleriesItem(){
         photoGalleriesPage.editFirstPhotoGaleryItem();
     }
     
     @Test 
     public void testEditLastPhotoGalleriesItem(){
         photoGalleriesPage.editLastPhotoGaleryItem();
     }
     
     @Test 
     public void testEditRandomPhotoGalleriesItem(){
         photoGalleriesPage.editRandomPhotoGaleryItem();
     }
     
     @Test 
     public void testDeleteFirstPhotoGalleriesItem(){
         photoGalleriesPage.deleteFirstPhotoGaleryItem();
     }
     
     @Test 
     public void testDeleteLastPhotoGalleriesItem(){
         photoGalleriesPage.deleteLastPhotoGaleryItem();
     }
//     
     @Test 
     public void testDeleteRandomPhotoGalleriesItem(){
         photoGalleriesPage.deleteRandomPhotoGaleryItem();
     }
     
     @Test 
     public void testPreviewRandomPhotoGalleriesItem(){
         photoGalleriesPage.previewRandomGalleryPhoto();
     }
}
