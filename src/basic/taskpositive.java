package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskpositive {
  
	
	public static void main(String args[]) {
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.navigate().to("https://demo.guru99.com/telecom/addcustomer.php");
		
		//driver.findElement(By.id("done")).click();
		driver.findElement(By.name("fname")).sendKeys("Aniruddh");
		driver.findElement(By.name("lname")).sendKeys("Kumar");
		driver.findElement(By.name("emailid")).sendKeys("anshu7973@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Delhi");
		driver.findElement(By.name("telephoneno")).sendKeys("8146432981");
		 driver.findElement(By.name("submit")).click();
		
	}
}

 // webdriverwait