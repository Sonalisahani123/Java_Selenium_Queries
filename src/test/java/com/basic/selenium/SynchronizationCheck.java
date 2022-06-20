package com.basic.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationCheck {
	
	WebDriver driver;
	
	
	@Test
	public void implicitywaitCheck()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void  explicitywaitCheck()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("");
	    driver.manage().window().maximize();
	    @SuppressWarnings("deprecation")
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(20));
	    WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'COMPOSE')]")));
	    element.click();
	}
	
	
	@Test
	public void  fluentWaitCheck()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("");
	    driver.manage().window().maximize();
	    
	    //Declare and initialise a fluent wait
	    FluentWait wait = new FluentWait(driver);
	  //Specify the timout of the wait
	    wait.withTimeout(Duration.ofMillis(5000));
	  //Sepcify polling time
	    wait.pollingEvery(Duration.ofMillis(250));
	    
	  //Specify what exceptions to ignore
	    wait.ignoring(NoSuchElementException.class);
	    
	  //This is how we specify the condition to wait on.
	  //This is what we will explore more in this chapter
	  wait.until(ExpectedConditions.alertIsPresent());
	    
	}
}
