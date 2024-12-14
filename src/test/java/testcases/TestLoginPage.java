package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class TestLoginPage extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @BeforeMethod
    public void setup_class(){
        loginPage.navigateToLoginPage();
    }

    @AfterMethod
    public void logoutUser(){
        accountPage.doLogout();
    }


    @Test
    public void testLoginWithValidCredentials(){
        loginPage.writeOneElement(loginPage.email_input_field, loginPage.email);
        loginPage.writeOneElement(loginPage.password_input_field, loginPage.password);
        loginPage.clickOneElement(loginPage.login_btn);
        Assert.assertTrue(accountPage.getElement(accountPage.account_text).isDisplayed());
        Assert.assertTrue(accountPage.getElement(accountPage.welcome_text).isDisplayed());
        Assert.assertTrue(accountPage.getElement(accountPage.logout_btn).isDisplayed());

    }

    @Test
    public void testLoginWithInValidCredentials(){
        loginPage.writeOneElement(loginPage.email_input_field, loginPage.email);
        loginPage.writeOneElement(loginPage.password_input_field, "12345");
        loginPage.clickOneElement(loginPage.login_btn);
        Assert.assertTrue(loginPage.getElement(loginPage.error_msg).isDisplayed());

    }
}
