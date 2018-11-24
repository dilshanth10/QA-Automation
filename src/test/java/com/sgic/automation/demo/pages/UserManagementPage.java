package com.sgic.automation.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserManagementPage extends BasePage{
  
  private WebElement userMgmtLabel = driver.findElement(By.xpath(".//h1[text()[normalize-space() = 'System Users']]"));

  public UserManagementPage(WebDriver driver) {
    super(driver);
  }

  public boolean isUserManagementPageDisplayed() {
    boolean flag = false;
    
    try {
      userMgmtLabel.isDisplayed();
      flag = true;
    }
    catch (Exception e) {
      flag = false;
    }
    return flag;
  }
}
