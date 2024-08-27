package org.baseclass;

import org.openqa.selenium.WebElement;

public interface IBaseClass {
  public void browserLaunch();
  public void launchApplication(String url);
  public String currentUrl();
  public String title();
  public void close();
  public void sendText(WebElement ele, String inputText);
  public String extractText( WebElement ele);
  public String extractAttribute(WebElement ele, String attribute);
  public void button(WebElement ele);
  public void forward();
  public void backward();
  public void refresh();
  public boolean displayed(WebElement ele);
  public void mouseOver(WebElement ele);
  public void sendText(String inputText, WebElement ele);
  public void button(WebElement ele, int i);
  public void button(int i, WebElement ele);
  public void sendText(String inputText, WebElement ele, int i);
  public void selectVisibleText(WebElement ele, String visibleText);
  public void selectIndex(WebElement ele, int index);
  public void selectValue(String value, WebElement ele);
  public void waits(WebElement ele);
  public boolean selected(WebElement ele);
  public void ss(String imgName);
 
  
  
  
  
  
	
}
