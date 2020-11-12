package com.testing.pages;

import static java.lang.System.exit;

import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

  private WebDriver driver;
  private WebDriverWait webDriverWait;

  By emailAddress = By.xpath("//*[@id=\"email\"]");
  By password = By.xpath("//*[@id=\"passwd\"]");
  By submitButton = By.xpath("//*[@id=\"SubmitLogin\"]");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    this.webDriverWait = new WebDriverWait(this.driver, 30);
    By signInElement = By.xpath("//div[@class='header_user_info']");
    driver.findElement(signInElement).click();
    WebElement element = (new WebDriverWait(driver, 10).until(
        ExpectedConditions.presenceOfElementLocated(submitButton)));
  }

  public void setUsername(String username) {
    driver.findElement(emailAddress).sendKeys(username);
  }

  public void setPassword(String passwordValue) {
    driver.findElement(password).sendKeys(passwordValue);
  }

  public void loginSubmit() {
    driver.findElement(submitButton).click();
  }

  public void signInStatus() {

  }
}
