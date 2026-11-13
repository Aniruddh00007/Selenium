package prisha;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	

		  public void loginTest(ChromeDriver driver) {
		 
	
		 driver.findElement(By.cssSelector("i.fa-regular")).click();
		 driver.findElement(By.name("email")).sendKeys("Aniruddh122@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("test1");
		 driver.findElement(By.cssSelector("button.btn")).click();
		 
		  }
		 
	}

