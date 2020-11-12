package com.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

  static WebDriver driver;

  public static void main(String[] args) throws InterruptedException {
    SeleniumLocators seleniumLocators = new SeleniumLocators();

    /**
     * Below is a sample of finding locator with "Name" using By class
     */
    seleniumLocators.initialCall();
    WebElement searchBoxElementByName = driver.findElement(By.name("search_query"));
    searchBoxElementByName.sendKeys("Test the Name locator");
    Thread.sleep(5000);
    driver.quit();

    /**
     * Below is a sample of finding locator with "ID" using By class
     */
    seleniumLocators.initialCall();
    WebElement searchBoxElementById = driver.findElement(By.id("search_query_top"));
    searchBoxElementById.sendKeys("Test the ID locator");
    Thread.sleep(5000);
    driver.quit();

    /**
     * Below is a sample of finding locator with "Link Text" using By class
     */
    seleniumLocators.initialCall();
    WebElement searchBoxElementByLinktext = driver.findElement(By.linkText("Contact us"));
    searchBoxElementByLinktext.click();
    Thread.sleep(5000);
    driver.quit();

    /**
     * Below is a sample of finding locator with "Link Text" using By class
     */
    seleniumLocators.initialCall();
    WebElement searchBoxElementByPartialLinktext = driver.findElement(By.partialLinkText("Contact"));
    searchBoxElementByPartialLinktext.click();
    Thread.sleep(5000);
    driver.quit();

    /**
     * Below is a sample of finding locator with "XPath" using By class
     */
    seleniumLocators.initialCall();
    WebElement searchBoxElementByXpath = driver.findElement(By.xpath("//input[@id=\"search_query_top\"]"));
    searchBoxElementByXpath.sendKeys("Test the Xpath locator");
    Thread.sleep(5000);
    driver.quit();

  /**
   * Below is a sample of finding locator with "CSS" using By class
   */
  seleniumLocators.initialCall();
  WebElement searchBoxElementByCss = driver.findElement(By.cssSelector("#search_query_top"));
    searchBoxElementByCss.sendKeys("Test the CSS Selector");
    Thread.sleep(5000);
    driver.quit();
}

  public void initialCall() {
    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://automationpractice.com");
  }
}
