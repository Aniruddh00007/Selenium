package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_TerrifPlan {

	
	WebDriver driver;
	
	   public  Add_TerrifPlan(WebDriver driver) {
		   
		   this.driver = driver;
	   }
	   
	   //Locators   Add Tariff Plan
	   
 		   By AddTerrif = By.linkText("Add Tariff Plan");
 		
 		   By MonthlyRental = By.id("rental1");
 		   By  LocalM = By.id("local_minutes");
 		   By InternationalM=  By.id("inter_minutes");
 		   By SMSPack =By.id("sms_pack");
 		   By LocalPerMinutesCharges = By.id("minutes_charges");
 		   By InternationalPerMinutesCharge = By.id("inter_charges");
 		   By SMSPerCharges = By.name("sms_charges");
 		 
 		   By Submit = By.name("submit");
 		   By Reset = By.className("alt");  
 		   
 		   
 		   // Methods
 		   
 		   public void clickAddTerrif() {
 			   driver.findElement(AddTerrif).click();
 		   }
 		   
 		   public void Monthlyrent(String Mrent) {
 			   driver.findElement(MonthlyRental).sendKeys(Mrent);
 		   }
 		   
 		  public void LocalMinuterent(String localMinute) {
 			  
			   driver.findElement(LocalM).sendKeys(localMinute);
		   }
 		 public void InternationalMinute(String interMinute) {
			   driver.findElement(InternationalM).sendKeys(interMinute);
		   }
 		 public void Smspack(String sms) {
			   driver.findElement(SMSPack).sendKeys(sms);
		   }
 		 public void localPerMInt(String localpmint) {
			   driver.findElement(LocalPerMinutesCharges).sendKeys(localpmint);
		   }
 		 public void InterPMint(String interpmint) {
			   driver.findElement(InternationalPerMinutesCharge).sendKeys(interpmint);
		   }
 		 public void SMSperchr(String smsprcharge) {
			   driver.findElement(SMSPerCharges).sendKeys(smsprcharge);
		   }

 		   public void clickSubmit() {
 		       driver.findElement(Submit).click();
 		   }

 		   public void clickReset() {
 		       driver.findElement(Reset).click();
 		   }
 }
