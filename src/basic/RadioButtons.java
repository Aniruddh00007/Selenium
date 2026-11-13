package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver =  new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		
		//radio buttons
	    // driver.findElement(By.id("vfb-7-1")).click();
	    driver.findElement(By.id("vfb-7-2")).click();
	     //driver.findElement(By.id("vfb-7-3")).click();
		
	     
	     //checkbox
		driver.findElement(By.id("vfb-6-0")).click();
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		
	}

}
