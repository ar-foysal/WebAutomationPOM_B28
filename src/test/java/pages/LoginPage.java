package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public String login_page_url = "https://www.opencart.com/index.php?route=account/login";
    public String login_page_title = "OpenCart - Account Login";
    public By email_input_field = By.xpath("//input[@id='input-email']");

    public By password_input_field = By.xpath("//input[@id='input-password']");

    public By login_btn = By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']");

    public By error_msg = By.xpath("//div[@class='alert alert-danger']");

    public By error_msg_close = By.xpath("//button[normalize-space()='×']");

    public String email= "jijah37159@iminko.com";
    public String password = "123456a";



    public void navigateToLoginPage(){
        HomePage homePage = new HomePage();
        loadAnWebPage(homePage.home_page_url);
        clickOneElement(homePage.loginButton);
    }
}
