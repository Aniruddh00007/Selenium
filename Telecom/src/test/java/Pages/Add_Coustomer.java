package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Add_Coustomer {

	
	 WebDriver driver;

	    // Constructor
	   public Add_Coustomer(WebDriver driver) {
		   this.driver = driver;
	   }
	   // Locators
	   By addCoustomer = By.linkText("Add Customer");
	   By done = By.id("done");
	   By Pending=  By.id("pending");
	   By FirstName =By.id("fname");
	   By LastName = By.id("lname");
	   By Email = By.id("email");
	   By Address = By.name("addr");
	   By Contact =  By.id("telephoneno");
	   By Submit = By.name("submit");
	   By Reset = By.className("alt");  
	   
	   
	   // Actions 

	   public void clickAddCustomer() {
	       driver.findElement(addCoustomer).click();
	   }

	   public void clickDone() {
	       driver.findElement(done).sendKeys(Keys.SPACE);
	   }

	   public void clickPending() {
		   driver.findElement(Pending).sendKeys(Keys.SPACE);
	   }

	   public void enterFirstName(String fname) {
	       driver.findElement(FirstName).sendKeys(fname);
	   }

	   public void enterLastName(String lname) {
	       driver.findElement(LastName).sendKeys(lname);
	   }

	   public void enterEmail(String email) {
	       driver.findElement(Email).sendKeys(email);
	   }

	   public void enterAddress(String address) {
	       driver.findElement(Address).sendKeys(address);
	   }

	   public void enterContact(String contact) {
	       driver.findElement(Contact).sendKeys(contact);
	   }

	   public void clickSubmit() {
	       driver.findElement(Submit).click();
	   }

	   public void clickReset() {
	       driver.findElement(Reset).click();
	   }
}
