package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressesPage {
  private WebDriver driver;
  private WebDriverWait webDriverWait;

  public DressesPage(WebDriver driver){
    this.driver = driver;
    this.webDriverWait = new WebDriverWait(this.driver, 30);
    By dressElement = By.xpath("//div[@id=\"block_top_menu\"]/ul/li[2]");
    driver.findElement(dressElement).click();
    WebElement element = (new WebDriverWait(driver, 10).until(
        ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"subcategories\"]/p"))));
  }
}
