package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IBaseClass {
    public static WebDriver driver ;
    public static Wait wait;
    public static Actions action;
    static JavascriptExecutor js;
    public static Select select;
	public void browserLaunch() {
		
		WebDriverManager.edgedriver().setup();
		   EdgeOptions options = new EdgeOptions();
		   options.addArguments("--start-maximized");
		   driver = new EdgeDriver(options);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   action = new Actions(driver);
		   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   js = (JavascriptExecutor)driver;
	
	}

	public void launchApplication(String url) {
		driver.get(url);
		
	}

	public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String title() {
    String title = driver.getTitle();
    return title;
	}

	public void close() {
     driver.close();		
	}

	public void sendText(WebElement ele, String inputText) {
     ele.sendKeys(inputText);		
	}

	public String extractText(WebElement ele) {
		String extractText = ele.getText();
		return extractText;
	}

	public String extractAttribute(WebElement ele, String attribute) {
        String attributeValue = ele.getAttribute(attribute);
		return attributeValue;
	}

	public void button(WebElement ele) {
        ele.click();		
	}

	public void forward() {
       driver.navigate().forward();		
	}

	public void backward() {
		driver.navigate().back();
		
	}

	public void refresh() {
       driver.navigate().refresh();
		
	}

	public boolean displayed(WebElement ele) {
      boolean displayed = ele.isDisplayed();
		return displayed;
	}

	public void mouseOver(WebElement ele) {
       action.moveToElement(ele).build().perform();;		
	}

	public void sendText(String inputText, WebElement ele) {
        action.sendKeys(ele, inputText).build().perform();	
	}

	public void button(WebElement ele, int i) {
		action.click(ele);
		
	}

	public void button(int i, WebElement ele) {
          	js.executeScript("arguments[0].click()", ele)	;
	}

	public void sendText(String inputText, WebElement ele, int i) {
         js.executeScript("arguments[0].setAttribute('value', '"+inputText+"')", ele);
		 
	}

	public void selectVisibleText(WebElement ele, String visibleText) {
           select = new Select(ele);
          select.selectByVisibleText(visibleText);
		
	}

	public void selectIndex(WebElement ele, int index) {
		  select = new Select(ele);
          select.selectByIndex(index);
		
	}

	public void selectValue(String value, WebElement ele) {
		  select = new Select(ele);
          select.selectByValue(value);
		
	}

	public boolean selected(WebElement ele) {
        boolean selected = ele.isSelected();
		return selected;
	}

	public void ss(String imgName) {
      TakesScreenshot ts = (TakesScreenshot)driver;
      File src = ts.getScreenshotAs(OutputType.FILE);
      File des = new File("C:\\Users\\Franky\\CucumberFramework\\target\\Screenshot\\"+imgName+".png");
      try {
		FileUtils.copyFile(src, des);
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}

	public void waits(WebElement ele) {
      wait.until(ExpectedConditions.visibilityOf(ele));		
	}

}
