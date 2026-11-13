package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class workk {
 @Test
	 public void open() {
		 

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://www.amazon.com/");

	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Die cast model");
	        
	 
	 }
	
	 
	
	 
}
