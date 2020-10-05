package projectObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //Create a webDriver for this class

    private WebDriver driver;

    //Create a constructor
    public DashboardPage(WebDriver driver)
    {
     this.driver = driver;
    }

    //Locate elements
    private By welcomeAdmin = By.cssSelector("#branding a:nth-child(2)");
    private By logout = By.linkText("Logout");

    //Functions to interact with elements
    public void clickWelcomeAdmin() throws InterruptedException
    {
        //wait for 10 seconds before executing the action
        Thread.sleep(1000);
        driver.findElement(welcomeAdmin).click();
    }

     public LoginPage clickLogout() throws InterruptedException
     {
         //wait for 3 seconds before executing the action
         Thread.sleep(3000);
         driver.findElement(logout).click();
         return new LoginPage(driver);
     }

}
