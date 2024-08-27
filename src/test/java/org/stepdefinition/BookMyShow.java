package org.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {
	public static WebDriver driver;
	public static WebDriverWait wait;
	@Given("Launch the book my show application")
	public void launch_the_book_my_show_application() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		driver = new EdgeDriver(options);
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	    
	}

	@Given("validate the application")
	public void validate_the_application() {
	    String cUrl = driver.getCurrentUrl();
	    if(cUrl.startsWith("https://in.bookmyshow.com/")) {
	    	System.out.println("The Application is launched");
	    }
	    else {
	    	System.out.println("Application is not launched");
	    }  
	}

	@Then("User enters the City")
	public void user_enters_the_city() {
	  WebElement textBox = driver.findElement(By.xpath("//input[@placeholder='Search for your city']"));
	  textBox.sendKeys("chennai");
	  }

	@Then("User Select the City")
	public void user_select_the_city()  {
		WebElement city = driver.findElement(By.xpath("//strong[text() ='Chennai']"));
		city.click();
		
	}

	@When("User Click on movies")
	public void user_click_on_movies()  {
	  WebElement movies = driver.findElement(By.xpath("//a[text()='Movies']"));
	  if(movies.isDisplayed()) {
	  movies.click();
	  }
//	  WebElement seeAll = driver.findElement(By.xpath("(//div[text()='See All ›'])[1]"));
//	  seeAll.click();
	}

	@When("User Select the Tamil language")
	public void user_select_the_tamil_language()  {
	    WebElement tamil = driver.findElement(By.xpath("//div[text()='English']/preceding::div[text()='Languages']/following::div[text()='Tamil']/following::div[text()='English']/preceding::div[@class='sc-133848s-2 sc-7naidv-0 VcBOb']/div[text()='Tamil']"));
	    tamil.click();
	}

	@Then("User Validate the Tamil language")
	public void user_validate_the_tamil_language() {
	   List<WebElement> languageCensor = driver.findElements(By.xpath("//div[@class=\"sc-7o7nez-0 ifFqly\"]/following::div[@class=\"sc-7o7nez-0 ifFqly\"]"));
	   for(WebElement x : languageCensor) {
		   String text = x.getText();
		   if(text.equals("Tamil")) {
			   System.out.println("The movie language is "+text);
		   }
	   }
	   
	}

	@When("User Select the Action Genre")
	public void user_select_the_action_genre() {
	    WebElement genres = driver.findElement(By.xpath("//div[text()='Genres']"));
	    genres.click();
	    WebElement action = driver.findElement(By.xpath("//div[@class=\"sc-133848s-2 sc-7naidv-0 VcBOb\"]/div[text()='Action']"));
	    action.click();
	}

	@When("User Select the Format 3D")
	public void user_select_the_format_3d() throws InterruptedException {
	    WebElement format = driver.findElement(By.xpath("//div[text()='Format']"));
	    format.click();
	    WebElement threeD = driver.findElement(By.xpath("//div[@class='sc-133848s-2 sc-7naidv-0 VcBOb']/div[text()='3D']"));
	    threeD.click();
	}
	@When("User Select the Tamil Movie")
	public void user_select_the_tamil_movie() {
	WebElement tamilMovie = driver.findElement(By.xpath("//div[text()='Demonte Colony 2 - Vengeance Of The Unholy']")); 
	tamilMovie.click();
	}
	
	@When("User Select the Telugu language")
	public void user_select_the_telugu_language() {
		 WebElement telugu = driver.findElement(By.xpath("//div[text()='English']/preceding::div[text()='Languages']/following::div[text()='Tamil']/following::div[text()='English']/preceding::div[@class='sc-133848s-2 sc-7naidv-0 VcBOb']/div[text()='Telugu']"));
		    telugu.click();
		
	}

	@Then("User Validate the Telugu language")
	public void user_validate_the_telugu_language()  {
		  List<WebElement> languageCensor = driver.findElements(By.xpath("//div[@class='sc-7o7nez-0 ifFqly']/following::div[@class='sc-7o7nez-0 ifFqly']"));
		   for(WebElement x : languageCensor) {
			   String text = x.getText();
			   if(text.equals("Telugu")) {
				   System.out.println("The movie language is "+text);
			   }
		   }
	}
	@When("User Select the Telugu Movie")
	public void user_select_the_telugu_movie() {
				WebElement teluguMovie = driver.findElement(By.xpath("//div[text()='Mr. Bachchan - The Only Hope']")); 
				teluguMovie.click();	
	}

	@When("User Select the Malayalam language")
	public void user_select_the_malayalam_language() {
		WebElement malayalam = driver.findElement(By.xpath("//div[text()='English']/preceding::div[text()='Languages']/following::div[text()='Tamil']/following::div[text()='English']/preceding::div[@class='sc-133848s-2 sc-7naidv-0 VcBOb']/div[text()='Malayalam']"));
	    malayalam.click();
	}

	@Then("User Validate the Malayalam language")
	public void user_validate_the_malayalam_language() {
		  List<WebElement> languageCensor = driver.findElements(By.xpath("//div[@class=\"sc-7o7nez-0 ifFqly\"]/following::div[@class=\"sc-7o7nez-0 ifFqly\"]"));
		   for(WebElement x : languageCensor) {
			   String text = x.getText();
			   if(text.equals("Malayalam")) {
				   System.out.println("The movie language is "+text);
			   }
		   }
		   

	}

	@When("User Select the Mlayalam Movie")
	public void user_select_the_mlayalam_movie() {
	    WebElement malayalamMovie = driver.findElement(By.xpath("//div[text()='Nunakkuzhi']"));
	    malayalamMovie.click();
	}

	@When("User Select the English language")
	public void user_select_the_english_language() {
		WebElement english = driver.findElement(By.xpath("//div[text()='English']/preceding::div[text()='Languages']/following::div[text()='Tamil']/following::div[text()='English']/preceding::div[@class='sc-133848s-2 sc-7naidv-0 VcBOb']/div[text()='English']"));
	    english.click();
	}

	@Then("User Validate the English language")
	public void user_validate_the_english_language() {
		  List<WebElement> languageCensor = driver.findElements(By.xpath("//div[@class=\"sc-7o7nez-0 ifFqly\"]/following::div[@class=\"sc-7o7nez-0 ifFqly\"]"));
		   for(WebElement x : languageCensor) {
			   String text = x.getText();
			   if(text.equals("English")) {
				   System.out.println("The movie language is "+text);
			   }
		   }
		   

	}

	@When("User Select the English Movie")
	public void user_select_the_english_movie() {
		WebElement malayalamMovie = driver.findElement(By.xpath("//div[text()='Deadpool & Wolverine']"));
	    malayalamMovie.click();
	
	}









}
