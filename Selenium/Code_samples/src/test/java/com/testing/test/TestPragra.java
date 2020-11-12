package com.testing.test;

import com.testing.pages.DressesPage;
import com.testing.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPragra {

  private WebDriver driver;

  @BeforeTest
  public void setDriver() {
    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://automationpractice.com");
    Assert.assertTrue(driver.getTitle().contains("My Store"));
  }

  @Test
  public void LoginTest() {
    LoginPage loginPage = new LoginPage(this.driver);
    loginPage.setUsername("pragra.training@gmail.com");
    loginPage.setPassword("pragra123");
    loginPage.loginSubmit();
  }

  @Test
  public void DressPageTest(){
    DressesPage dressesPage = new DressesPage(this.driver);
  }
}
