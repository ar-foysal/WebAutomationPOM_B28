package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.DriverSetup.getDriver;

public class BasePage {
    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public void clickOneElement(By locator){
        getElement(locator).click();
    }

    public void writeOneElement(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public void loadAnWebPage(String url){
        getDriver().get(url);
    }

    public String getPageTitle(){
        return getDriver().getTitle();
    }
}
