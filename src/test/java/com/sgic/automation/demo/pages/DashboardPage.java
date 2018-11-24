package com.sgic.automation.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage{
  
  private WebElement dashboardLabel = driver.findElement(By.xpath(".//h1[text()[normalize-space() = 'Dashboard']]"));

  public DashboardPage(WebDriver driver) {
    super(driver);
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
