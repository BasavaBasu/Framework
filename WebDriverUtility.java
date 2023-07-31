package com.trello.qsp.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility 
{
	
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public boolean verifyCompleteTitle(WebDriver driver,String expectedTitle)
	{
		return new WebDriverWait(driver,  Duration.ofSeconds(5)).until(ExpectedConditions.titleIs(expectedTitle));
	}

	public boolean verifyPartialTitle(WebDriver driver,String partialTitle)
	{
		return new WebDriverWait(driver,  Duration.ofSeconds(5)).until(ExpectedConditions.titleContains(partialTitle));
	}
	
	public WebDriver switchFrameAsElement(WebDriver driver,WebElement frameElement)
	{
		return driver.switchTo().frame(frameElement);
	}
	
	public void alertButton(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void activeelementSendkeys(WebDriver   driver,String value )
	{
		driver.switchTo().activeElement().sendKeys(value);
	}
	public WebElement explicitWait(WebDriver driver,WebElement element)
	{
		  return new WebDriverWait(driver, Duration.ofSeconds(10000)).until(ExpectedConditions.elementToBeClickable(element));
}}
