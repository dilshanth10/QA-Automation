package com.sgic.automation.demo.test;

import static org.testng.Assert.assertEquals;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.sgic.automation.demo.util.Log;

public class LoginTest extends BaseTest{
  
  private static Logger logger = LogManager.getLogger(LoginTest.class);
  
  boolean flag = false;

  @Test
  public void testOrangeHRM() throws Exception {
//    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.get(prop.getProperty("baseUrl"));
    Log.startTestCase();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOGIN Panel'])[1]/following::span[1]")).click();
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    logger.log(Level.INFO, "********* Entered username **********");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    logger.log(Level.INFO, "********* Entered password **********");
    driver.findElement(By.id("btnLogin")).click();
    logger.log(Level.INFO, "********* Login button clicked **********");
    Thread.sleep(2000);
    driver.findElement(By.id("welcome")).click();
    Thread.sleep(2000);
    try {
      assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Admin");
    } catch (Error e) {
      logger.log(Level.ERROR, "Failed to find mesasge");
    }
    driver.findElement(By.linkText("Logout")).click();
    Log.endTestCase();
  }
  
}