package com.sgic.automation.demo.pagetests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.sgic.automation.demo.pages.DashboardPage;
import com.sgic.automation.demo.pages.LoginPage;
import com.sgic.automation.demo.pages.UserManagementPage;

public class DashboardTest extends BaseTest{
  
    
  @Test
  public void verifyUserManagement() {
    LoginPage LoginPage = new LoginPage(driver);
    DashboardPage dashboardPage = LoginPage.login("Admin", "admin123");
    UserManagementPage userManagementPage = dashboardPage.userMgmt();

    assertTrue(userManagementPage.isUserManagementPageDisplayed());
    
  }
}
