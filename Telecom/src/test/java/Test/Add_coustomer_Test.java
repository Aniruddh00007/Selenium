package Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Add_Coustomer;
import Pages.openbrowser;

public class Add_coustomer_Test {
	   WebDriver driver;
  	openbrowser op = new openbrowser();
	
	
	@BeforeMethod
	
	 public void launchBrowser() {
		op.Launch();
		driver = op.driver;
	}
	
	@Test
	public void coustomerTest() {
		Add_Coustomer ad = new Add_Coustomer(driver); 
		ad.clickAddCustomer();
		//ad.clickPending();
		ad.clickDone();
		ad.enterFirstName("Amrit");
		ad.enterLastName("Singh");
		ad.enterEmail("Ammy@gmail.com");
		ad.enterAddress("Ghaziabad");
		ad.enterContact("9867343651");
		ad.clickSubmit();
		//ad.clickReset();
	}
	@AfterMethod
	public void tearDown() {
        //driver.quit();
       
    }
	
	
}
