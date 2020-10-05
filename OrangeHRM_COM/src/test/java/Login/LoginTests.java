package Login;

import Setup.SetupTests;
import org.testng.annotations.Test;
import projectObject.DashboardPage;

public class LoginTests extends SetupTests {

    //TestNG annotation
    @Test

    public void testLogin() throws InterruptedException
    {
        String username = "Admin";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword ( "admin123");

        // Handler for dashboard page
        DashboardPage dashboardPage =loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();

    }
}
