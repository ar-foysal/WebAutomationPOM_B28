package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup {
    HomePage homePage = new HomePage();
    @Test
    public void testHomePageTitle(){
        homePage.loadAnWebPage((homePage.home_page_url));
        Assert.assertEquals(homePage.getPageTitle(), homePage.home_page_title);
    }
}
