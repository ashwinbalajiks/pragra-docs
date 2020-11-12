package com.testing.pages;

import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

  WebDriver driver;

  /**
   * Below example is demonstrating the Implicit wait
   * Might not wait for the seconds we mentioned, because if the next step is ready to execute, it will execute
   * In the below example, it needs to find element and send keys. So when it find the search box element ready, it will sendkeys the value
   * If you want your execution to hold for some time then you need to use "Thread.sleep"
   */
  public void implicitWaitMethod() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, SECONDS);
    //Maximize the window
    driver.manage().window().maximize();
    // Access the URL
    driver.get("http://automationpractice.com");
    // if element found within 20 seconds,it will execute the below step
    // if element is not found within 20 seconds, exception will be thrown
    driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Shirts");
    driver.quit();
  }

  /**
   * Below is just one example to demonstrate the Explicit wait
   * We can have different kind of Expected conditions.
   * Please refer to https://www.selenium.dev/documentation/en/webdriver/waits/#expected-conditions
   */
  public void explicitWaitMethod(){
    driver = new ChromeDriver();
    //Maximize the window
    driver.manage().window().maximize();
    // Access the URL
    driver.get("http://automationpractice.com");
    WebElement element = (new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id,'block_top_menu')]/ul/li[3]"))));
    element.click();
  }

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
    SeleniumWaits seleniumWaits = new SeleniumWaits();
    seleniumWaits.implicitWaitMethod();
    seleniumWaits.explicitWaitMethod();
  }
}
