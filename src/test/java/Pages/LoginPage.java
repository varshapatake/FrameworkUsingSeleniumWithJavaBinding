package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, LoginPage.class);
	}
	
	@FindBy(how=How.NAME,using="uid")
	WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	
	@FindBy(how=How.NAME,using="btnLogin")
	WebElement submit;
	
	public void setEmail(String strEmail){
		username.sendKeys(strEmail);
	}
		 
    public void setPassword(String strPassword){
		password.sendKeys(strPassword);
	}

	public void submit()
	{
		submit.click();
	}
}
