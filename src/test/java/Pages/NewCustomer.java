package Pages;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {

	WebDriver driver;
	NewCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,NewCustomer.class);
	}
     public String input = "f";
     @FindBy(how = How.LINK_TEXT, using = "New Customer")
     WebElement NewCustomerLink ;

     @FindBy(how = How.NAME, using = "name")
      WebElement Name ;

     @FindBy(how = How.XPATH, using = "//input[@type='radio']")
     WebElement male ;
     
     @FindBy(how = How.XPATH, using = "//input[@type='radio']")
     WebElement female ;

     @FindBy(how = How.XPATH, using = "//input[@onkeyup='validatedob();']")
     WebElement DateOfBirth;

     @FindBy(how = How.NAME, using = "addr")
      WebElement Address ;

     @FindBy(how = How.NAME, using = "city")
     WebElement City;

     @FindBy(how = How.NAME, using = "state")
     WebElement State;

     @FindBy(how = How.NAME, using = "pnno")
     WebElement PinNo;

     @FindBy(how = How.NAME, using = "telephoneno")
     WebElement TelephoneNo;

     @FindBy(how = How.NAME, using = "emailid")
     WebElement EmailId;

     @FindBy(how = How.NAME, using = "password")
     WebElement Password;

     
     public void clickNewCustomerLink(){
    	 NewCustomerLink.click();
     }
     public void setName(String name){
    	 Name.sendKeys(name);
     }
     
     public void selectGender(String gender){
    	 if(male.getAttribute("value")==gender){
    		 male.click();
    	 }
    	 else{
    		 female.click();
    	 }
     }
     
     public void setDateOfBirth(String dob){
    	 DateOfBirth.sendKeys(dob);
     }
     
     public void setAddress(String address){
    	 Address.sendKeys(address); 
     }
     
     public void setCity(String city){
    	 City.sendKeys(city);
     }
     
     public void setState(String state){
    	 State.sendKeys(state); 
     }
     
     public void setPin(String pin){
    	 PinNo.sendKeys(pin);
     }
     
     public void setTelephoneNo(String tel){
    	 TelephoneNo.sendKeys(tel);
     }
     
     public void setEmailId(String email){
    	 EmailId.sendKeys(email); 
     }
     
     public void setPassword(String password){
    	 Password.sendKeys(password);
     }  
}
