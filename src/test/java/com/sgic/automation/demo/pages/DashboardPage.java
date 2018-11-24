package com.sgic.automation.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage extends BasePage{
  
  private WebElement dashboardLabel = driver.findElement(By.xpath(".//h1[text()[normalize-space() = 'Dashboard']]"));
  Actions builder = new Actions(driver);
  private WebElement menuAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
  private WebElement menuUserManagement = driver.findElement(By.id("menu_admin_UserManagement"));
  private WebElement menuUsers = driver.findElement(By.id("menu_admin_viewSystemUsers"));
  
//  private WebElement menuAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
//  private WebElement menuUserManagement = driver.findElement(By.id("menu_admin_UserManagement"));
//  private WebElement menuUsers = driver.findElement(By.id("menu_admin_viewSystemUsers"));

  public DashboardPage(WebDriver driver) {
    super(driver);
  }
  
  public UserManagementPage userMgmt() {

    try {
      builder.moveToElement(menuAdmin).build().perform();
//      menuAdmin.click();
      Thread.sleep(500);
      builder.moveToElement(menuUserManagement).build().perform();
//      menuUserManagement.click();
      Thread.sleep(500);
      builder.moveToElement(menuUsers).build().perform();
      menuUsers.click();
//      menuUsers.click();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
   
    
    return new UserManagementPage(driver);
  }
  
  public boolean isDashboardDisplayed() {
    boolean flag = false;
    
    try {
      dashboardLabel.isDisplayed();
      flag = true;
    }
    catch (Exception e) {
      flag = false;
    }
    return flag;
  }

}
