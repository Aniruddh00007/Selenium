package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Add_TerrifPlan;
import Pages.openbrowser;

public class Add_TerrifPlan_test {

	
	 WebDriver driver ;
	 openbrowser op = new openbrowser();
	 
	 @BeforeMethod
	 public void Launchbrowser() {
		 
		 op.Launch();
		 driver = op.driver;
	 }
	 @Test
	 public void  Add_terrifTest() {
		 
		 Add_TerrifPlan tf = new Add_TerrifPlan(driver);
		 
		 tf.clickAddTerrif();
		 tf.Monthlyrent("3000");
		 tf.LocalMinuterent("120");
		 tf.InternationalMinute("40");
		 tf.Smspack("200");
		 tf.localPerMInt("00.50");
		 tf.InterPMint("00.50");
		 tf.SMSperchr("2.00");
		 tf.clickSubmit();
		// tf.clickReset();
	 }
	 @AfterMethod
		public void tearDown() {
	        //driver.quit();
	       
	    }
		
}
