package prisha;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {
  
	
	public void cartTest(ChromeDriver driver) {
		
		driver.findElement(By.cssSelector("i.fa-regular")).click();
		
		 driver.findElement(By.cssSelector("i.fa-solid")).click();
		 driver.findElement(By.cssSelector("button.btn")).click();
		
	}
}

