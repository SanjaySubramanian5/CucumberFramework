package org.objectrepository;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookLocators {
	
	public FacebookLocators() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAccount;
	
	@FindBys(@FindBy(name = "firstname"))
	private WebElement firstName;
	
	@FindAll({@FindBy(name = "lastname"), @FindBy(id = "u_2_d_OT")})
	private WebElement surName;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileNo;
	
	@FindBy(name = "reg_passwd__")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}

	@FindBy(name = "birthday_day")
	private WebElement day;
	
	@FindBy(name = "birthday_month")
	private WebElement month;
	
	@FindBy(name = "birthday_year")
	private WebElement year;
	
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement male;
	
	@FindBy(name = "websubmit")
	private WebElement signUp;
	
	
	

}
