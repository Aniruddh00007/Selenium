package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ChromeDriver driver= new ChromeDriver();
//		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
//		driver.findElement(By.name("firstName")).sendKeys("Aniruddh");
//		driver.findElement(By.name("lastName")).sendKeys("Shaw");
//		driver.findElement(By.name("phone")).sendKeys("7347319826");
//		driver.findElement(By.id("userName")).sendKeys("ani12@gmail.com");
//		driver.findElement(By.name("address1")).sendKeys("Sector  47 D");		
//		driver.findElement(By.name("city")).sendKeys("Chandigarh");	
//		driver.findElement(By.name("state")).sendKeys("Chandigarh");	
//		driver.findElement(By.name("postalCode")).sendKeys("160074");	
//		driver.findElement(By.name("country")).sendKeys("India");
//		
//		
//		driver.findElement(By.name("email")).sendKeys("Ani");
//		driver.findElement(By.name("password")).sendKeys("Ani001");
//		driver.findElement(By.name("confirmPassword")).sendKeys("Ani001");
//		
//		driver.findElement(By.name("submit")).click();
		
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		 
		driver.findElement(By.id("vfb-7-1")).click();
		
		driver.findElement(By.id("vfb-6-2")).click();
	}
	

}
