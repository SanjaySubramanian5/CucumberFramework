package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;
import org.excelutils.ExcelData;
import org.objectrepository.FacebookLocators;
import org.openqa.selenium.By;
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

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	BaseClass base = new BaseClass();
	FacebookLocators locators = new FacebookLocators();
    
    @Given("User launches the facebook application {string}")
    public void user_launches_the_facebook_application(String url) {
    base.launchApplication(url);
	
	}

    @Given("User validates the Url {string}")
    public void user_validates_the_url(String url) {
    	String currentUrl = base.currentUrl();
		if(currentUrl.equals(url)) {
			System.out.println("Application is launched");
		}
		else {
			System.out.println("Application is not launched");
		}
    }
	@Given("User clicks Create a new account")
	public void user_clicks_create_a_new_account() throws InterruptedException {
		base.button(locators.getCreateNewAccount());
		base.ss("beflist");  
	}
	@When("User enters the first name with one dim list")
	public void user_enters_the_first_name_with_one_dim_list(DataTable dataTable)  {
		List<String> list = dataTable.asList();
		String fName = list.get(0);
		base.sendText(locators.getFirstName(), fName);; 
	}

	@When("User enters the sur name with one dim map")
	public void user_enters_the_sur_name_with_one_dim_map(DataTable dataTable) {
		Map<String, String> m = dataTable.asMap(String.class, String.class);
		String lName = m.get("lastname1");
		base.sendText(lName, locators.getSurName());
	}

	@When("User enters the mobile number {string}")
	public void user_enters_the_mobile_number(String mob)  {
		base.sendText(mob, locators.getMobileNo());  
	}

	@When("User enters the password")
	public void user_enters_the_password() throws IOException, InterruptedException {

        base.waits(locators.getPassword());
		base.sendText("san1234", locators.getPassword());  

		
		
			}

	@When("User enters the date of birth with one dim map")
	public void user_enters_the_date_of_birth_with_one_dim_map(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		String Day = asMap.get("Day");
		String Month = asMap.get("Month");
		String Year = asMap.get("Year");
        base.selectVisibleText(locators.getDay(), Day);
		base.selectVisibleText(locators.getMonth(), Month);
		base.selectVisibleText(locators.getYear(), Year);
	}
	

	@When("User select the gender")
	public void user_select_the_gender() {
	    base.button(locators.getMale());
	}
	@When("User take screenshot")
	public void user_take_screenshot() {
	base.ss("AfterList");
	}
	

	@Then("User clicks Signup")
	public void user_clicks_signup() {
		    base.button(locators.getSignUp());

	}
	@When("User enters the details {string} {string} {string} {string} {string} {string} {string}")
	public void user_enters_the_details(String firstname, String lastname, String mobileno, String pwd, String Day, String Month, String Year) {
		
		base.ss("befscenario");
		base.sendText(firstname, locators.getFirstName()); 
		base.sendText(lastname, locators.getSurName()); 
		base.sendText(mobileno, locators.getMobileNo()); 
		base.sendText(pwd, locators.getPassword()); 
		base.selectVisibleText(locators.getDay(), Day); 
		base.selectVisibleText(locators.getMonth(), Month);
	    base.selectVisibleText(locators.getYear(), Year);
	}
	@When("User takes Screenshot")
	public void user_takes_screenshot() {
		base.ss("aftscenario");

	}
//	@When("User enters the details {string}")
//	public void user_enters_the_details(String datas) throws Exception {
//		
//		File f = new File("C:\\Users\\Franky\\CucumberFramework\\src\\test\\resources\\Properties\\ExcelDatas.property");
//		FileInputStream file = new FileInputStream(f);
//		Properties prop = new Properties();
//		prop.load(file);
//		
//		String data = (String) prop.get(datas);
//		System.out.println(data);
//	   List<String> str = ExcelData.excelData1(data);
//       for(int i=0; i<str.size(); i++) {
//		   String cells = str.get(i);
//		   if(cells.equals("San"))
//		   {
//			   String fname = cells;
//			   WebElement firstName = driver.findElement(By.name("firstname"));  
//			   base.sendText(fname, firstName);
//			
//		   }
//		   else if(cells.equals("Subramanian")){
//			   String lname = cells;
//			   WebElement surName = driver.findElement(By.name("lastname"));  
//			   base.sendText(lname, surName);
//		   }
//		   
//		   else if(cells.equals("vicky123sanjay@gmail.com")){
//			   String mobno = cells;
//			   WebElement mobileNo = driver.findElement(By.name("reg_email__"));  
//			   base.sendText(mobno, mobileNo);
//		   }
//		   else if(cells.equals("san123")){
//			   String pwd = cells;
//			   WebElement password = driver.findElement(By.name("reg_passwd__"));  
//				base.sendText(pwd, password);
//		   }  
//       }
//     	
		
     		   
 	  
//		}
	   

	
		



}
